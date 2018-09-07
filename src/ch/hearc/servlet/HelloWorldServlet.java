package ch.hearc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
	name="heloWordlServlet",
	urlPatterns = "/hello"
			
)
public class HelloWorldServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String qui = req.getParameter("qui");
		
		req.setAttribute("hellomsg", qui);
		
		RequestDispatcher view = req.getRequestDispatcher("helloworld.jsp");
        view.forward(req, resp);
		
	}
	
	

	
}
