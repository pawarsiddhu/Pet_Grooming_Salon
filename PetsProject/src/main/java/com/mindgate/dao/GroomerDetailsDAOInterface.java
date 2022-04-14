package com.mindgate.dao;

import java.util.List;


import com.mindgate.pojo.GroomerDetails;

public interface GroomerDetailsDAOInterface {
	
	public boolean addNewGroomerDetails(GroomerDetails groomerDetails);
	public boolean updateGroomerDetails(GroomerDetails groomerDetails);
	public boolean deleteGroomerDetails(int id);
	public GroomerDetails getOneGroomerDetails(int id);
	public List<GroomerDetails> getAllGroomerDetails();	
	
}
