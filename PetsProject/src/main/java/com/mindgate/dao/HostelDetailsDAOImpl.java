package com.mindgate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.pojo.HostelDetails;

@Repository
public class HostelDetailsDAOImpl implements HostelDetailsDAOInterface{


	@Autowired
	public JdbcTemplate jdbcTemplate;

	private static String INSERT_HOSTELDETAILS = "insert into HostelDetails values(?,?,?,?,?,?)";
	private static String UPDATE_HOSTELDETAILS = "update HostelDetails set hostel_name=?, address=?, contact=?, about_us=?,hostel_user_id=? where id=?";
	private static String DELETE_HOSTELDETAILS = "delete from HostelDetails where id=?";
	private static String GET_ONE_HOSTELDETAILS = "select * from HostelDetails where id=?";
	private static String GET_ALL_HOSTELDETAILS = "select * from  HostelDetails;";


	@Override
	public boolean addNewHostelDetails(HostelDetails hostel) {

		jdbcTemplate.update(INSERT_HOSTELDETAILS,
				hostel.getId(),
				hostel.getHostel_name(),
				hostel.getAddress(),
				hostel.getContact(),
				hostel.getAbout_us(),
				hostel.getHostel_user_id());

		return true;
	}

	@Override
	public boolean updateHostelDetails(HostelDetails hostel) {
		jdbcTemplate.update(UPDATE_HOSTELDETAILS, 
				hostel.getId(),
				hostel.getHostel_name(),
				hostel.getAddress(),
				hostel.getContact(),
				hostel.getAbout_us(),
				hostel.getHostel_user_id());


		return true;
	}

	@Override
	public boolean deleteHostelDetails(int id) {

		jdbcTemplate.update(DELETE_HOSTELDETAILS, id);
		return true;
	}

	@Override
	public HostelDetails getHostelDetails(int id) {

		HostelDetails h=jdbcTemplate.queryForObject(GET_ONE_HOSTELDETAILS, 
				new HostelDetailsRowMapper(),
				id);
		return h;
	}

	@Override
	public List<HostelDetails> getAllHostelDetails() {

		List<HostelDetails> h=jdbcTemplate.query(GET_ALL_HOSTELDETAILS,
				new HostelDetailsRowMapper()
				);

		return h;
	}


	public final static class HostelDetailsRowMapper implements RowMapper<HostelDetails>{
		@Override
		public HostelDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			HostelDetails h=new HostelDetails();

			h.setId(rs.getInt("id"));
			h.setHostel_name(rs.getString("hostel_name"));
			h.setAddress(rs.getString("address"));
			h.setContact(rs.getString("contact"));
			h.setAbout_us(rs.getString("about_us"));
			h.setHostel_user_id(rs.getInt("hostel_user_id"));



			return h;
		}

	}







}
