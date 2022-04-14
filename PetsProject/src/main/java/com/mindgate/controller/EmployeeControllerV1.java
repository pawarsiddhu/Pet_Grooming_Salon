package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.runner.ReactiveWebApplicationContextRunner;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.dao.EmployeeDAOInterface;
import com.mindgate.pojo.Employee;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/employeeCRUD")
public class EmployeeControllerV1 {

	@Autowired
	private EmployeeDAOInterface employeeDAO;

	// http://localhost:8080/employeeCRUD/addEmployee
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public boolean addNewEmployee(@RequestBody Employee employee) {
		return employeeDAO.addNewEmployee(employee);

		/*
		 * put postman jsondata {
		 * 
		 * "employeeId" : "11993", "name" : "Manoj", "salary" : "1000" }
		 */
	}

	// http://localhost:8080/employeeCRUD/update
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean updateEmployee(@RequestBody Employee employee) {
		return employeeDAO.updateEmployee(employee);

	}
 
	// http://localhost:8080/employeeCRUD/11993
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public boolean deletEmployee(@PathVariable int employeeId) {
		System.out.println("Delet");
		return employeeDAO.deleteEmployee(employeeId);
	}

	// get one employee
	// http://localhost:8080/employeeCRUD/112
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable int employeeId) {
		System.out.println("delet One employee");
		return employeeDAO.getEmployee(employeeId);
	}

	// get all employee
	// http://localhost:8080/employeeCRUD/getallemployee
	@RequestMapping(value = "/getallemployee", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		System.out.println("get all employee");
		return employeeDAO.getAllEmployee();
	}

}
