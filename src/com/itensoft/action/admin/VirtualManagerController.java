package com.itensoft.action.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.VUser;
import com.itensoft.bean.common.Message;
import com.itensoft.bean.easyui.ListBean;
import com.itensoft.model.User;
import com.itensoft.service.VirtualManagerService;
import com.itensoft.util.JsonUtil;

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
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(int id,String name,String users,String action){
		List<VUser> list = JsonUtil.getList4Json(users, VUser.class);
		int result = 0;
		if(action.equals("add")){
			result = this.virtualManagerService.add(name,list);
		}else if(action.equals("update")){
			result = this.virtualManagerService.update(id,name,list);
		}
		
		Message msg = new Message();
		if(result == 1 ){
			msg.setMessage("审批员编辑成功！");
			msg.setType("true");
		}else{
			msg.setMessage("审批员编辑异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(@RequestParam("id") int id){
		int affectrows = this.virtualManagerService.delete(id);
		Message msg = new Message();
		if(affectrows == 1 ){
			msg.setMessage("审批员删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("审批员删除异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	
	
	
}
