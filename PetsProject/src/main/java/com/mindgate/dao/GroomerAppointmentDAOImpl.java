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
import com.mindgate.pojo.GroomerAppointmentDtl;

@Repository
public class GroomerAppointmentDAOImpl implements GroomerAppointmentDtlDAOInterface{
		
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	private static String INSERT_GROOMERAPPOINTMENTDTL = "insert into GroomerAppointmentDtl values(?,?,?,?,?)";
	private static String UPDATE_GROOMERAPPOINTMENTDTL = "update GroomerAppointmentDtl set pet_user_id=?, groomer_user_id=?,appointment_date=?, created_date=? where id=?";
	private static String DELETE_GROOMERAPPOINTMENTDTL = "delete from GroomerAppointmentDtl where id=?";
	private static String GET_ONE_GROOMERAPPOINTMENTDTL = "select * from GroomerAppointmentDtl where id=?";
	private static String GET_ALL_GROOMERAPPOINTMENTDTL = "select * from  GroomerAppointmentDtl;";
	
	
	@Override
	public boolean addNewGroomerAppointment(GroomerAppointmentDtl groomerAppointmentDtl) {
		
		jdbcTemplate.update(INSERT_GROOMERAPPOINTMENTDTL, 
				groomerAppointmentDtl.getId(),
				groomerAppointmentDtl.getPet_user_id(),
				groomerAppointmentDtl.getGroomer_user_id(),
				groomerAppointmentDtl.getAppointment_date(),
				groomerAppointmentDtl.getCreated_date());
		
		return true;
	}

	@Override
	public boolean updateGroomerAppointment(GroomerAppointmentDtl groomerAppointmentDtl) {
		
		jdbcTemplate.update(UPDATE_GROOMERAPPOINTMENTDTL,
				groomerAppointmentDtl.getId(),
				groomerAppointmentDtl.getPet_user_id(),
				groomerAppointmentDtl.getGroomer_user_id(),
				groomerAppointmentDtl.getAppointment_date(),
				groomerAppointmentDtl.getCreated_date());
		return true;
	}

	@Override
	public boolean deleteGroomerAppointment(int id) {
		jdbcTemplate.update(DELETE_GROOMERAPPOINTMENTDTL, id);
		return true;
	}

	@Override
	public GroomerAppointmentDtl getGroomerAppointment(int id) {
		
		GroomerAppointmentDtl g=jdbcTemplate.queryForObject(GET_ONE_GROOMERAPPOINTMENTDTL, 
				new GroomerAppointmentRowMapper(),
				id);
		
		return g;
	}

	@Override
	public List<GroomerAppointmentDtl> getAllGroomerAppointment() {
		
		List<GroomerAppointmentDtl> g=jdbcTemplate.query(GET_ALL_GROOMERAPPOINTMENTDTL,
				new GroomerAppointmentRowMapper());
		
		return g;
	}
	

	public final static class GroomerAppointmentRowMapper implements RowMapper<GroomerAppointmentDtl>{

		@Override
		public GroomerAppointmentDtl mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			GroomerAppointmentDtl g=new GroomerAppointmentDtl();
			
			g.setId(rs.getInt("id"));
			g.setPet_user_id(rs.getInt("pet_user_id"));
			g.setGroomer_user_id(rs.getInt("groomer_user_id"));
			g.setAppointment_date(rs.getDate("groomer_user_id"));
			g.setCreated_date(rs.getDate("appointment_date"));
			return g;
		}
		
	}
	
	
	
}
