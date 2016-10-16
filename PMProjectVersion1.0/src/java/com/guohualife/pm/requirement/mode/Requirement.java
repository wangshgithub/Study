package com.guohualife.pm.requirement.mode;

import java.math.BigDecimal;
import java.util.Date;

public class Requirement {
    /** 需求表主键*/
    private BigDecimal requirementid;
    /** 需求号*/
    private String requirementno;
    /** 任务类型：Req为需求;BUG为bug*/
    private String tasktype;
    /** Jira号*/
    private String seqno;
    /** 需求提出部门*/
    private String department;
    /** 需求提出人*/
    private String introducer;
    /** IT负责人*/
    private String itprinclpal;
    /** 预估工作量*/
    private BigDecimal estimatework;
    /** 需求描述*/
    private String requirementdescribe;
    /** 需求所属模块*/
    private String module;
    /** 需求优先级*/
    private String demandpriority;
    /** 是否为紧急需求*/
    private String ifurgency;
    /** 结算年月*/
    private String settlemonth;
    /** 是否结算*/
    private String ifsettle;
    /** 是否下发开工单*/
    private String ifstartwork;
    /** 是否提供上线单*/
    private String iflinelist;
    /** 是否dat必测项*/
    private String ifdatmust;
    /** 实际总工作量*/
    private BigDecimal sumworkload;
    /** 操作日期*/
    private Date makedate;
    /** 操作时间*/
    private String maketime;
    /** 修改日期*/
    private Date modifydate;
    /** 修改时间*/
    private String modifytime;

    public BigDecimal getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(BigDecimal requirementid) {
        this.requirementid = requirementid;
    }

    public String getRequirementno() {
        return requirementno;
    }

    public void setRequirementno(String requirementno) {
        this.requirementno = requirementno == null ? null : requirementno.trim();
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype == null ? null : tasktype.trim();
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer == null ? null : introducer.trim();
    }

    public String getItprinclpal() {
        return itprinclpal;
    }

    public void setItprinclpal(String itprinclpal) {
        this.itprinclpal = itprinclpal == null ? null : itprinclpal.trim();
    }

    public BigDecimal getEstimatework() {
        return estimatework;
    }

    public void setEstimatework(BigDecimal estimatework) {
        this.estimatework = estimatework;
    }

    public String getRequirementdescribe() {
        return requirementdescribe;
    }

    public void setRequirementdescribe(String requirementdescribe) {
        this.requirementdescribe = requirementdescribe == null ? null : requirementdescribe.trim();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getDemandpriority() {
        return demandpriority;
    }

    public void setDemandpriority(String demandpriority) {
        this.demandpriority = demandpriority == null ? null : demandpriority.trim();
    }

    public String getIfurgency() {
        return ifurgency;
    }

    public void setIfurgency(String ifurgency) {
        this.ifurgency = ifurgency == null ? null : ifurgency.trim();
    }

    public String getSettlemonth() {
      return settlemonth;
    }
    
    public void setSettlemonth(String settlemonth) {
      this.settlemonth = settlemonth == null ? null : settlemonth.trim();
    }
    
    public String getIfsettle() {
        return ifsettle;
    }

    public void setIfsettle(String ifsettle) {
        this.ifsettle = ifsettle == null ? null : ifsettle.trim();
    }

    public String getIfstartwork() {
        return ifstartwork;
    }

    public void setIfstartwork(String ifstartwork) {
        this.ifstartwork = ifstartwork == null ? null : ifstartwork.trim();
    }

    public String getIflinelist() {
        return iflinelist;
    }

    public void setIflinelist(String iflinelist) {
        this.iflinelist = iflinelist == null ? null : iflinelist.trim();
    }

    public String getIfdatmust() {
        return ifdatmust;
    }

    public void setIfdatmust(String ifdatmust) {
        this.ifdatmust = ifdatmust == null ? null : ifdatmust.trim();
    }

    public BigDecimal getSumworkload() {
        return sumworkload;
    }

    public void setSumworkload(BigDecimal sumworkload) {
        this.sumworkload = sumworkload;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getMaketime() {
        return maketime;
    }

    public void setMaketime(String maketime) {
        this.maketime = maketime == null ? null : maketime.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }
}