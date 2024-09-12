package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reading")
public class ReadData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ReadData() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junedb","root","test");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from students");
			out.print("<table border='2'>");
			
			out.print("<tr>");
			
			out.print("<th>");
			out.print("ID");
			out.print("</th>");
			
			out.print("<th>");
			out.print("Name");
			out.print("</th>");
		
			out.print("<th>");
			out.print("Email");
			out.print("</th>");
		
		
			out.print("<th>");
			out.print("Mobile");
			out.print("</th>");
		
			
			out.print("<th>");
			out.print("City");
			out.print("</th>");
			
			out.print("</tr>");
			
			while(result.next()) {
				out.print("<tr>");
				out.print("<td>");
			    out.print(result.getString(1));
			    out.print("</td>");
			    out.print("<td>");
			    out.print(result.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(4));
				out.print("</td>");
				out.print("<td>");
				out.println(result.getString(5));
				out.print("</td>");
	
				out.print("</tr>");
			}
			out.print("</table>");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
	}

}
