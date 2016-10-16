package com.guohualife.pm.requirement.bo.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Component;

import com.guohualife.pm.requirement.bo.AnalysisExcelBO;
import com.guohualife.pm.requirement.dto.RequirementInfoDTO;
import com.guohualife.pm.requirement.mode.EstimateWorkLoad;
import com.guohualife.pm.requirement.mode.InFactWorkLoad;
import com.guohualife.pm.requirement.mode.Requirement;
import com.guohualife.pm.requirement.mode.RequirementEstimatedate;
import com.guohualife.pm.requirement.mode.RequirementInFactdate;
import com.guohualife.pm.requirement.mode.RequirementWorkDetail;
import com.guohualife.pm.requirement.mode.RequirementPople;
import com.guohualife.pm.util.PubFun;

/**
 * 创建时间：2015-8-15 下午2:49:02 项目名称：TestSpringVersion3.3
 * 
 * @author lilongfei
 * @version 1.0
 * @since JDK 1.5.0_15 文件名称：AnalysisNewExcelBOImpl.java 类说明：
 */
@Component
public class AnalysisNewExcelBOImpl implements AnalysisExcelBO {

	private Log logger = LogFactory.getLog(AnalysisNewExcelBOImpl.class);

	public List<RequirementInfoDTO> ImportWorkData(String inFilePath) {
		/** 得到excel中数据 */
		String[][] bArray = getdata(inFilePath);
		/** 将数据封装到DTO对象中 */
		List<RequirementInfoDTO> list = new ArrayList<RequirementInfoDTO>();
		for (int i = 0; i < bArray.length; i++) {
			RequirementInfoDTO trequirementInfoDTO = submitInfo(bArray[i]);
			if (trequirementInfoDTO != null) {
				list.add(trequirementInfoDTO);
			}
		}
		return list;
	}

