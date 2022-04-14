package com.mindgate.pojo;

import java.util.Date;

public class GroomerAppointmentDtl {
	
	private int id;
	private int pet_user_id;
	private int groomer_user_id;
	private Date appointment_date;
	private Date created_date;
		
	public GroomerAppointmentDtl() {
		// TODO Auto-generated constructor stub
	}

	public GroomerAppointmentDtl(int id, int pet_user_id, int groomer_user_id, Date appointment_date,
			Date created_date) {
		super();
		this.id = id;
		this.pet_user_id = pet_user_id;
		this.groomer_user_id = groomer_user_id;
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

	public int getGroomer_user_id() {
		return groomer_user_id;
	}

	public void setGroomer_user_id(int groomer_user_id) {
		this.groomer_user_id = groomer_user_id;
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
		return "GroomerAppointmentDtl [id=" + id + ", pet_user_id=" + pet_user_id + ", groomer_user_id="
				+ groomer_user_id + ", appointment_date=" + appointment_date + ", created_date=" + created_date + "]";
	}
	
	
}
