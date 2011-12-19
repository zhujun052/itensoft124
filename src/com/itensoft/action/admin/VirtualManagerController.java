package com.itensoft.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.easyui.ListBean;
import com.itensoft.model.User;
import com.itensoft.service.VirtualManagerService;

@Controller
@RequestMapping(value="admin/virtualmanager")
public class VirtualManagerController extends BaseController{

	VirtualManagerService virtualManagerService;
	@Resource(name="virtualManagerService")
	public void setVirtualManagerService(VirtualManagerService virtualManagerService) {
		this.virtualManagerService = virtualManagerService;
	}

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "admin/virtualmanager";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.virtualManagerService.getTotal();
		List<User> regiments = this.virtualManagerService.loadList(page,rows);
		
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(regiments);
		
		return objToJson(bean);
	}
	
}
