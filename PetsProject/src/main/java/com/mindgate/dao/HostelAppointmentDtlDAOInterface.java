package com.mindgate.dao;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.pojo.HostelAppointmentDtl;

public interface HostelAppointmentDtlDAOInterface {

	
	public boolean addNewHostelAppointmentDetails(HostelAppointmentDtl hostelAppointmentDtl);
	public boolean updateHostelAppointmentDetails(HostelAppointmentDtl hostelAppointmentDtl);
	public boolean deleteHostelAppointmentDetails(int id);
	public HostelAppointmentDtl getOneHostelAppointmentDetails(int id);
	public List<HostelAppointmentDtl> getAllHostelAppointmentDetails();

	
	
	
	
}
