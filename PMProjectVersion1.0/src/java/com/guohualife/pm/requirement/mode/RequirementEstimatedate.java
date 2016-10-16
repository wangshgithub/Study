package com.guohualife.pm.requirement.mode;

import java.math.BigDecimal;
import java.util.Date;

public class RequirementEstimatedate {
    /** 需求预估计划表主键*/
    private BigDecimal requirementoldplanid;
    /** 外键，参照需求表主键*/
    private BigDecimal requirementid;
    /** 预估需求分析开始时间*/
    private Date estimateanalysisstartdate;
    /** 预估需求分析结束时间*/
    private Date estimateanalysisenddate;
    /** 预估需求开发开始时间*/
    private Date estimatedevelopstartdate;
    /** 预估需求开发结束时间*/
    private Date estimatedeveloeenddate;
    /** 预估需求dat测试开始时间*/
    private Date estimatedatteststartdate;
    /** 预估需求dat测试结束时间*/
    private Date estimatedattestenddate;
    /** 预估需求uat测试开始时间*/
    private Date estimateuatteststartdate;
    /** 预估需求uat测试结束时间*/
    private Date estimateuattestenddate;
    /** 预估上线时间*/
    private Date estimatefinishdate;
    /** 操作日期*/
    private Date makedate;
    /** 操作时间*/
    private String maketime;
    /** 修改日期*/
    private Date modifydate;
    /** 修改时间*/
    private String modifytime;

    public BigDecimal getRequirementoldplanid() {
        return requirementoldplanid;
    }

    public void setRequirementoldplanid(BigDecimal requirementoldplanid) {
        this.requirementoldplanid = requirementoldplanid;
    }

    public BigDecimal getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(BigDecimal requirementid) {
        this.requirementid = requirementid;
    }

    public Date getEstimateanalysisstartdate() {
        return estimateanalysisstartdate;
    }

    public void setEstimateanalysisstartdate(Date estimateanalysisstartdate) {
        this.estimateanalysisstartdate = estimateanalysisstartdate;
    }

    public Date getEstimateanalysisenddate() {
        return estimateanalysisenddate;
    }

    public void setEstimateanalysisenddate(Date estimateanalysisenddate) {
        this.estimateanalysisenddate = estimateanalysisenddate;
    }

    public Date getEstimatedevelopstartdate() {
        return estimatedevelopstartdate;
    }

    public void setEstimatedevelopstartdate(Date estimatedevelopstartdate) {
        this.estimatedevelopstartdate = estimatedevelopstartdate;
    }

    public Date getEstimatedeveloeenddate() {
        return estimatedeveloeenddate;
    }

    public void setEstimatedeveloeenddate(Date estimatedeveloeenddate) {
        this.estimatedeveloeenddate = estimatedeveloeenddate;
    }

    public Date getEstimatedatteststartdate() {
        return estimatedatteststartdate;
    }

    public void setEstimatedatteststartdate(Date estimatedatteststartdate) {
        this.estimatedatteststartdate = estimatedatteststartdate;
    }

    public Date getEstimatedattestenddate() {
        return estimatedattestenddate;
    }

    public void setEstimatedattestenddate(Date estimatedattestenddate) {
        this.estimatedattestenddate = estimatedattestenddate;
    }

    public Date getEstimateuatteststartdate() {
        return estimateuatteststartdate;
    }

    public void setEstimateuatteststartdate(Date estimateuatteststartdate) {
        this.estimateuatteststartdate = estimateuatteststartdate;
    }

    public Date getEstimateuattestenddate() {
        return estimateuattestenddate;
    }

    public void setEstimateuattestenddate(Date estimateuattestenddate) {
        this.estimateuattestenddate = estimateuattestenddate;
    }

    public Date getEstimatefinishdate() {
        return estimatefinishdate;
    }

    public void setEstimatefinishdate(Date estimatefinishdate) {
        this.estimatefinishdate = estimatefinishdate;
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