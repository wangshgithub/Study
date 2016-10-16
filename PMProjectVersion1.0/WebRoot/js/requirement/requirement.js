$(function(){
	$("#addRequirement").click(function(){
		//获取主机地址之后的目录
		var pathName = window.document.location.pathname;
		//获取带"/"的项目名，如：/uimcardprj
	    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
		window.location.href=projectName+"/requirementmanage/addRequirement.do";
	});
})