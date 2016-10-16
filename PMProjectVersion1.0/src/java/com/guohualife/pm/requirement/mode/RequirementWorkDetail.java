package com.guohualife.pm.requirement.mode;

import java.math.BigDecimal;
import java.util.Date;

public class RequirementWorkDetail {
    /** 实际需求工作量表明细*/
    private BigDecimal requirenewworkdetailid;
    /** 外键，关联需求实际工作量表主键*/
    private BigDecimal requirementworkid;
    /** 功能所属软件阶段*/
    private String functionmodule;
    /** 功能描述*/
    private String functionremark;
    /** 功能实际所需工作量*/
    private BigDecimal infactfunctionworkload;
    /** 功能负责人*/
    private String functionprincipal;
    /** 操作日期*/
    private Date makedate;
    /** 操作时间*/
    private String maketime;
    /** 修改日期*/
    private Date modifydate;
    /** 修改时间*/
    private String modifytime;

    public BigDecimal getRequirenewworkdetailid() {
        return requirenewworkdetailid;
    }

    public void setRequirenewworkdetailid(BigDecimal requirenewworkdetailid) {
        this.requirenewworkdetailid = requirenewworkdetailid;
    }

    public BigDecimal getRequirementworkid() {
        return requirementworkid;
    }

    public void setRequirementworkid(BigDecimal requirementworkid) {
        this.requirementworkid = requirementworkid;
    }

    public String getFunctionmodule() {
        return functionmodule;
    }

    public void setFunctionmodule(String functionmodule) {
        this.functionmodule = functionmodule == null ? null : functionmodule.trim();
    }

    public String getFunctionremark() {
        return functionremark;
    }

    public void setFunctionremark(String functionremark) {
        this.functionremark = functionremark == null ? null : functionremark.trim();
    }

    public BigDecimal getInfactfunctionworkload() {
        return infactfunctionworkload;
    }

    public void setInfactfunctionworkload(BigDecimal infactfunctionworkload) {
        this.infactfunctionworkload = infactfunctionworkload;
    }

    public String getFunctionprincipal() {
        return functionprincipal;
    }

    public void setFunctionprincipal(String functionprincipal) {
        this.functionprincipal = functionprincipal == null ? null : functionprincipal.trim();
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