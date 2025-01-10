package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.*;
import com.utlity.Utility;

public class AllEmployeeDetails {
	static public ArrayList<Employee> AllEmployees(){
		ArrayList<Employee> Alemp = new ArrayList<>();
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Utility.LoadDriver("com.mysql.cj.jdbc.Driver");
			//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RPBank","root","root");
			Connection connection=Utility.connection("jdbc:mysql://localhost:3306/RPBank","root","root");
			String sql = "select * from BankEmployees";
			  PreparedStatement pstmt = Utility.CreatePreStmt(sql, connection);
			  ResultSet rs = Utility.CreateResultset(pstmt);
			  while(rs.next()) {
					Employee ee = new Employee();
					int Id = rs.getInt(1);
				  	String Name = rs.getString(2);
				  	int Salary = rs.getInt(3);
				  	ee.setEmpId(Id);
				  	ee.setEmpName(Name);
				  	ee.setEmpSalary(Salary);
				  	Alemp.add(ee);
			  }
		} catch (Exception e) {
			e.printStackTrace();
} 
	 
	
	  return Alemp;
	}
}


