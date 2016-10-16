package com.guohualife.pm.requirement.mode;

import java.math.BigDecimal;
import java.util.Date;

public class RequirementPople {
    /** 需求关联人表主键*/
    private BigDecimal requirementrelationid;
    /** 外键，需求表主键*/
    private BigDecimal requirementid;
    /** 需求状态*/
    private String requirementstate;
    /** 需求状态描述*/
    private String stateremark;
    /** 需求负责人用户名*/
    private String principalaccount;
    /** 需求分析人用户名*/
    private String requireanalysisaccount;
    /** 需求开发人用户名*/
    private String requiredevelopaccount;
    /** 需求测试人用户名*/
    private String requiretestaccount;
    /** 操作日期*/
    private Date makedate;
    /** 操作时间*/
    private String maketime;
    /** 修改日期*/
    private Date modifydate;
    /** 操作时间*/
    private String modifytime;

    public BigDecimal getRequirementrelationid() {
        return requirementrelationid;
    }

    public void setRequirementrelationid(BigDecimal requirementrelationid) {
        this.requirementrelationid = requirementrelationid;
    }

    public BigDecimal getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(BigDecimal requirementid) {
        this.requirementid = requirementid;
    }

    public String getRequirementstate() {
        return requirementstate;
    }

    public void setRequirementstate(String requirementstate) {
        this.requirementstate = requirementstate == null ? null : requirementstate.trim();
    }

    public String getStateremark() {
        return stateremark;
    }

    public void setStateremark(String stateremark) {
        this.stateremark = stateremark == null ? null : stateremark.trim();
    }

    public String getPrincipalaccount() {
        return principalaccount;
    }

    public void setPrincipalaccount(String principalaccount) {
        this.principalaccount = principalaccount == null ? null : principalaccount.trim();
    }

    public String getRequireanalysisaccount() {
        return requireanalysisaccount;
    }

    public void setRequireanalysisaccount(String requireanalysisaccount) {
        this.requireanalysisaccount = requireanalysisaccount == null ? null : requireanalysisaccount.trim();
    }

    public String getRequiredevelopaccount() {
        return requiredevelopaccount;
    }

    public void setRequiredevelopaccount(String requiredevelopaccount) {
        this.requiredevelopaccount = requiredevelopaccount == null ? null : requiredevelopaccount.trim();
    }

    public String getRequiretestaccount() {
        return requiretestaccount;
    }

    public void setRequiretestaccount(String requiretestaccount) {
        this.requiretestaccount = requiretestaccount == null ? null : requiretestaccount.trim();
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