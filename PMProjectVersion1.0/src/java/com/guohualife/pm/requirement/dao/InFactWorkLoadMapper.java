package com.guohualife.pm.requirement.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.guohualife.pm.requirement.mode.InFactWorkLoad;
@Repository
public interface InFactWorkLoadMapper {
    int deleteByPrimaryKey(BigDecimal requirenewworkid);

    int insert(InFactWorkLoad record);

    int insertSelective(InFactWorkLoad record);

    InFactWorkLoad selectByPrimaryKey(BigDecimal requirenewworkid);

    int updateByPrimaryKeySelective(InFactWorkLoad record);

    int updateByPrimaryKey(InFactWorkLoad record);
}