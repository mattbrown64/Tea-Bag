package edu.ycp.cs320.lab02.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab02.controller.GameEngineController;
import edu.ycp.cs320.lab02.model.GameEngine;



public class GamePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameEngine model;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("GamePage Servlet: doGet");
		
		req.getRequestDispatcher("/_view/gamePage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		model = new GameEngine(req.getParameter("terminal"));
		GameEngineController controller = new GameEngineController(model);
		controller.process(req.getParameter("input"));
		req.setAttribute("model", model);
		
		req.getRequestDispatcher("/_view/gamePage.jsp").forward(req, resp);
	}
	
	
	
	

	
	
		
}

