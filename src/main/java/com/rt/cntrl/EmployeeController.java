package com.rt.cntrl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.entities.Employee;
import com.rt.service.EmpService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmpService es;
	
	//EmpService es;EmpService es;EmpService es;

	@RequestMapping("/addUser")
	public String addUser(@ModelAttribute Employee e, Model m, HttpSession session) {

		String user = (String) session.getAttribute("loggedInUser");
		
		boolean isAdded = es.addUser(e,user);
		
		if(isAdded) {
			m.addAttribute("successMsg","Employee Added Successfully...");
		}else {
			m.addAttribute("errMsg","Unable to Add Employee...");
		}
		
		return "register";
	}

	@RequestMapping("/updateUser")
	public String updateUser(@ModelAttribute Employee e, Model m) {
		
		boolean isUpdated = es.updateUser(e);
		
		if(isUpdated) {
			m.addAttribute("successMsg","Employee Added Successfully...");
		}else {
			m.addAttribute("errMsg","Unable to Add Employee...");
		}
		
		return "update";
	}

	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam int id, Model m) {
		
		boolean isDeleted = es.deleteUser(id);
		
		if(isDeleted) {
			m.addAttribute("successMsg","Employee Added Successfully...");
		}else {
			m.addAttribute("errMsg","Unable to Add Employee...");
		}
		
		return "delete";
	}

	@RequestMapping("/selectUser")
	public String getUser(@RequestParam int id, Model m) {
		
		Employee e = es.selectUser(id);
		
		m.addAttribute("emp",e);
		
		return "select";
	}

	@RequestMapping("/getAllUsers")
	public String getAllUsers(Model m, HttpSession session) {
		
		String user = (String) session.getAttribute("loggedInUser");
		
		List<Employee> list = es.getAllUsers(user);
		
		m.addAttribute("empList",list);
		
		return "viewAll";
	}
	
}