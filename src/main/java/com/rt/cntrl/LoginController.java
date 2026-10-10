package com.rt.cntrl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService us;
	
	@PostMapping("/userLogin")
	public String checkUser(@RequestParam String username, @RequestParam String password, Model m, HttpSession session) {
		
		boolean isUser = us.checkUser(username, password);
		
		if(isUser) {
			session.setAttribute("loggedInUser", username);
			return "index";
		}else {
			m.addAttribute("errMsg","Wrong Cred or Register First...");
			return "login";
		}
		
	}

}
