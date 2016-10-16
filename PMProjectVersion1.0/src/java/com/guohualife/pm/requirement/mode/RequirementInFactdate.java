package com.guohualife.pm.requirement.mode;

import java.math.BigDecimal;
import java.util.Date;

public class RequirementInFactdate {
    /** 需求实际计划表主键*/
    private BigDecimal requirementnewplanid;
    /** 外键，参照需求表主键*/
    private BigDecimal requirementid;
    /** 实际需求分析开始时间*/
    private Date infactanalysisstartdate;
    /** 实际需求分析结束时间*/
    private Date infactanalysisenddate;
    /** 实际需求开发开始时间*/
    private Date infactdevelopstartdate;
    /** 实际需求开发结束时间*/
    private Date infactdevelopenddate;
    /** 实际需求dat测试开始时间*/
    private Date infactdatteststartdate;
    /** 实际需求dat测试结束时间*/
    private Date infactdattestenddate;
    /** 实际需求uat测试开始时间*/
    private Date infactuatteststartdate;
    /** 实际需求uat测试结束时间*/
    private Date infactuattestenddate;
    /** 实际上线时间*/
    private Date infactfinishdate;
    /** 操作日期*/
    private Date makedate;
    /** 操作时间*/
    private String maketime;
    /** 修改日期*/
    private Date modifydate;
    /** 修改时间*/
    private String modifytime;

    public BigDecimal getRequirementnewplanid() {
        return requirementnewplanid;
    }

    public void setRequirementnewplanid(BigDecimal requirementnewplanid) {
        this.requirementnewplanid = requirementnewplanid;
    }

    public BigDecimal getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(BigDecimal requirementid) {
        this.requirementid = requirementid;
    }

    public Date getInfactanalysisstartdate() {
        return infactanalysisstartdate;
    }

    public void setInfactanalysisstartdate(Date infactanalysisstartdate) {
        this.infactanalysisstartdate = infactanalysisstartdate;
    }

    public Date getInfactanalysisenddate() {
        return infactanalysisenddate;
    }

    public void setInfactanalysisenddate(Date infactanalysisenddate) {
        this.infactanalysisenddate = infactanalysisenddate;
    }

    public Date getInfactdevelopstartdate() {
        return infactdevelopstartdate;
    }

    public void setInfactdevelopstartdate(Date infactdevelopstartdate) {
        this.infactdevelopstartdate = infactdevelopstartdate;
    }

    public Date getInfactdevelopenddate() {
        return infactdevelopenddate;
    }

    public void setInfactdevelopenddate(Date infactdevelopenddate) {
        this.infactdevelopenddate = infactdevelopenddate;
    }

    public Date getInfactdatteststartdate() {
        return infactdatteststartdate;
    }

    public void setInfactdatteststartdate(Date infactdatteststartdate) {
        this.infactdatteststartdate = infactdatteststartdate;
    }

    public Date getInfactdattestenddate() {
        return infactdattestenddate;
    }

    public void setInfactdattestenddate(Date infactdattestenddate) {
        this.infactdattestenddate = infactdattestenddate;
    }

    public Date getInfactuatteststartdate() {
        return infactuatteststartdate;
    }

    public void setInfactuatteststartdate(Date infactuatteststartdate) {
        this.infactuatteststartdate = infactuatteststartdate;
    }

    public Date getInfactuattestenddate() {
        return infactuattestenddate;
    }

    public void setInfactuattestenddate(Date infactuattestenddate) {
        this.infactuattestenddate = infactuattestenddate;
    }

    public Date getInfactfinishdate() {
        return infactfinishdate;
    }

    public void setInfactfinishdate(Date infactfinishdate) {
        this.infactfinishdate = infactfinishdate;
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