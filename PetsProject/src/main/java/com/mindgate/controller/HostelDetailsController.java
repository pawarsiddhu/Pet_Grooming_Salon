package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.dao.HostelDetailsDAOInterface;
import com.mindgate.pojo.Employee;
import com.mindgate.pojo.HostelDetails;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/hostelDetails")
public class HostelDetailsController  {

	@Autowired
	public HostelDetailsDAOInterface hostelDetailsDAOInterface;

	// http://localhost:8080/hostelDetails/addNewHostelDetails
	@RequestMapping(value = "/addNewHostelDetails", method = RequestMethod.POST)
	public boolean addNewHostelDetails(@RequestBody HostelDetails hostel) {
		return hostelDetailsDAOInterface.addNewHostelDetails(hostel);
	}
	
	/*{
	    "id": 4,
	    "hostel_name": "Shelter 5",
	    "address": "Nagpur",
	    "contact": "12345678",
	    "about_us": "Dogs, Cats",
	    "hostel_user_id": 2
	}*/
	


	// http://localhost:8080/hostelDetails/update
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean updateHostelDetails(@RequestBody HostelDetails hostel) {
		return hostelDetailsDAOInterface.updateHostelDetails(hostel);
	}

	/*{
	    "id": 6,
	    "hostel_name": "Shelter 5",
	    "address": "Pune",
	    "contact": "12345678",
	    "about_us": "Dogs, Cats",
	    "hostel_user_id": 2
	}*/
	
	
	
	
	// http://localhost:8080/hostelDetails/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deleteHostelDetails(@PathVariable int id) {
		return hostelDetailsDAOInterface.deleteHostelDetails(id);
	}


	// http://localhost:8080/hostelDetails/3
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public HostelDetails getHostelDetails(@PathVariable int id) {
		return hostelDetailsDAOInterface.getHostelDetails(id);
	}
	
	/*{
	    "id": 3,
	    "hostel_name": "Shelter 2",
	    "address": "shirpur",
	    "contact": "12345678",
	    "about_us": "Dogs, Cats",
	    "hostel_user_id": 2
	}*/
	
	
	
	


	// http://localhost:8080/hostelDetails/getAllHostelDetails
	@RequestMapping(value = "/getAllHostelDetails", method = RequestMethod.GET)
	public List<HostelDetails> getAllHostelDetails(){
		return hostelDetailsDAOInterface.getAllHostelDetails();
	}
		
	
	/*[
	    {
	        "id": 1,
	        "hostel_name": "abc hostel",
	        "address": "karwand naka shirpur",
	        "contact": "12345678",
	        "about_us": "hosteler",
	        "hostel_user_id": 2
	    },
	    {
	        "id": 2,
	        "hostel_name": "shelter 1",
	        "address": "shirpur",
	        "contact": "12345678",
	        "about_us": "dogs,cats",
	        "hostel_user_id": 2
	    },
	    {
	        "id": 3,
	        "hostel_name": "Shelter 2",
	        "address": "shirpur",
	        "contact": "12345678",
	        "about_us": "Dogs, Cats",
	        "hostel_user_id": 2
	    }
	]*/
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
