package com.mindgate.dao;

import java.util.List;

import com.mindgate.pojo.Users;



public interface UsersDAOInterface {
	
	public boolean addNewUser(Users users);
	public boolean updateUser(Users users);
	public boolean deleteUser(int id);
	public Users getOneUser(int id);
	public List<Users> getAllEmployee();

}
