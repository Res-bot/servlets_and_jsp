package com.prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/square")
public class SquareNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SquareNum() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int k = Integer.parseInt(request.getParameter("k"));
		
		k = k*k;
 
		
		PrintWriter out = response.getWriter();
		out.println( "the square of the sum is: " + k);
		

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
