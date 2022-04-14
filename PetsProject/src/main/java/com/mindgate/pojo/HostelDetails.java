package com.mindgate.pojo;

public class HostelDetails {
	
	
	private int id;
	private String hostel_name;
	private String address;
	private String contact;
	private String about_us;
	private int hostel_user_id;
	
	
	public HostelDetails() {
		// TODO Auto-generated constructor stub
	}


	public HostelDetails(int id, String hostel_name, String address, String contact, String about_us,
			int hostel_user_id) {
		super();
		this.id = id;
		this.hostel_name = hostel_name;
		this.address = address;
		this.contact = contact;
		this.about_us = about_us;
		this.hostel_user_id = hostel_user_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHostel_name() {
		return hostel_name;
	}


	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getAbout_us() {
		return about_us;
	}


	public void setAbout_us(String about_us) {
		this.about_us = about_us;
	}


	public int getHostel_user_id() {
		return hostel_user_id;
	}


	public void setHostel_user_id(int hostel_user_id) {
		this.hostel_user_id = hostel_user_id;
	}


	@Override
	public String toString() {
		return "HostelDetails [id=" + id + ", hostel_name=" + hostel_name + ", address=" + address + ", contact="
				+ contact + ", about_us=" + about_us + ", hostel_user_id=" + hostel_user_id + "]";
	}
	
	
	
	
	
	
	
}
