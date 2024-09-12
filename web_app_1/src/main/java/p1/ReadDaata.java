package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadDaata")
public class ReadDaata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReadDaata() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		out.print("IRfan");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
			Statement stmnt = con.createStatement();
			ResultSet resultSet = stmnt.executeQuery("select * from registration");
			out.print("<table>");
			out.print("<tr>");
			out.print("<th>");
			out.print("Name");
			out.print("</th>");
			out.print("<th>");
			out.print("Email");
			out.print("</th>");
			out.print("<th>");
			out.print("Mobile");
			out.print("</th>");
			out.print("</tr>");
			while(resultSet.next()) {
				out.print("<tr>");
				out.print("<td>");
				out.print(resultSet.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.print(resultSet.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(resultSet.getString(3));
				out.print("</td>");
				out.print("</tr>");
			}
			out.print("</table>");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		out.print("<input type='text' />");
		
		
		
	}
		
		
	

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
