package com.guohualife.pm.requirement.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.guohualife.pm.requirement.mode.RequirementInFactdate;
@Repository
public interface RequirementInFactdateMapper {
    int deleteByPrimaryKey(BigDecimal requirementnewplanid);

    int insert(RequirementInFactdate record);

    int insertSelective(RequirementInFactdate record);

    RequirementInFactdate selectByPrimaryKey(BigDecimal requirementnewplanid);

    int updateByPrimaryKeySelective(RequirementInFactdate record);

    int updateByPrimaryKey(RequirementInFactdate record);
}