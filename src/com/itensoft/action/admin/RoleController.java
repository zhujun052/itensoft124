package com.itensoft.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.common.Message;
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
	
	@ResponseBody
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(@Param("role") Role role,String action){
		int result = 0;
		if(action.equals("add")){
			//添加
			if(this.roleService.exist(role.getName())){
				result = -1;
			}else{
				result = this.roleService.addRole(role);
			}
		}else{
			//修改
			result = this.roleService.update(role);
		}
		
		Message msg = new Message();
		if(result >=1 ){
			msg.setMessage("角色编辑成功！");
			msg.setType("true");
		}else if(result == -1){
			msg.setMessage("角色名称已经存在！");
			msg.setType("false");
		}else{
			msg.setMessage("角色编辑时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(String name){
		boolean result = this.roleService.delete(name);
		Message msg = new Message();
		if(result){
			msg.setMessage("角色删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("角色删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
}
