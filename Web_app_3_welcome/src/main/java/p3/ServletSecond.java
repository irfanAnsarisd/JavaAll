package p3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/secondS")
public class ServletSecond extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletSecond() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getAttribute("name");
		
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("welcome1.jsp");
		rd.forward(request, response);
		
		}

}
