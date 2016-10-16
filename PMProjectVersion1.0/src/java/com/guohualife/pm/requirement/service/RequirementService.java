package com.guohualife.pm.requirement.service;

import java.util.List;
import com.guohualife.pm.base.BaseService;
import com.guohualife.pm.requirement.mode.Requirement;

public interface RequirementService extends BaseService{
	public List<Requirement> getRequirementList();

}
