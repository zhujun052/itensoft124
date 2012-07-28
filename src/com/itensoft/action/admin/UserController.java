package com.itensoft.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.common.Message;
import com.itensoft.bean.easyui.ListBean;
import com.itensoft.model.User;
import com.itensoft.service.UserService;

@Controller
@RequestMapping(value="admin/user")
public class UserController extends BaseController{
	
	UserService userService;
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "admin/user";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(int page,int rows){
		int total = this.userService.getTotal();
		List<User> regiments = this.userService.loadList(page,rows);
		
		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(regiments);
		
		return objToJson(bean);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(String name,String password,String note,String action){
		User user = new User(name,password,note);
		Boolean result = false;
		if(action.equals("add")){
			//添加
			result = this.userService.addUser(user);
		}else{
			//修改
			result = this.userService.update(user);
		}
		
		Message msg = new Message();
		if(result){
			msg.setMessage("用户编辑成功！");
			msg.setType("true");
		}else{
			msg.setMessage("用户编辑时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value = "/existUser", method = RequestMethod.POST)
	@ResponseBody
	public String existUser(String name){
		boolean result = this.userService.existUser(name);
		Message msg = new Message();
		if(result){
			msg.setMessage("用户已经存在！");
			msg.setType("true");
		}else{
			msg.setMessage("用户不存在！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(String name){
		boolean result = this.userService.delete(name);
		Message msg = new Message();
		if(result){
			msg.setMessage("用户删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("用户删除时发生异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
}
