package com.guohualife.pm.requirement.mode;

import java.math.BigDecimal;
import java.util.Date;

public class InFactWorkLoad {
    /** 需求实际工作量表主键*/
    private BigDecimal requirenewworkid;
    /** 外键，关联需求表主键*/
    private BigDecimal requirementid;
    /** 实际分析工作量*/
    private BigDecimal infactanalysisworkload;
    /** 实际开发工作量*/
    private BigDecimal infactdevelopworkload;
    /** 实际测试工作量*/
    private BigDecimal infacttestworkload;
    /** 实际总工作量*/
    private BigDecimal infactsumworkload;
    /** 操作日期*/
    private Date makedate;
    /** 操作时间*/
    private String maketime;
    /** 修改日期*/
    private Date modifydate;
    /** 修改时间*/
    private String modifytime;

    public BigDecimal getRequirenewworkid() {
        return requirenewworkid;
    }

    public void setRequirenewworkid(BigDecimal requirenewworkid) {
        this.requirenewworkid = requirenewworkid;
    }

    public BigDecimal getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(BigDecimal requirementid) {
        this.requirementid = requirementid;
    }

    public BigDecimal getInfactanalysisworkload() {
        return infactanalysisworkload;
    }

    public void setInfactanalysisworkload(BigDecimal infactanalysisworkload) {
        this.infactanalysisworkload = infactanalysisworkload;
    }

    public BigDecimal getInfactdevelopworkload() {
        return infactdevelopworkload;
    }

    public void setInfactdevelopworkload(BigDecimal infactdevelopworkload) {
        this.infactdevelopworkload = infactdevelopworkload;
    }

    public BigDecimal getInfacttestworkload() {
        return infacttestworkload;
    }

    public void setInfacttestworkload(BigDecimal infacttestworkload) {
        this.infacttestworkload = infacttestworkload;
    }

    public BigDecimal getInfactsumworkload() {
        return infactsumworkload;
    }

    public void setInfactsumworkload(BigDecimal infactsumworkload) {
        this.infactsumworkload = infactsumworkload;
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