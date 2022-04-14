package com.mindgate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAOInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static String INSERT_EMPLOYEE = "insert into Employee values(?,?,?)";
	private static String UPDATE_EMPLOYEE = "update Employee set name=?, salary=? where employeeId=?";
	private static String DELETE_EMPLOYEE = "delete from Employee where employeeId=?";
	private static String GET_ONE_EMPLOYEE = "select * from Employee where employeeId=?";
	//private static String GET_ALL_EMPLOYEE = "select * from  mindgatedb.employee_3009;";
	private static String GET_ALL_EMPLOYEE = "select * from  Employee;";
	
	
	
	@Override
	public boolean addNewEmployee(Employee employee) {
		jdbcTemplate.update(INSERT_EMPLOYEE, employee.getEmployeeId(), employee.getName(), employee.getSalary());
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		jdbcTemplate.update(UPDATE_EMPLOYEE, employee.getName(), employee.getSalary(), employee.getEmployeeId());
		return true;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		jdbcTemplate.update(DELETE_EMPLOYEE, employeeId);
		return true;
	}

	@Override // get all employee record
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = jdbcTemplate.query(GET_ALL_EMPLOYEE, new EmployeeRowMapper());
		return employeeList;
	}

	@Override // single record
	public Employee getEmployee(int employeeId) {
		Employee employee = jdbcTemplate.queryForObject(GET_ONE_EMPLOYEE, new EmployeeRowMapper(), employeeId);
		return employee;
	}
	
	

	private final static class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setEmployeeId(rs.getInt("employeeId"));
			employee.setName(rs.getString("name"));
			employee.setSalary(rs.getDouble("salary"));

			return employee;
		}

	}

}
