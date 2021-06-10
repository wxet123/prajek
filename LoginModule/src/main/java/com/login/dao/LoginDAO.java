package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO
{


	
	
	public boolean check(String uname, String pass) 
	{
		
		String jdbcURL = "jdbc:mysql://localhost:3306/batman?useTimezone=true&serverTimezone=UTC";
		String password = "Neverwinter132!";

		
		
		String query = "select * from login where uname=? and pass=?";
		
		
		try {
			
			
			Connection conn = DriverManager.getConnection(jdbcURL, "root", password);
			PreparedStatement pst = conn.prepareStatement(query);
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
