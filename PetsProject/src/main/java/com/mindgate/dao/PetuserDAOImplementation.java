package com.mindgate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Petuser;

@Repository
public class PetuserDAOImplementation implements PetuserDAOInterface{


	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static String INSERT_PETUSER = "insert into Petuser values(?,?,?,?,?,?)";
	private static String UPDATE_PETUSER = "update Petuser set name=?, pet_type=?, username=?, password=?, create_date=? where id=?";
	private static String DELETE_PETUSER = "delete from Petuser where id=?";
	private static String GET_ONE_PETUSER = "select * from Petuser where id=?";
	private static String GET_ALL_PETUSER = "select * from  Petuser;";



	@Override
	public boolean addNewPetUser(Petuser petuser) {
		jdbcTemplate.update(INSERT_PETUSER,
				petuser.getId(),
				petuser.getName(),
				petuser.getPet_type(),
				petuser.getUsername(),
				petuser.getPassword(),
				petuser.getCreate_date());
		
		System.out.println("DataInserted");
		return true;

	}
	@Override
	public boolean updatePetUser(Petuser petuser) {
		jdbcTemplate.update(UPDATE_PETUSER,
				petuser.getId(),
				petuser.getName(),
				petuser.getPet_type(),
				petuser.getUsername(),
				petuser.getPassword(),
				petuser.getCreate_date());

		return true;

	}


	@Override
	public boolean deletePetUser(int id) {
		jdbcTemplate.update(DELETE_PETUSER,id);
		return true;
	}


	@Override
	public Petuser getOnePetUser(int id) {
		Petuser p=jdbcTemplate.queryForObject(GET_ONE_PETUSER, new PetuserRowMapper(),id);
		return p;
	}

	@Override
	public List<Petuser> getAllPetUser() {
		List<Petuser> p=jdbcTemplate.query(GET_ALL_PETUSER, new PetuserRowMapper());
		return p;
	}


	public final static class PetuserRowMapper implements RowMapper<Petuser>{

		@Override
		public Petuser mapRow(ResultSet rs, int rowNum) throws SQLException {
			Petuser p=new Petuser();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPet_type(rs.getString("pet_type"));
			p.setUsername(rs.getString("username"));
			p.setPassword(rs.getString("password"));
			p.setCreate_date(rs.getDate("create_date"));

			return p;
		}

	}



}
