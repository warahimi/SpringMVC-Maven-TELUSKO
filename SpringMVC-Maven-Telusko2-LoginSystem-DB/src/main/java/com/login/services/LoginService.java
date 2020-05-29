package com.login.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService {
	public boolean loginToDatabase(String userName, String password)
	{
		String user="hbstudent";
		String pass="hbstudent";
		String url ="jdbc:mysql://localhost:3306/login-system?allowPublicKeyRetrieval=true&useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pass);
			
			PreparedStatement pst = con.prepareStatement("select * from login where user_name=? and password=?");
			pst.setString(1, userName);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
