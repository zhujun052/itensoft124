package com.itensoft.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.easyui.ListBean;
import com.itensoft.model.Role;
import com.itensoft.model.User;
import com.itensoft.service.RoleService;

@Controller
@RequestMapping(value="admin/role")
public class RoleController extends BaseController{
	
	RoleService roleService;
	@Resource(name="roleService")
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "admin/role";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.roleService.getTotal();
		List<Role> regiments = this.roleService.loadList(page,rows);
		
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(regiments);
		
		return objToJson(bean);
	}
	
	
	
	
}
