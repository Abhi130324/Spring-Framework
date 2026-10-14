package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;


public class StudentRowMapper implements RowMapper<Student> {//this will be use for mapping class we also required a bean class and type is s
	

	@Override
	public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		
		Student std = new Student();//because it is returning value in student
		std.setRollno(rs.getInt("std_roll"));
		std.setName(rs.getString("std_name"));
		std.setMarks(rs.getFloat("std_marks"));
		return std;//after this it will store in list
	
	}
}


	