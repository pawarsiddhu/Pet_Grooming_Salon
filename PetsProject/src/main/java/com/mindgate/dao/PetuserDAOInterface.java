package com.mindgate.dao;


import java.util.List;

import com.mindgate.pojo.Petuser;


public interface PetuserDAOInterface {
	
	
	public boolean addNewPetUser(Petuser petuser);
	public boolean updatePetUser(Petuser petuser);
	public boolean deletePetUser(int id);
	public Petuser getOnePetUser(int id);
	public List<Petuser> getAllPetUser();
	
	
}
