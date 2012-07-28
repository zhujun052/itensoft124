package com.itensoft.action.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="admin/welcome")
public class WelcomeController extends BaseController{
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "admin/welcome";
	}
	
}
