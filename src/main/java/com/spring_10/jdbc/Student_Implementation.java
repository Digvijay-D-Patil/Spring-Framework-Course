package com.spring_10.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Student_Implementation {

	static String insertQuery = "insert into student(name,address)values(?,?)";
	static String deleteQuery = "DELETE FROM student WHERE id=?";
	static String updateQuery = "UPDATE student SET name = ?, address = ? WHERE id = ?";
	static String displayByIdQuery = "SELECT * FROM student where id = ?";
	static String displayAllQuery = "SELECT * FROM student";

	public static void insertData(JdbcTemplate jd) {

		int val = jd.update(insertQuery, "Digvijay", "Jaysingpur");
		if (val > 0) {
			System.out.println("Successfully inserted");
		} else {
			System.out.println("Insertion failed");
		}
	}

	public static void deleteData(JdbcTemplate jd) {

		int val = jd.update(deleteQuery, 1);
		if (val > 0) {
			System.out.println("Successfully deleted");
		} else {
			System.out.println("deletion failed");
		}
	}

	public static void updateData(JdbcTemplate jd) {

		int val = jd.update(updateQuery, "Atharv", "Kumathe", 2);
		if (val > 0) {
			System.out.println("Successfully updated");
		} else {
			System.out.println("updation failed");
		}
	}

	public static void displayPerticularData(JdbcTemplate jd) {

		RowMapper<String> rowMapper = new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString(2);
				return name;
			}
		};

		try {
			String name = jd.queryForObject(displayByIdQuery, rowMapper, 2);
			System.out.println(name);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("No results found.");
		}

	}

	public static void displayAllData(JdbcTemplate jd) {

		RowMapper<String> rowMapper = new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString(2);
				return name;
			}
		};

		try {
			List<String> list = jd.query(displayAllQuery, rowMapper);
			list.forEach(e -> System.out.println(e));

		} catch (EmptyResultDataAccessException e) {
			System.out.println("No results found.");
		}

	}

}
