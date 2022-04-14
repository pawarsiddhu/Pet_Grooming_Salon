package com.mindgate.dao;

import java.util.List;

import com.mindgate.pojo.HostelDetails;


public interface HostelDetailsDAOInterface {
	
	public boolean addNewHostelDetails(HostelDetails hostel);
	public boolean updateHostelDetails(HostelDetails hostel);
	public boolean deleteHostelDetails(int id);
	public HostelDetails getHostelDetails(int id);
	public List<HostelDetails> getAllHostelDetails();
	
	
	
}
