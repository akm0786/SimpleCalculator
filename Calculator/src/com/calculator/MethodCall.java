package com.calculator;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MethodCall extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int n1 = Integer.parseInt(req.getParameter("num1"));

		int n2 = Integer.parseInt(req.getParameter("num2"));

		String operation = (String) req.getParameter("operation");

		

		req.setAttribute("n1", n1);
		  
		  req.setAttribute("n2", n2);
		RequestDispatcher rd= req.getRequestDispatcher(operation);
		rd.forward(req,res);
		  
		
		/*
		 * switch (operation) {
		 * 
		 * case "Addition":{
		 * 
		 * req.setAttribute("n1", n1);
		 * 
		 * req.setAttribute("n2", n2);
		 * 
		 * res.sendRedirect("Addition"); }
		 * 
		 * case "Subtraction": {
		 * 
		 * req.setAttribute("n1", n1);
		 * 
		 * req.setAttribute("n2", n2);
		 * 
		 * res.sendRedirect("Subtraction"); } case "Multiply": {
		 * 
		 * req.setAttribute("n1",n1);
		 * 
		 * req.setAttribute("n2", n2);
		 * 
		 * res.sendRedirect("Multiply"); }
		 * 
		 * case "Division": {
		 * 
		 * req.setAttribute("n1", n1);
		 * 
		 * req.setAttribute("n2", n2);
		 * 
		 * res.sendRedirect("Division"); } }
		 * 
		 */
	}
}
