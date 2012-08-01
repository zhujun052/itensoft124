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
import com.itensoft.model.Roleuser;
import com.itensoft.service.RoleUserService;

@Controller
@RequestMapping(value="admin/roleuser")
public class RoleUserController  extends BaseController{
	
	RoleUserService roleUserService;
	@Resource(name="roleUserService")
	public void setRoleUserService(RoleUserService roleUserService) {
		this.roleUserService = roleUserService;
	}

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "admin/roleuser";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.POST)
	@ResponseBody
	public String list(@Param("rolename") String rolename){
		
		List<Roleuser> list = this.roleUserService.loadList(rolename);
		ListBean bean = new ListBean();
		bean.setTotal(list.size());
		bean.setRows(list);

		return objToJson(bean);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public String add(Roleuser roleuser){
		Message msg = new Message();
		
		if(this.roleUserService.insert(roleuser) == 1 ){
			msg.setMessage("用户关联编辑成功！");
			msg.setType("true");
		}else{
			msg.setMessage("用户关联编辑异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	public String delete(Roleuser roleuser){
		Message msg = new Message();
		
		if(this.roleUserService.delete(roleuser) == 1 ){
			msg.setMessage("用户关联删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("用户关联删除异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value="/exist", method=RequestMethod.POST)
	@ResponseBody
	public String exist(Roleuser roleuser){
		Message msg = new Message();
		if(this.roleUserService.exist(roleuser) >= 1 ){
			msg.setMessage("用户关联已经存在！");
			msg.setType("true");
		}else{
			msg.setMessage("用户关联不存在！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	
	
}
