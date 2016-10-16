package com.guohualife.pm.requirement.mode;

import java.math.BigDecimal;
import java.util.Date;

public class EstimateWorkLoad {
    /** 需求预估工作量表主键*/
    private BigDecimal requireoldworkid;
    /** 外键，关联需求表主键*/
    private BigDecimal requirementid;
    /** 预估分析工作量*/
    private BigDecimal estimateanalysisworkload;
    /** 预估开发工作量*/
    private BigDecimal estimatedevelopworkload;
    /** 预估测试工作量*/
    private BigDecimal estimatetestworkload;
    /** 预估总工作量*/
    private BigDecimal estimatesumworkload;
    /** 操作日期*/
    private Date makedate;
    /** 操作时间*/
    private String maketime;
    /** 修改日期*/
    private Date modifydate;
    /** 修改时间*/
    private String modifytime;

    public BigDecimal getRequireoldworkid() {
        return requireoldworkid;
    }

    public void setRequireoldworkid(BigDecimal requireoldworkid) {
        this.requireoldworkid = requireoldworkid;
    }

    public BigDecimal getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(BigDecimal requirementid) {
        this.requirementid = requirementid;
    }

    public BigDecimal getEstimateanalysisworkload() {
        return estimateanalysisworkload;
    }

    public void setEstimateanalysisworkload(BigDecimal estimateanalysisworkload) {
        this.estimateanalysisworkload = estimateanalysisworkload;
    }

    public BigDecimal getEstimatedevelopworkload() {
        return estimatedevelopworkload;
    }

    public void setEstimatedevelopworkload(BigDecimal estimatedevelopworkload) {
        this.estimatedevelopworkload = estimatedevelopworkload;
    }

    public BigDecimal getEstimatetestworkload() {
        return estimatetestworkload;
    }

    public void setEstimatetestworkload(BigDecimal estimatetestworkload) {
        this.estimatetestworkload = estimatetestworkload;
    }

    public BigDecimal getEstimatesumworkload() {
        return estimatesumworkload;
    }

    public void setEstimatesumworkload(BigDecimal estimatesumworkload) {
        this.estimatesumworkload = estimatesumworkload;
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