package com.itensoft.action.admin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.easyui.Tree;
import com.itensoft.model.Group;
import com.itensoft.service.GroupService;


@Controller
@RequestMapping(value="admin/group")
public class GroupController extends BaseController{
	
	GroupService groupService;
	@Resource(name="groupService")
	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}


	@RequestMapping(value="/getTree", method=RequestMethod.GET)
	@ResponseBody
	public String getTree(@RequestParam("id") int id){
		List<Group> groups = this.groupService.loadByParentCode(id);
		List<Tree> tree = new ArrayList<Tree>();
		for(int i=0;i<groups.size();i++){
			Tree t = new Tree();
			t.setId(groups.get(i).getCode());
			t.setText(groups.get(i).getName());
			t.setState(groups.get(i).getChildnums()>=1?"closed":"open");
			tree.add(t);
		}
		return arrayToJson(tree);
	}
	
	@RequestMapping(value="/getGroupInfo", method=RequestMethod.GET)
	public String getGroupInfo(@RequestParam("id") int id,ModelMap modelmap){
		
		//策略
		Group groupinfo = this.groupService.getInfoById(id);
		modelmap.addAttribute("groupinfo",groupinfo);
		
		return "admin/group/info";
	}
	
	
}
