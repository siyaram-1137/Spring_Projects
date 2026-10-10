package com.rt.cntrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String indexPage() {
		return "login";
	}
	
	@RequestMapping("/registerForm")
	public String registerForm() {
		return "register";
	}
	
	@RequestMapping("/updateForm")
	public String updateForm() {
		return "update";
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm() {
		return "delete";
	}
	
	@RequestMapping("/selectForm")
	public String selectForm() {
		return "select";
	}

}
