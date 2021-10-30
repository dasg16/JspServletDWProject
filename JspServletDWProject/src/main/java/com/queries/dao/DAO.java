package com.queries.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	public static boolean validateCredentials(String username, String password)
			throws SQLException, ClassNotFoundException {

		boolean decision = false;
		String url = "jdbc:mysql://localhost:3306/prod";
		String dbUsername = "root";
		String dbPassword = "root";
		String sql = "Select * from alien where aName = '" + username + "' and alienBreedType = '" + password + "'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			decision = true;
		}
		return decision;

	}
}
