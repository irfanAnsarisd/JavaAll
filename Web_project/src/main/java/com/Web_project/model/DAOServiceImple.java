package com.Web_project.model;

import java.sql.*;

public class DAOServiceImple implements DAOService{
	private Connection con;
	private Statement stmnt;
	
	

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb", "root","test");
			stmnt = con.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		
		return false;
	}

	@Override
	public void createRegistration(String name, String email, String password) {
		
		
	}

	@Override
	public void deleteRegistration(String email) {
		
		
	}

	@Override
	public void updateRegistration(String email, String mobile) {
		
		
	}

	@Override
	public ResultSet listAllReg() {
	
		return null;
	}

}
