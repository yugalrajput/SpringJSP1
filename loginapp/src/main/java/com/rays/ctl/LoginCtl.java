package com.rays.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginCtl {

	@GetMapping(value = "/loginpage")
	public String showLoginPage() {
		return "loginform";
	}
	
	public String login(@RequestParam String uname, String upwd, ModelMap map) {
		
		map.addAttribute("username", uname);
		String status = "";
		if(uname.equals("yugal")&& upwd.equals("yugal")) {
			status = "success";
		}else {
			status = "failure";
		}		
		return status ;
	}
	
	
}
