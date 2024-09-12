package p1;

import java.sql.*;

public class B {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
		   Statement stmnt = 	con.createStatement()	;
		   stmnt.executeUpdate("insert into registration values('salim','salim@gmail.com','9934897073')");
		   con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
