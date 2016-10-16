package com.guohualife.pm.requirement.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guohualife.pm.requirement.mode.Requirement;
import com.guohualife.pm.requirement.service.RequirementService;

import javafx.collections.ModifiableObservableListBase;

@Controller
@RequestMapping("requirementmanage/")
public class RequirementController {
	@Resource
	private RequirementService requirementService;
	@RequestMapping("getRequirementList")
	public ModelAndView getRequirementList(){
		List<Requirement> requirementList = requirementService.getRequirementList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("requirementList",requirementList);
		mv.setViewName("requirement/requirement");
		return mv;
	}
	@RequestMapping("addRequirement")
	public String addRequirement(){
		return "requirement/addRequirement";
	}

}
