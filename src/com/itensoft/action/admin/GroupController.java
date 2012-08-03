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

import com.itensoft.bean.common.Message;
import com.itensoft.bean.easyui.Tree;
import com.itensoft.model.Cert;
import com.itensoft.model.Group;
import com.itensoft.model.Policy;
import com.itensoft.model.Virtualmanager;
import com.itensoft.service.CertService;
import com.itensoft.service.GroupFinalManagerService;
import com.itensoft.service.GroupService;
import com.itensoft.service.PolicyService;
import com.itensoft.service.VirtualManagerService;


@Controller
@RequestMapping(value="admin/group")
public class GroupController extends BaseController{
	
	GroupService groupService;
	PolicyService policyService;
	CertService certService;
	VirtualManagerService virtualManagerService;
	GroupFinalManagerService groupFinalManagerService;
	
	@Resource(name="groupService")
	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}

	@Resource(name="policyService")
	public void setPolicyService(PolicyService policyService) {
		this.policyService = policyService;
	}

	@Resource(name="certService")
	public void setCertService(CertService certService) {
		this.certService = certService;
	}

	@Resource(name="virtualManagerService")
	public void setVirtualManagerService(VirtualManagerService virtualManagerService) {
		this.virtualManagerService = virtualManagerService;
	}
	
	@Resource(name="groupFinalManagerService")
	public void setGroupFinalManagerService(
			GroupFinalManagerService groupFinalManagerService) {
		this.groupFinalManagerService = groupFinalManagerService;
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
			if(groups.get(i).getId()!=null&&!"".equals(groups.get(i).getId())){
				t.setIconCls(groups.get(i).getAudited().equals("T")?"icon-cmp-valid":"icon-cmp-invalid");
			}else{
				t.setIconCls("icon-folder");
			}
			t.setState(groups.get(i).getChildnums()>=1?"closed":"open");
			tree.add(t);
		}
		return arrayToJson(tree);
	}
	
	@RequestMapping(value="/auth", method=RequestMethod.POST)
	@ResponseBody
	public String auth(@RequestParam("id") int id){
	
		int affectrows = this.groupService.auth(id);
		Message msg = new Message();
		if(affectrows == 1 ){
			msg.setMessage("用户授权编辑成功！");
			msg.setType("true");
		}else{
			msg.setMessage("用户授权编辑异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	public String delete(@RequestParam("id") int id){
		Message msg = new Message();
		
		boolean exist = this.groupService.getExistC(id);
		
		if(exist){
			msg.setMessage("请先删除子节点！");
			msg.setType("false");
			return objToJson(msg);
		}
		
		int affectrows = this.groupService.delete(id);
		if(affectrows == 1 ){
			msg.setMessage("用户授权删除成功！");
			msg.setType("true");
		}else{
			msg.setMessage("用户授权删除异常！");
			msg.setType("false");
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value="/getGroupInfo", method=RequestMethod.GET)
	public String getGroupInfo(@RequestParam("id") int id,ModelMap modelmap){
		
		Group groupinfo = this.groupService.getInfoById(id);
		modelmap.addAttribute("groupinfo",groupinfo);

		///策略
		Policy policy = this.policyService.getPolicy(id);
		policy.setUsbcontrolmode(UDiskMode2Text(policy.getUdiskmode()));
		modelmap.addAttribute("policy",policy);
		
		//身份
		List<Cert> certs = this.certService.getCertsByCode(id);
		modelmap.addAttribute("certs",certs);
		
		//接受者
		List<Cert> receive = this.certService.getReceive(id);
		modelmap.addAttribute("receive",receive);
		
		//受控软件
		
		
		//审批者
		List<Virtualmanager> vms = this.groupFinalManagerService.getGroupFinalManager(id);
		modelmap.addAttribute("vms",vms);
		
		return "admin/group/info";
	}
	
	
	private String UDiskMode2Text(byte UDiskMode) {
		byte UDiskInMode = (byte) (UDiskMode >> 4);
		byte UDiskOutMode = (byte) ((byte) (UDiskMode << 4) >> 4);

		String result = "";
		switch (UDiskInMode) {
		case 0:
			result = "拷入允许  ";
			break;
		case 1:
			result = "拷入加密  ";
			break;
		case 2:
			result = "拷入禁止  ";
			break;
		}

		switch (UDiskOutMode) {
		case 0:
			result += "拷出允许";
			break;
		case 1:
			result += "拷出加密";
			break;
		case 2:
			result += "拷出禁止";
			break;
		}

		return result;
	}
	
}
