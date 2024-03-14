package edu.ycp.cs320.lab02.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab02.controller.LogInController;
import edu.ycp.cs320.lab02.model.Account;

//import edu.ycp.cs320.lab02.controller.GameEngineController;
//import edu.ycp.cs320.lab02.model.GameEngine;

public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Account user = new Account();
	private String usernameNew;
	private String passwordNew;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doGet");
		
		
		usernameNew = req.getParameter("usernameNew");
		passwordNew = req.getParameter("passwordNew");
		System.out.println(usernameNew+" "+passwordNew);
		System.out.println(user.getUsername()+"i"+user.getPassword());
		
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		usernameNew = "a";
		passwordNew = "b";
		System.out.println(usernameNew+" "+passwordNew);
		System.out.println(user.getUsername()+"i"+user.getPassword());
		user.setUsername(usernameNew);
		user.setPassword(passwordNew);
		System.out.println(user.getUsername()+user.getPassword());
		LogInController controller = new LogInController(user);
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(controller.login(username, password)) {
			req.getRequestDispatcher("/_view/gamePage.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("result", "incorrect username/password \n \n please try again");
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
		
	}
}