package p2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/second1")
public class SecondServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SecondServlet2() {
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getAttribute("name");
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("welcom1.jsp");
		rd.forward(request, response);
	}

}
