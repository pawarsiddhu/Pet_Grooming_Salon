package com.mindgate.pojo;

import java.util.Date;

public class Petuser {
	
	private int id;
	private String name;
	private String pet_type;
	private String username;
	private String password;
	private Date create_date;
			  
	public Petuser() {
		// TODO Auto-generated constructor stub
	}

	public Petuser(int id, String name, String pet_type, String username, String password, Date create_date) {
		super();
		this.id = id;
		this.name = name;
		this.pet_type = pet_type;
		this.username = username;
		this.password = password;
		this.create_date = create_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPet_type() {
		return pet_type;
	}

	public void setPet_type(String pet_type) {
		this.pet_type = pet_type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "Petuser [id=" + id + ", name=" + name + ", pet_type=" + pet_type + ", username=" + username
				+ ", password=" + password + ", create_date=" + create_date + "]";
	}
	
	
	
	
}
