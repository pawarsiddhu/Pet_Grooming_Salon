package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.dao.GroomerAppointmentDAOImpl;
import com.mindgate.pojo.Employee;
import com.mindgate.pojo.GroomerAppointmentDtl;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/GrommerAppointmentController")
public class GrommerAppointmentController {

	@Autowired
	public GroomerAppointmentDAOImpl grommer;


	// http://localhost:8080/GrommerAppointmentController/addGrommer
	@RequestMapping(value = "/addGrommer", method = RequestMethod.POST)
	public boolean addNewGroomerAppointment(@RequestBody GroomerAppointmentDtl groomerAppointmentDtl) {
		return grommer.addNewGroomerAppointment(groomerAppointmentDtl);
	}


	// http://localhost:8080/GrommerAppointmentController/update
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean updateGroomerAppointment(@RequestBody GroomerAppointmentDtl groomerAppointmentDtl) {
		return grommer.updateGroomerAppointment(groomerAppointmentDtl);
	}


	// http://localhost:8080/GrommerAppointmentController/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public boolean deleteGroomerAppointment(@PathVariable int id) {
		return grommer.deleteGroomerAppointment(id);
	}

	// http://localhost:8080/GrommerAppointmentController/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public GroomerAppointmentDtl getOneGrommerAppointmentDtl(@PathVariable int id) {
		return grommer.getGroomerAppointment(id);
	}

	// http://localhost:8080/GrommerAppointmentController/getAllGrommer
	@RequestMapping(value = "/getAllGrommer", method = RequestMethod.GET)
	public List<GroomerAppointmentDtl> getAllGroomerAppointment(){
		return grommer.getAllGroomerAppointment();
	}




}
