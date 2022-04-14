package com.mindgate.pojo;

import java.util.Date;

public class HostelAppointmentDtl {


	private int id;
	private int pet_user_id;
	private int hostel_user_id;
	private Date appointment_date;
	private Date created_date;

	public HostelAppointmentDtl() {
		// TODO Auto-generated constructor stub
	}

	public HostelAppointmentDtl(int id, int pet_user_id, int hostel_user_id, Date appointment_date, Date created_date) {
		super();
		this.id = id;
		this.pet_user_id = pet_user_id;
		this.hostel_user_id = hostel_user_id;
		this.appointment_date = appointment_date;
		this.created_date = created_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPet_user_id() {
		return pet_user_id;
	}

	public void setPet_user_id(int pet_user_id) {
		this.pet_user_id = pet_user_id;
	}

	public int getHostel_user_id() {
		return hostel_user_id;
	}

	public void setHostel_user_id(int hostel_user_id) {
		this.hostel_user_id = hostel_user_id;
	}

	public Date getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	@Override
	public String toString() {
		return "HostelAppointmentDtl [id=" + id + ", pet_user_id=" + pet_user_id + ", hostel_user_id=" + hostel_user_id
				+ ", appointment_date=" + appointment_date + ", created_date=" + created_date + "]";
	}







}
