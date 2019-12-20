package fr.dawan.tileee.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> mot = new ArrayList<String>();
		ArrayList<String> traduction = new ArrayList<String>();
		
		for(String x : request.getParameterValues("mot"))
			mot.add(x.toLowerCase());
		
		for(String x : request.getParameterValues("traduction"))
			traduction.add(x.toLowerCase());
		
		request.setAttribute("mot", mot);
		request.setAttribute("traduction", traduction);
		request.getRequestDispatcher("WEB-INF/views/demo.jsp").forward(request,response);

	}

}
