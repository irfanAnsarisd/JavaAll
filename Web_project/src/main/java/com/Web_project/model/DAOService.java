package com.Web_project.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyLogin(String email, String password);
	public void createRegistration(String name, String email, String password);
	public void deleteRegistration(String email);
	public void updateRegistration(String email, String mobile);
	
	public ResultSet listAllReg();

}
