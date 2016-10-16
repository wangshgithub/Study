package com.guohualife.pm.requirement.dto;


import java.util.List;

import com.guohualife.pm.requirement.mode.EstimateWorkLoad;
import com.guohualife.pm.requirement.mode.InFactWorkLoad;
import com.guohualife.pm.requirement.mode.Requirement;
import com.guohualife.pm.requirement.mode.RequirementEstimatedate;
import com.guohualife.pm.requirement.mode.RequirementInFactdate;
import com.guohualife.pm.requirement.mode.RequirementWorkDetail;
import com.guohualife.pm.requirement.mode.RequirementPople;

/**  
 * 创建时间：2015-8-13 下午1:40:16  
 * 项目名称：TestSpringVersion3.3  
 * @author lixm  
 * @version 1.0   
 * @since JDK 1.5.0_22 
 * 文件名称：RequirementInfoDTO.java  
 * 类说明：  生成DTO类，将需求相表信息封装至一个DTO类中
 */
public class RequirementInfoDTO {
     /** 预估工作量表*/
     private EstimateWorkLoad estimateWorkLoad;
     /** 实际工作量表*/
     private InFactWorkLoad inFactWorkLoad;
     /** 需求信息表*/
     private Requirement requirement;
     /** 需求预估工作量表*/
     private RequirementEstimatedate requirementEstimatedate;
     /** 需求实际工作量表*/
     private RequirementInFactdate requirementInFactdate;
     /** 需求实际工作量明细表*/
     private List<RequirementWorkDetail> requirementNewWorkDetail;
     /** 需求相关人员表*/
     private RequirementPople requirementPople;
     
     public void setEstimateWorkLoad(EstimateWorkLoad estimateWorkLoad){
       this.estimateWorkLoad = estimateWorkLoad;
     }
     public EstimateWorkLoad getEstimateWorkLoad(){
       return estimateWorkLoad;
     }
     public void setInFactWorkLoad(InFactWorkLoad inFactWorkLoad){
       this.inFactWorkLoad = inFactWorkLoad;
     }
     public InFactWorkLoad getInFactWorkLoad(){
       return inFactWorkLoad;
     }
     public void setRequirement(Requirement requirement){
       this.requirement = requirement;
     }
     public Requirement getRequirement(){
       return requirement;
     }
     public void setRequirementInFactdate(RequirementInFactdate requirementInFactdate){
       this.requirementInFactdate = requirementInFactdate;
     }
     public RequirementInFactdate getRequirementInFactdate(){
       return requirementInFactdate;
     }
     public void setRequirementNewWorkDetail(List<RequirementWorkDetail> requirementNewWorkDetail){
       this.requirementNewWorkDetail = requirementNewWorkDetail;
     }
     public List<RequirementWorkDetail> getRequirementNewWorkDetail(){
       return requirementNewWorkDetail;
     }
     public void setRequirementPople(RequirementPople requirementPople){
       this.requirementPople = requirementPople;
     }
     public RequirementPople getRequirementPople(){
       return requirementPople;
     }
     public void setRequirementEstimatedate(RequirementEstimatedate requirementEstimatedate){
       this.requirementEstimatedate = requirementEstimatedate;
     }
     public RequirementEstimatedate getRequirementEstimatedate(){
       return requirementEstimatedate;
     }
}

