package com.mindgate.dao;

import java.util.List;

import com.mindgate.pojo.GroomerAppointmentDtl;



public interface GroomerAppointmentDtlDAOInterface {
	

	public boolean addNewGroomerAppointment(GroomerAppointmentDtl groomerAppointmentDtl);
	public boolean updateGroomerAppointment(GroomerAppointmentDtl groomerAppointmentDtl);
	public boolean deleteGroomerAppointment(int id);
	public GroomerAppointmentDtl getGroomerAppointment(int id);
	public List<GroomerAppointmentDtl> getAllGroomerAppointment();
	
	
	
	
}
