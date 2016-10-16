package com.guohualife.pm.requirement.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.guohualife.pm.requirement.mode.RequirementEstimatedate;
@Repository
public interface RequirementEstimatedateMapper {
    int deleteByPrimaryKey(BigDecimal requirementoldplanid);

    int insert(RequirementEstimatedate record);

    int insertSelective(RequirementEstimatedate record);

    RequirementEstimatedate selectByPrimaryKey(BigDecimal requirementoldplanid);

    int updateByPrimaryKeySelective(RequirementEstimatedate record);

    int updateByPrimaryKey(RequirementEstimatedate record);
}