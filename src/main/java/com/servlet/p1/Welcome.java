package com.servlet.p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String name = request.getParameter("name");
		PrintWriter writer = response.getWriter();
		writer.println("My Name is : "+name);
		}

}
