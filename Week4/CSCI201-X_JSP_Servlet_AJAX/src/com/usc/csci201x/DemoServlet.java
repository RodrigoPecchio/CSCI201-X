package com.usc.csci201x;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "/results.jsp";
		String ajaxString = request.getParameter("ajax");
		if (ajaxString != null && !ajaxString.isEmpty()) {
			String searchString = request.getParameter("search");
			request.setAttribute("results", "Your search query is: " + searchString);
			response.getWriter().print("AJAX returned.");
		} else {
			String nameString = request.getParameter("nameInput");
			String emailString = request.getParameter("emailInput");
			String messageString = request.getParameter("messageInput");
			System.out.println(nameString);
			System.out.println(emailString);
			System.out.println(messageString);
			if (nameString == null || nameString.isEmpty()) {
				nextPage = "/index.jsp";
				request.setAttribute("errorMessage", "Please enter a name!");
			}
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
