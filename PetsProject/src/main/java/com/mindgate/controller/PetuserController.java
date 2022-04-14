package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.dao.PetuserDAOImplementation;
import com.mindgate.dao.PetuserDAOInterface;
import com.mindgate.pojo.Petuser;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Petuser")
public class PetuserController {
	
	@Autowired
	private PetuserDAOInterface petuserDAOInterface;
	

	// http://localhost:8080/Petuser/addPetUser
	@RequestMapping(value = "/addPetUser", method = RequestMethod.POST)
	public boolean addNewPetUser(@RequestBody  Petuser petuser) {
		return petuserDAOInterface.addNewPetUser(petuser);
	}
	

	// http://localhost:8080/Petuser/update
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean updatePetUser(@RequestBody Petuser petuser) {
		return petuserDAOInterface.updatePetUser(petuser);
	}
		
	// http://localhost:8080/Petuser/5
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deletePetUser(@PathVariable int id) {
		return petuserDAOInterface.deletePetUser(id);
	}
		
	// http://localhost:8080/Petuser/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Petuser getOnePetUser(@PathVariable int id) {
		return petuserDAOInterface.getOnePetUser(id);
	}
	
	/*{
	    "id": 2,
	    "name": "abc",
	    "pet_type": "dog",
	    "username": "xyz",
	    "password": "12345678",
	    "create_date": "2022-04-04"
	}*/
	
	
	
		
	// http://localhost:8080/Petuser/getAllPetUsers
	@RequestMapping(value = "/getAllPetUsers", method = RequestMethod.GET)
	public List<Petuser> getAllPetUser(){
		return petuserDAOInterface.getAllPetUser();				
	}
	
	/*[
	    {
	        "id": 2,
	        "name": "abc",
	        "pet_type": "dog",
	        "username": "xyz",
	        "password": "12345678",
	        "create_date": "2022-04-04"
	    },
	    {
	        "id": 3,
	        "name": "kirti aruja",
	        "pet_type": "Dog",
	        "username": "kirti",
	        "password": "12345678",
	        "create_date": "2022-04-06"
	    },
	    {
	        "id": 4,
	        "name": "pratik aruja",
	        "pet_type": "Cat",
	        "username": "admin",
	        "password": "zsjdij",
	        "create_date": "2022-04-06"
	    },
	    {
	        "id": 5,
	        "name": "kirti aruja",
	        "pet_type": "Cat",
	        "username": "admin",
	        "password": "dcv",
	        "create_date": "2022-04-06"
	    }
	]*/
	
	
	
	
	
	
	

}
