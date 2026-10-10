package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.entities.Employee;

@Repository
public class EmpDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean addUser(Employee e, String user) {
		
		Object[] args = {e.getId(),e.getName(),e.getSalary(),user};
		
		int rs = jdbcTemplate.update("insert into emp_data(id,name,salary,user) values(?,?,?,?)",args);

		if(rs >= 1) {
			return true;
		}
		
		return false;

	}
	
	public boolean updateUser(Employee e) {
		
		Object[] args = {e.getName(),e.getSalary(),e.getId()};
		
		int rs = jdbcTemplate.update("update emp_data set name = ?, salary = ? where id = ?",args);
		
		if(rs >= 1) {
			return true;
		}
		
		return false;
	}

	public boolean deleteUser(int id) {
		
		Object[] args = {id};
		
		int rs = jdbcTemplate.update("delete from emp_data where id = ?",args);
		
		if(rs >= 1) {
			return true;
		}
		
		return false;
		
	}

	public Employee selectUser(int id) {
		
		Object[] args = {id};
		
		Employee emp = jdbcTemplate.queryForObject("select * from emp_data where id = ?",args,new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
				
				return e;
			}
			
		});
		
		return emp;
	}

	public List<Employee> getAllUsers(String user) {
		
		Object[] args = {user};
		
		List<Employee> list = jdbcTemplate.query("select * from emp_data where user = ?",args,new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
				
				return e;
			}
		});	
		return list;
	}

}
