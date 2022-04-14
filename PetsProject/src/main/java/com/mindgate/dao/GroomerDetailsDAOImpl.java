package com.mindgate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.pojo.GroomerAppointmentDtl;
import com.mindgate.pojo.GroomerDetails;

@Repository
public class GroomerDetailsDAOImpl implements GroomerDetailsDAOInterface{

	@Autowired
	public JdbcTemplate jdbcTemplate;


	private static String INSERT_GROOMERDETAILS = "insert into GroomerDetails values(?,?,?,?,?)";
	private static String UPDATE_GROOMERDETAILS = "update GroomerDetails set groomer_name=?,description=?,contact=?,address=? where id=?";
	private static String DELETE_GROOMERDETAILS = "delete from GroomerDetails where id=?";
	private static String GET_ONE_GROOMERDETAILS = "select * from GroomerDetails where id=?";
	private static String GET_ALL_GROOMERDETAILS = "select * from  GroomerDetails;";

	@Override
	public boolean addNewGroomerDetails(GroomerDetails groomerDetails) {

		jdbcTemplate.update(INSERT_GROOMERDETAILS,
				groomerDetails.getId(),
				groomerDetails.getGroomer_name(),
				groomerDetails.getDescription(),
				groomerDetails.getContact(),
				groomerDetails.getAddress());
		return true;
	}



	@Override
	public boolean updateGroomerDetails(GroomerDetails groomerDetails) {

		jdbcTemplate.update(UPDATE_GROOMERDETAILS,
				groomerDetails.getId(),
				groomerDetails.getGroomer_name(),
				groomerDetails.getDescription(),
				groomerDetails.getContact(),
				groomerDetails.getAddress());


		return true;
	}

	@Override
	public boolean deleteGroomerDetails(int id) {

		jdbcTemplate.update(DELETE_GROOMERDETAILS,id);

		return true;
	}


	@Override
	public GroomerDetails getOneGroomerDetails(int id) {

		GroomerDetails g=jdbcTemplate.queryForObject(GET_ONE_GROOMERDETAILS, 
				new GroomerDetailsRowMapper(),
				id);
		return g;
	}

	@Override
	public List<GroomerDetails> getAllGroomerDetails() {

		List<GroomerDetails> g=jdbcTemplate.query(GET_ALL_GROOMERDETAILS,
				new GroomerDetailsRowMapper());

		return g;
	}



	public final static class GroomerDetailsRowMapper implements RowMapper<GroomerDetails>{

		@Override
		public GroomerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			GroomerDetails g=new GroomerDetails();

			g.setId(rs.getInt("id"));
			g.setGroomer_name(rs.getString("groomer_name"));
			g.setDescription(rs.getString("description"));
			g.setContact(rs.getInt("contact"));
			g.setAddress(rs.getString("address"));

			return g;
		}

	}






}
