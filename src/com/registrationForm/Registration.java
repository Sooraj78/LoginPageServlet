package com.registrationForm;

import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		super.doPost(req, resp);
		System.out.println("Form For Registration ");
		
		String rollNo=req.getParameter("RollNo");
		System.out.println(rollNo);
		
		String fName=req.getParameter("FirstName");
		System.out.println(fName);
		
		String lName=req.getParameter("LastName");
		System.out.println(lName);
		
		String cGrade=req.getParameter("ClassGrade");
		System.out.println(cGrade);
		
		String dob=req.getParameter("DateOfBirth");
		System.out.println(dob);
		
		String yoj=req.getParameter("YearOfJoining");
		System.out.println(yoj);
		
		String percen=req.getParameter("Percentage");
		System.out.println(percen);
		
		
	
	try
	{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "tiger");
		String query="insert into Student values("+rollNo+",' " +fName+" ' ,'"+lName+"',' "+cGrade+" ',' "+dob+" ',' "+yoj +" ', "+percen+"   );";
		Statement st=conn.createStatement();
		int rs=st.executeUpdate(query);
		System.out.println(rs);
	}
	catch (SQLException e) 
	{
	e.printStackTrace();
	}
}
}
