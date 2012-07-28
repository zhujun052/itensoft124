package com.itensoft.action.admin;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itensoft.model.Role;
import com.itensoft.model.User;
import com.itensoft.service.RoleService;
import com.itensoft.service.RoleUserService;
import com.itensoft.service.UserService;
import com.itensoft.util.CacheManager;
import com.itensoft.util.Constant;
import com.itensoft.util.StringUtil;

@Controller
@RequestMapping(value="admin/webmaster")
public class WebmasterController extends BaseController{
	
	UserService userService;
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	RoleService roleService;
	@Resource(name="roleService")
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	RoleUserService roleUserService;
	@Resource(name="roleUserService")
	public void setRoleUserService(RoleUserService roleUserService) {
		this.roleUserService = roleUserService;
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("name")String name,@RequestParam("pass")String pass,String verify, ModelMap modelMap,HttpSession session){
		String kaptchaExpected = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		if (kaptchaExpected == null || !kaptchaExpected.equalsIgnoreCase(verify))
		{
			modelMap.addAttribute("message","验证码错误！");
		    return "admin/index";
		}
		User exist = this.userService.findByName(name);
		if(exist!=null){
			if(StringUtil.getMD5(pass.getBytes()).equals(exist.getPassword())){
				//得到权限，通过权限进入后台
				List<Role> roles = this.roleService.getRoleByName(name);
				boolean logonServer = false;
				for(Role r:roles){
					if(r.getLogonserver().equals("T")){
						logonServer = true;
						break;
					}
				}
				
				if(logonServer == true){
					User a = new User();
					a.setName(exist.getName());
					a.setNote(exist.getNote());
					a.setPassword(exist.getPassword());
					return "redirect:/admin/webmaster/console";
				}else{
					modelMap.addAttribute("message","用户没有登入权限！");
					return "admin/index";
				}
				
			}
			modelMap.addAttribute("message","用户密码错误！");
			return "admin/index";
		}
		modelMap.addAttribute("message","用户名不存在！");
		return "admin/index";
	}
	
	@RequestMapping(value="/console", method=RequestMethod.GET)
	public String console(HttpSession session,ModelMap modelMap){
		HashMap<String, String> hashconfig = (HashMap<String, String>)CacheManager.getFromCache(Constant.SYSTEM_CONFIG);
		modelMap.addAttribute("webtitle",hashconfig.get("name"));
		return "admin/console";
	}
	
	@RequestMapping(value="/{item}", method=RequestMethod.GET)
	public String menu(@PathVariable("item") String item,ModelMap modelMap){
		return "admin/menu/"+item;
	}
	
	@RequestMapping(value="/myhomepage", method=RequestMethod.GET)
	public String myhomepage(){
		return "admin/myhomepage";
	}
	
}
