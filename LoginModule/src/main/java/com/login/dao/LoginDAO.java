package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO
{

	private String jdbcURL = "jdbc:mysql://localhost:3306/employees?useTimezone=true&serverTimezone=UTC";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	
	public boolean check(String uname, String pass) 
	{
		
		

		
		
		String query = "select * from account where username=? and password=?";
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager
					.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			
			
			
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next()) {
				return true;
			}
			
			}
		

		catch (Exception e) {
			System.out.println(e);
		}
		
		
		return false;
	}
}

