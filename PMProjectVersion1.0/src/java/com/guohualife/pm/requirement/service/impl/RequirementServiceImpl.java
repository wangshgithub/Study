package com.guohualife.pm.requirement.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guohualife.pm.requirement.dao.RequirementMapper;
import com.guohualife.pm.requirement.mode.Requirement;
import com.guohualife.pm.requirement.service.RequirementService;
@Service("requirementService")
public class RequirementServiceImpl implements RequirementService {
	
	private static final long serialVersionUID = 2961587200838431235L;
	
	@Resource
	private RequirementMapper requirementMapper;
	@Override
	public List<Requirement> getRequirementList() {
		return requirementMapper.getRequirementList();
	}

}
