package com.mindgate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.pojo.HostelAppointmentDtl;

@Repository
public class HostelAppointmentDtlDAOImpl implements HostelAppointmentDtlDAOInterface{

	@Autowired
	private JdbcTemplate jdbcTemplate;


	private static String INSERT_EMPLOYEE = "insert into HostelAppointmentDtl values(?,?,?,?,?)";
	private static String UPDATE_EMPLOYEE = "update HostelAppointmentDtl set pet_user_id=?, hostel_user_id=?, appointment_date=?, created_date=? where id=?";
	private static String DELETE_EMPLOYEE = "delete from HostelAppointmentDtl where id=?";
	private static String GET_ONE_EMPLOYEE = "select * from HostelAppointmentDtl where id=?";
	private static String GET_ALL_EMPLOYEE = "select * from  HostelAppointmentDtl;";


	@Override
	public boolean addNewHostelAppointmentDetails(HostelAppointmentDtl hostelAppointmentDtl) {

		jdbcTemplate.update(INSERT_EMPLOYEE, 
				hostelAppointmentDtl.getId(),
				hostelAppointmentDtl.getPet_user_id(),
				hostelAppointmentDtl.getHostel_user_id(),
				hostelAppointmentDtl.getAppointment_date(),
				hostelAppointmentDtl.getCreated_date());


		return true;
	}

	@Override
	public boolean updateHostelAppointmentDetails(HostelAppointmentDtl hostelAppointmentDtl) {

		jdbcTemplate.update(UPDATE_EMPLOYEE,
				hostelAppointmentDtl.getId(),
				hostelAppointmentDtl.getPet_user_id(),
				hostelAppointmentDtl.getHostel_user_id(),
				hostelAppointmentDtl.getAppointment_date(),
				hostelAppointmentDtl.getCreated_date());

		return true;
	}

	@Override
	public boolean deleteHostelAppointmentDetails(int id) {
		jdbcTemplate.update(DELETE_EMPLOYEE,id);
		return true;
	}

	@Override
	public HostelAppointmentDtl getOneHostelAppointmentDetails(int id) {
		HostelAppointmentDtl hostel=jdbcTemplate.queryForObject(GET_ONE_EMPLOYEE,
				new HostelAppointmentRowMapper(),
				id);
		return hostel;
	}

	@Override
	public List<HostelAppointmentDtl> getAllHostelAppointmentDetails() {
		
		List<HostelAppointmentDtl> h=jdbcTemplate.query(GET_ALL_EMPLOYEE,
				new HostelAppointmentRowMapper());
		return h;
	}

	public final static class HostelAppointmentRowMapper implements RowMapper<HostelAppointmentDtl>{

		@Override
		public HostelAppointmentDtl mapRow(ResultSet rs, int rowNum) throws SQLException {
			HostelAppointmentDtl h=new HostelAppointmentDtl();

			h.setId(rs.getInt("id"));
			h.setPet_user_id(rs.getInt("pet_user_id"));
			h.setHostel_user_id(rs.getInt("hostel_user_id"));
			h.setAppointment_date(rs.getDate("appointment_date"));
			h.setCreated_date(rs.getDate("created_date"));

			return h;


		}

	}



}
