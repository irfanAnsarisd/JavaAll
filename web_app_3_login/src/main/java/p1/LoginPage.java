package p1;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginHere")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginPage() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
				Statement stmnt = con.createStatement();
				ResultSet set = stmnt.executeQuery("select * from login where email = '"+email+"' and password='"+password+"' ");
				if(set.next()) {
					System.out.println("Succesfull");
				}else {
					System.out.println("error");
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
