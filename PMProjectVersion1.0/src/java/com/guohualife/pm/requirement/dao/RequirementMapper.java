package com.guohualife.pm.requirement.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.guohualife.pm.requirement.mode.Requirement;
@Repository
public interface RequirementMapper {
	public List<Requirement> getRequirementList();
	
    public int deleteByPrimaryKey(BigDecimal requirementid);

    public int insert(Requirement record);

    public int insertSelective(Requirement record);

    public Requirement selectByPrimaryKey(BigDecimal requirementid);

    public int updateByPrimaryKeySelective(Requirement record);

    int updateByPrimaryKey(Requirement record);
    
}