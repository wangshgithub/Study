package com.guohualife.pm.requirement.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.guohualife.pm.requirement.mode.RequirementPople;
@Repository
public interface RequirementPopleMapper {
    int deleteByPrimaryKey(BigDecimal requirementrelationid);

    int insert(RequirementPople record);

    int insertSelective(RequirementPople record);

    RequirementPople selectByPrimaryKey(BigDecimal requirementrelationid);

    int updateByPrimaryKeySelective(RequirementPople record);

    int updateByPrimaryKey(RequirementPople record);
}