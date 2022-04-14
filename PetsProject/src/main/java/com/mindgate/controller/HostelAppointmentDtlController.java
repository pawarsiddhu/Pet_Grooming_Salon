package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.dao.HostelAppointmentDtlDAOInterface;
import com.mindgate.pojo.Employee;
import com.mindgate.pojo.HostelAppointmentDtl;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/HostelAppointmentDetail")
public class HostelAppointmentDtlController {
	
	
	@Autowired
	public HostelAppointmentDtlDAOInterface hostel;
	
	
	// http://localhost:8080/HostelAppointmentDetail/AddNewHostelApp
	@RequestMapping(value = "/AddNewHostelApp", method = RequestMethod.POST)
	public boolean addNewHostelAppointmentDetails(@RequestBody HostelAppointmentDtl hostelAppointmentDtl) {
		return hostel.addNewHostelAppointmentDetails(hostelAppointmentDtl);
	}
		
	/*{
        "id": 2,
        "pet_user_id": 3,
        "hostel_user_id": 4,
        "appointment_date": "2022-07-07",
        "created_date": "2022-04-05"
    }*/
	
	
	
	// http://localhost:8080/HostelAppointmentDetail/update
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean updateHostelAppointmentDetails(@RequestBody HostelAppointmentDtl hostelAppointmentDtl) {
		return hostel.updateHostelAppointmentDetails(hostelAppointmentDtl);
	}
	
	// http://localhost:8080/HostelAppointmentDetail/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deleteHostelAppointmentDetails(@PathVariable int id) {
		return hostel.deleteHostelAppointmentDetails(id);
	}
	
	
	// http://localhost:8080/HostelAppointmentDetail/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public HostelAppointmentDtl getOneHostelAppointmentDetails(@PathVariable int id) {
		return hostel.getOneHostelAppointmentDetails(id);
	}
	
	/*{
	    "id": 1,
	    "pet_user_id": 2,
	    "hostel_user_id": 1,
	    "appointment_date": "2022-06-02",
	    "created_date": "2022-04-04"
	}*/
	
	
	
	// http://localhost:8080/HostelAppointmentDetail/getAllHostelDetails
	@RequestMapping(value = "/getAllHostelDetails", method = RequestMethod.GET)
	public List<HostelAppointmentDtl> getAllHostelAppointmentDetails(){
		return hostel.getAllHostelAppointmentDetails();
	}
	
	/*[
	    {
	        "id": 1,
	        "pet_user_id": 2,
	        "hostel_user_id": 1,
	        "appointment_date": "2022-06-02",
	        "created_date": "2022-04-04"
	    }
	]*/
	
		
}
