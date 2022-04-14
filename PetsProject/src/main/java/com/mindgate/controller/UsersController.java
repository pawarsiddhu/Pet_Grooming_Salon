package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.dao.UsersDAOInterface;
import com.mindgate.pojo.Employee;
import com.mindgate.pojo.Users;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Users")
public class UsersController {

	@Autowired
	private UsersDAOInterface usersDAOInterface;


	// http://localhost:8080/Users/getallUsers
	@RequestMapping(value = "/getallUsers",method = RequestMethod.GET)
	public List<Users> getAllUsers(){
		return usersDAOInterface.getAllEmployee(); 
	}

	/*
		[
		    {
		        "id": 1,
		        "username": "groomer",
		        "password": "12345678",
		        "type": "g"
		    },
		    {
		        "id": 2,
		        "username": "hosteler",
		        "password": "12345678",
		        "type": "h"
		    }
		]
	 */



	//http://localhost:8080/Users/1
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Users getOneUser(@PathVariable int id) {
		return usersDAOInterface.getOneUser(id);
	}

	/*{
	    "id": 1,
	    "username": "groomer",
	    "password": "12345678",
	    "type": "g"
	}*/


	//http://localhost:8080/Users/3
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public boolean deleteUsers(@PathVariable int id) {
		return usersDAOInterface.deleteUser(id);
	}

	// http://localhost:8080/Users/update
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean updateUsers(@RequestBody Users users) {
		return usersDAOInterface.updateUser(users);
	}


	// http://localhost:8080/Users/addUsers
	@RequestMapping(value = "/addUsers", method = RequestMethod.POST)
	public boolean addNewUsers(@RequestBody Users users) {
		return usersDAOInterface.addNewUser(users);
	}

	/*
	 {
	    "id": 3,
	    "username": "groomerxyz",
	    "password": "12345111",
	    "type": "g"
	}


	 **/

}
