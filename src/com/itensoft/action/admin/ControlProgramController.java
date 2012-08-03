package com.itensoft.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.easyui.ListBean;
import com.itensoft.model.Controlprogram;
import com.itensoft.service.ControlProgramService;

@Controller
@RequestMapping(value = "admin/controlprogram")
public class ControlProgramController extends BaseController{
	
	ControlProgramService controlProgramService;
	@Resource(name="controlProgramService")
	public void setControlProgramService(ControlProgramService controlProgramService) {
		this.controlProgramService = controlProgramService;
	}


	@RequestMapping(value="/getControlProgramByParent", method=RequestMethod.GET)
	@ResponseBody
	public String getControlProgramByParent(@RequestParam("pid") int pid){
		List<Controlprogram> cps = this.controlProgramService.getControlProgramByParent(pid);
		ListBean bean = new ListBean();
		bean.setTotal(cps.size());
		bean.setRows(cps);
		return objToJson(bean);
	}
	
}
