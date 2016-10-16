package com.guohualife.pm.requirement.bo;

import java.util.List;

import com.guohualife.pm.requirement.dto.RequirementInfoDTO;

/**  
 * 创建时间：2015-8-6 上午9:41:25  
 * 项目名称：TestSpringVersion3.3  
 * @author lilongfei  
 * @version 1.0   
 * @since JDK 1.5.0_22 
 * 文件名称：ImportDemandInterface.java  
 * 类说明：  
 */
public interface AnalysisExcelBO{
     /**
     *<p>Title: dealdata</p>
     *<p>Description:  </p>
     * @return  
     * @author lilongfei
     * @date 2015-8-12
     */
     public List<RequirementInfoDTO> ImportWorkData(String inFilePath);
}

