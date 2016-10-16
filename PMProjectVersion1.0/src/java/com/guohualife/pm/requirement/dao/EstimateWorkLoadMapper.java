package com.guohualife.pm.requirement.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.guohualife.pm.requirement.mode.EstimateWorkLoad;
@Repository
public interface EstimateWorkLoadMapper {
    int deleteByPrimaryKey(BigDecimal requireoldworkid);

    int insert(EstimateWorkLoad record);

    int insertSelective(EstimateWorkLoad record);

    EstimateWorkLoad selectByPrimaryKey(BigDecimal requireoldworkid);

    int updateByPrimaryKeySelective(EstimateWorkLoad record);

    int updateByPrimaryKey(EstimateWorkLoad record);
}