package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/registration")
public class StudentReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentReg() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email= request.getParameter("email");
		String mobile =  request.getParameter("mobile");
		String city = request.getParameter("city");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
			Statement statement = con.createStatement();
			statement.executeUpdate("insert into students values ('"+id+"','"+name+"','"+email+"','"+mobile+"','"+city+"')");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
