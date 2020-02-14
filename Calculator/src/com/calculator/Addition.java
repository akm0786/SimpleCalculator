package com.calculator;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		int a= (int) req.getAttribute("n1");

		int b=(int) req.getAttribute("n2");
		
		int c=a+b;
		
		 // build HTML code
        String htmlResponse = "<html><body bgcolor="+"orange"+">";
        htmlResponse += "<h2>Your first no. is=" + a + "<br/>";      
        htmlResponse += "Your second no. is=" + b + "</h2><br>";  
        htmlResponse+="<h2>Addition is="+c+"</h2></body>";
        htmlResponse += "</html>";
         
		PrintWriter pr= res.getWriter();
		  pr.println(htmlResponse);

	
	}
}

