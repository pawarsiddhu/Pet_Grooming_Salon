package com.mindgate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Users;

@Repository
public class UserDAOImplementation implements UsersDAOInterface {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_USER = "insert into Users values(?,?,?,?)";
	private static String UPDATE_USER = "update Users set username=?, password=? where id=?";
	private static String DELETE_USER = "delete from Users where id=?";
	private static String GET_ONE_USER = "select * from Users where id=?";
	private static String GET_ALL_USER = "select * from  Users;";
	
	@Override
	public boolean addNewUser(Users users) {
		//jdbcTemplate.update(INSERT_EMPLOYEE, employee.getEmployeeId(), employee.getName(), employee.getSalary());
		jdbcTemplate.update(INSERT_USER,
				users.getId(),
				users.getUsername(),
				users.getPassword(),
				users.getType());
		return true;
	}

	@Override
	public boolean updateUser(Users users) {
		jdbcTemplate.update(UPDATE_USER,
				users.getId(),
				users.getUsername(),
				users.getPassword());
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		jdbcTemplate.update(DELETE_USER,id);
		return true;
	}

	@Override
	public Users getOneUser(int id) {
		Users u=jdbcTemplate.queryForObject(GET_ONE_USER, 
				new UsersRowMapper(),
				id); 
		return  u;
	}

	@Override
	public List<Users> getAllEmployee() {
		List<Users> u=jdbcTemplate.query(GET_ALL_USER,
				new UsersRowMapper());
		return u;
	}
	
	
	private final static class UsersRowMapper implements RowMapper<Users>{

		@Override
		public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
			Users u=new Users();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			u.setType(rs.getString("type"));
			
			return u;
		}
		
	}
		
}
