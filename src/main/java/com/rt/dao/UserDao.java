package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jd;
	
	public boolean checkUser(String username, String password) {
		
		Object[] args = {username, password};
		
		int count = jd.queryForObject("select count(*) from user where name = ? and password = ? ", new RowMapper<Integer>() {

			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt(1);
			}
		}, args);
		
		if(count > 0) {
			return true;
		}
		
		return false;
		
	}

}