	/**
	 * 传入参数值Filepath，将excel中的内容解析至一个二维数组中 解析jir平台获取的内容模板
	 * 
	 */
	public String[][] getdata(String FilesPath) {

		HSSFWorkbook jirWorkbook;
		HSSFSheet requirementSheet;
		String[][] bArray = null;
		try {
			InputStream in = new FileInputStream(FilesPath);
			jirWorkbook = new HSSFWorkbook(in);
			requirementSheet = jirWorkbook.getSheetAt(0);

			int reqRows = requirementSheet.getPhysicalNumberOfRows();

			logger.info("本次处理条数：" + reqRows);

			bArray = new String[reqRows - 1][15];
			for (int i = 1; i < reqRows; i++) {
				HSSFRow reqRow = requirementSheet.getRow(i);
				for (short j = 0; j < 15; j++) {
					HSSFCell beginT = reqRow.getCell(j);
					if (j == 8) {
						if (beginT != null && ("`".equals(beginT.getStringCellValue().replaceAll(" ", ""))
								|| "".equals(beginT.getStringCellValue().replaceAll(" ", ""))
								|| beginT.getStringCellValue() == null)) {
							System.out.println("需求号为空不作处理");
							j = 15;
						}
					}
					if (j >= 0 && j <= 3 || j >= 7 && j <= 8 || j == 5 || j == 11 || j == 14) {
						if (beginT != null) {
							String CellValue = beginT.getStringCellValue().replace(" ", "");
							if (!"`".equals(CellValue) && !"".equals(CellValue) && CellValue != null) {
								bArray[i - 1][j] = CellValue.replaceAll(" ", "");
								System.out.print("第" + (i - 1) + "行" + bArray[i - 1][j] + " ");
							}
						}
					} else if (j == 6 || j == 4 || j >= 9 && j <= 10 || j == 12) {
						try {
							if (beginT != null) {
								if (HSSFCell.CELL_TYPE_NUMERIC == beginT.getCellType()) {
									if (HSSFDateUtil.isCellDateFormatted(beginT)) {
										Date CellValue = beginT.getDateCellValue();
										if (!"`".equals(CellValue) && !"".equals(CellValue) && CellValue != null) {
											SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
											bArray[i - 1][j] = format
													.format(reqRow.getCell((short) j).getDateCellValue());
											System.out.print("第" + (i - 1) + "行" + bArray[i - 1][j] + " ");
										}
									}
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					} else if (j == 13) {
						try {
							if (beginT != null) {
								if (HSSFCell.CELL_TYPE_NUMERIC == beginT.getCellType()) {
									if (!"`".equals(beginT.getNumericCellValue())
											&& !"".equals(beginT.getNumericCellValue())
											&& beginT.getNumericCellValue() != 0.0) {
										bArray[i - 1][j] = new DecimalFormat("0.0")
												.format(reqRow.getCell((short) j).getNumericCellValue());
										System.out.print("第" + (i - 1) + "行" + bArray[i - 1][j] + " ");
									}
								}
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}
				System.out.println();
			}

		} catch (Exception ex) {
			System.out.println("导入模板异常，请核实数据是否符合要求！");
			ex.printStackTrace();
		}
		return bArray;
	}

	public RequirementInfoDTO submitInfo(String bArray[]) {
		RequirementInfoDTO requirementInfoDTO = new RequirementInfoDTO();
		InsertRequirement(bArray, requirementInfoDTO);
		InsertRequireEstdate(bArray, requirementInfoDTO);
		InsertRequireInfactdate(bArray, requirementInfoDTO);
		InsertEstWorkLoad(bArray, requirementInfoDTO);
		InsertInFactWorkLoad(bArray, requirementInfoDTO);
		InsertInFactWorkLoadDetail(bArray, requirementInfoDTO);
		InsertRequirementPople(bArray, requirementInfoDTO);
		return requirementInfoDTO;
	}

	public RequirementInfoDTO InsertRequirement(String array[], RequirementInfoDTO requirementInfoDTO) {

		Requirement tRequirement = new Requirement();
		if (array[0] != null && array[0] != "") {
			tRequirement.setSeqno(array[0]);
		}
		if (array[1] != null && array[1] != "") {
			tRequirement.setRequirementdescribe(array[1]);
		}
		if (array[2] != null && array[2] != "") {
			tRequirement.setTasktype(array[2]);
		}
		if (array[3] != null && array[3] != "") {
			tRequirement.setIntroducer(array[3]);
		}
		if (array[5] != null && array[5] != "") {
			tRequirement.setIflinelist(array[5]);
		}
		if (array[7] != null && array[7] != "") {
			tRequirement.setIfurgency(array[7]);
		}
		if (array[8] != null && array[8] != "") {
			tRequirement.setRequirementno(array[8]);
		}
		if (array[11] != null && array[11] != "") {
			tRequirement.setItprinclpal(array[11]);
		}
		if (array[13] != null && array[13] != "") {
			tRequirement.setDemandpriority(array[13]);
		}
		if (array[14] != null && array[14] != "") {
			tRequirement.setModule(array[14]);
		}

		tRequirement.setMakedate(PubFun.getCurrentDate());
		tRequirement.setMaketime(PubFun.getCurrentTime());
		tRequirement.setModifydate(PubFun.getCurrentDate());
		tRequirement.setModifytime(PubFun.getCurrentTime());
		requirementInfoDTO.setRequirement(tRequirement);
		return requirementInfoDTO;
	}

	public void InsertRequireEstdate(String array[], RequirementInfoDTO requirementInfoDTO) {
		RequirementEstimatedate tRequireEstdate = new RequirementEstimatedate();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if (array[9] != null && array[9] != "") {
				tRequireEstdate.setEstimateuatteststartdate(format.parse(array[9]));
			}
			if (array[10] != null && array[10] != "") {
				tRequireEstdate.setEstimatefinishdate(format.parse(array[10]));
			}

			tRequireEstdate.setMakedate(PubFun.getCurrentDate());
			tRequireEstdate.setMaketime(PubFun.getCurrentTime());
			tRequireEstdate.setModifydate(PubFun.getCurrentDate());
			tRequireEstdate.setModifytime(PubFun.getCurrentTime());
			requirementInfoDTO.setRequirementEstimatedate(tRequireEstdate);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public RequirementInfoDTO InsertRequireInfactdate(String array[], RequirementInfoDTO requirementInfoDTO) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		RequirementInFactdate tRequirementInFactdate = new RequirementInFactdate();
		try {
			if (array[4] != null && array[4] != "") {
				tRequirementInFactdate.setInfactuatteststartdate(format.parse(array[4]));
			}
			if (array[6] != null && array[6] != "") {
				tRequirementInFactdate.setInfactuattestenddate(format.parse(array[6]));
			}
			if (array[12] != null && array[12] != "") {
				tRequirementInFactdate.setInfactdattestenddate(format.parse(array[12]));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		tRequirementInFactdate.setMakedate(PubFun.getCurrentDate());
		tRequirementInFactdate.setMaketime(PubFun.getCurrentTime());
		tRequirementInFactdate.setModifydate(PubFun.getCurrentDate());
		tRequirementInFactdate.setModifytime(PubFun.getCurrentTime());
		requirementInfoDTO.setRequirementInFactdate(tRequirementInFactdate);
		return requirementInfoDTO;
	}

	public RequirementInfoDTO InsertEstWorkLoad(String array[], RequirementInfoDTO requirementInfoDTO) {
		EstimateWorkLoad tEstimateWorkLoad = new EstimateWorkLoad();
		tEstimateWorkLoad.setMakedate(PubFun.getCurrentDate());
		tEstimateWorkLoad.setMaketime(PubFun.getCurrentTime());
		tEstimateWorkLoad.setModifydate(PubFun.getCurrentDate());
		tEstimateWorkLoad.setModifytime(PubFun.getCurrentTime());
		requirementInfoDTO.setEstimateWorkLoad(tEstimateWorkLoad);
		return requirementInfoDTO;
	}

	public RequirementInfoDTO InsertInFactWorkLoad(String array[], RequirementInfoDTO requirementInfoDTO) {
		InFactWorkLoad tInFactWorkLoad = new InFactWorkLoad();
		tInFactWorkLoad.setMakedate(PubFun.getCurrentDate());
		tInFactWorkLoad.setMaketime(PubFun.getCurrentTime());
		tInFactWorkLoad.setModifydate(PubFun.getCurrentDate());
		tInFactWorkLoad.setModifytime(PubFun.getCurrentTime());
		requirementInfoDTO.setInFactWorkLoad(tInFactWorkLoad);
		return requirementInfoDTO;
	}

	public RequirementInfoDTO InsertRequirementPople(String array[], RequirementInfoDTO requirementInfoDTO) {
		RequirementPople tRequirementPople = new RequirementPople();
		tRequirementPople.setMakedate(PubFun.getCurrentDate());
		tRequirementPople.setMaketime(PubFun.getCurrentTime());
		tRequirementPople.setModifydate(PubFun.getCurrentDate());
		tRequirementPople.setModifytime(PubFun.getCurrentTime());
		requirementInfoDTO.setRequirementPople(tRequirementPople);
		return requirementInfoDTO;
	}


	public RequirementInfoDTO InsertInFactWorkLoadDetail(String array[], RequirementInfoDTO requirementInfoDTO) {
		RequirementWorkDetail tRequirementNewWorkDetail = new RequirementWorkDetail();
		tRequirementNewWorkDetail.setMakedate(PubFun.getCurrentDate());
		tRequirementNewWorkDetail.setMaketime(PubFun.getCurrentTime());
		tRequirementNewWorkDetail.setModifydate(PubFun.getCurrentDate());
		tRequirementNewWorkDetail.setModifytime(PubFun.getCurrentTime());
		List<RequirementWorkDetail> requirementNewWorklist = new ArrayList<RequirementWorkDetail>();
		requirementNewWorklist.add(tRequirementNewWorkDetail);
		requirementInfoDTO.setRequirementNewWorkDetail(requirementNewWorklist);
		return requirementInfoDTO;
	}
}
