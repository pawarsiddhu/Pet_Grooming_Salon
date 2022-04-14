package com.mindgate.pojo;

public class GroomerDetails {


	private int id;
	private String groomer_name;
	private String description;
	private int contact;
	private String address;


	
	public GroomerDetails() {
		// TODO Auto-generated constructor stub
	}



	public GroomerDetails(int id, String groomer_name, String description, int contact, String address) {
		super();
		this.id = id;
		this.groomer_name = groomer_name;
		this.description = description;
		this.contact = contact;
		this.address = address;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getGroomer_name() {
		return groomer_name;
	}



	public void setGroomer_name(String groomer_name) {
		this.groomer_name = groomer_name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getContact() {
		return contact;
	}



	public void setContact(int contact) {
		this.contact = contact;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "GroomerDetails [id=" + id + ", groomer_name=" + groomer_name + ", description=" + description
				+ ", contact=" + contact + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
