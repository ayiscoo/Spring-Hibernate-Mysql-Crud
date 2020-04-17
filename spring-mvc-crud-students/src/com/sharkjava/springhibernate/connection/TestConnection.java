package com.sharkjava.springhibernate.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;

/**
 * Servlet implementation class TestConnection
 */
@WebServlet("/TestConnection")
public class TestConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		String user = "student";
		String pass = "student";
		String jdbcURL = "jdbc:mysql://localhost:3306/student-spring-hibernate?useSSL=false";
		String driver ="com.mysql.jdbc.Driver";
		
		try{
			PrintWriter out = response.getWriter();
			out.println("connecting URL :" + jdbcURL);
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcURL,user,pass);
			out.println("SUCCESS");
			myConn.close();
		}catch (Exception exe){
			exe.printStackTrace();
		}
		
	}

}
