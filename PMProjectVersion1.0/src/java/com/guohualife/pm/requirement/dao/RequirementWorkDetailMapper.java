package com.guohualife.pm.requirement.dao;

import org.springframework.stereotype.Repository;

import com.guohualife.pm.requirement.mode.RequirementWorkDetail;

@Repository
public interface RequirementWorkDetailMapper {
    int insert(RequirementWorkDetail record);

    int insertSelective(RequirementWorkDetail record);
}