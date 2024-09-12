package p1;

import java.sql.*;

public class A {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
			Statement statement = con.createStatement();
			ResultSet results = statement.executeQuery("select * from registration");
			
			while(results.next()) {
				System.out.println(results.getString(1));
				System.out.println(results.getString(2));
				System.out.println(results.getString(3));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
