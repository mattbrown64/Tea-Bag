package edu.ycp.cs320.lab02.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab02.controller.CreateAccountController;
import edu.ycp.cs320.lab02.controller.GameEngineController;
import edu.ycp.cs320.lab02.controller.LogInController;
import edu.ycp.cs320.lab02.model.Account;
import edu.ycp.cs320.lab02.model.GameEngine;



public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Account user;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("CreateAccount Servlet: doGet");
		
		req.getRequestDispatcher("/_view/CreateAccount.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		user = new Account();
		CreateAccountController controller = new CreateAccountController(user);
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String passwordConfirm = req.getParameter("passwordConfirm");
		System.out.println(username+password+passwordConfirm);
		if(controller.setPassword(password,passwordConfirm)) {
			controller.setUsername(username);
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
		req.setAttribute("result", "Passwords dont match, try again");
		req.getRequestDispatcher("/_view/CreateAccount.jsp").forward(req, resp);
	}
}
	