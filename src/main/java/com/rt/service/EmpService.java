package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.EmpDao;
import com.rt.entities.Employee;

@Service
public class EmpService {
	
	@Autowired
	EmpDao ed;
	
	public boolean addUser(Employee e, String user) {
		
		boolean rs = ed.addUser(e,user);
		
		return rs;
		
	}

	public boolean updateUser(Employee e) {
		
		boolean rs = ed.updateUser(e);
		
		return rs;
	}

	public boolean deleteUser(int id) {
		
		boolean rs = ed.deleteUser(id);
		
		return rs;
		
	}

	public Employee selectUser(int id) {
		
		return ed.selectUser(id);
		
	}

	public List<Employee> getAllUsers(String user) {
		
		return ed.getAllUsers(user);
	}

}
