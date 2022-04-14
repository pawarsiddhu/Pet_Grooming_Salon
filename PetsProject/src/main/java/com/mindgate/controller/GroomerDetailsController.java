package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.dao.GroomerDetailsDAOInterface;
import com.mindgate.pojo.GroomerDetails;



@RestController
@CrossOrigin("*")
@RequestMapping(value = "/GroomerDetails")
public class GroomerDetailsController {

	@Autowired
	public GroomerDetailsDAOInterface groomerDetailsDAOInterface;


	// http://localhost:8080/GroomerDetails/addGromer
	@RequestMapping(value = "/addGromer", method = RequestMethod.POST)
	public boolean addNewGroomerDetails(@RequestBody GroomerDetails groomerDetails) {
		return groomerDetailsDAOInterface.addNewGroomerDetails(groomerDetails);
	}
	
	/*{
	    "id": 1,
	    "groomer_name": "mypet groomer",
	    "description": "One type of pets services",
	    "contact": 987654321,
	    "address": "home service and appointments"
	}*/
	
	
	
	
	// http://localhost:8080/GroomerDetails/update
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean updateGroomerDetails(@RequestBody GroomerDetails groomerDetails) {
		return groomerDetailsDAOInterface.updateGroomerDetails(groomerDetails);
	}
	
	/*{
	    "id": 1,
	    "groomer_name": "mypet groomer",
	    "description": "We are pet Grommer",
	    "contact": 987654321,
	    "address": "home service and appointments"
	} ===> */
	
	
	
	

	// http://localhost:8080/GroomerDetails/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deleteGroomerDetails(@PathVariable int id) {
		return groomerDetailsDAOInterface.deleteGroomerDetails(id);
	}


	// http://localhost:8080/GroomerDetails/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public GroomerDetails getOneGroomerDetails(@PathVariable int id) {
		return groomerDetailsDAOInterface.getOneGroomerDetails(id);
	}

	/*{
	    "id": 1,
	    "groomer_name": "mypet groomer",
	    "description": "all type of pets services",
	    "contact": 123456789,
	    "address": "home service and appointments"
	}*/
	
	
	
	
	//http://localhost:8080/GroomerDetails/getAllGromerDetails
	@RequestMapping(value = "/getAllGromerDetails", method = RequestMethod.GET)
	public List<GroomerDetails> getAllGroomerDetails(){
		return groomerDetailsDAOInterface.getAllGroomerDetails();
	}
	
	/*[
	    {
	        "id": 1,
	        "groomer_name": "mypet groomer",
	        "description": "all type of pets services",
	        "contact": 123456789,
	        "address": "home service and appointments"
	    },
	    {
	        "id": 2,
	        "groomer_name": "pratik",
	        "description": "I provide the service to take care of dogs",
	        "contact": 9665835,
	        "address": "Shirpur"
	    }
	]*/
	
	
	
	

}
