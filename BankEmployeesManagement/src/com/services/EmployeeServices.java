package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dao.AllEmployeeDetails;
import com.entity.Employee;

public class EmployeeServices {
	
	static public ArrayList<Employee> getAllEmployeeDetails() throws Exception{
		ArrayList<Employee> ee = AllEmployeeDetails.AllEmployees();
		for (Employee employee : ee) {
			System.out.println(employee.getEmpId());
			System.out.println(employee.getEmpName());
			System.out.println(employee.getEmpSalary());
		}	
		return ee;
	}
	
	static public Employee FetchEmployeeDetailsById(int Id){
		ArrayList<Employee> e1 = AllEmployeeDetails.AllEmployees();
		Employee ee = new Employee();
		for (Employee employee : e1) {
			if(Id ==employee.getEmpId()) {
				ee.setEmpId(employee.getEmpId());
				ee.setEmpName(employee.getEmpName());
				ee.setEmpSalary(employee.getEmpSalary());
				System.out.println("Empid="+ ee.getEmpId());
				System.out.println("EmpName="+ ee.getEmpName());
				System.out.println("EmpSalary="+ ee.getEmpSalary());

			}
		}
		return ee;	
	}
	
	Employee FetchEmployeeDetailsByName(String Name) throws Exception {
		ArrayList<Employee> e1 = AllEmployeeDetails.AllEmployees();
		Employee ee = new Employee();
		for (Employee employee : e1) {
			if(Name ==employee.getEmpName()) {
				ee.setEmpId(employee.getEmpId());
				ee.setEmpName(employee.getEmpName());
				ee.setEmpSalary(employee.getEmpSalary());
				System.out.println("Empid="+ ee.getEmpId());
				System.out.println("EmpName="+ ee.getEmpName());
				System.out.println("EmpSalary="+ ee.getEmpSalary());
			}
		}
			return ee;
	}
	
	Employee getEmployeeDetailsBySalary(int Salary) {
		ArrayList<Employee> e1 = AllEmployeeDetails.AllEmployees();
		Employee ee = new Employee();
		for (Employee employee : e1) {
			if(Salary ==employee.getEmpSalary()) {
				ee.setEmpId(employee.getEmpId());
				ee.setEmpName(employee.getEmpName());
				ee.setEmpSalary(employee.getEmpSalary());
				System.out.println("Empid="+ ee.getEmpId());
				System.out.println("EmpName="+ ee.getEmpName());
				System.out.println("EmpSalary="+ ee.getEmpSalary());
			}
		}return null;	
	}
	static public void deleteEmployeeDetailsByID(int Id) throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RPBank","root","root");
		  String sql = "delete from bankemployees where empId=?";
		  PreparedStatement pstmt = connection.prepareStatement(sql);
		  pstmt.setInt(1, Id);
		  int rs = pstmt.executeUpdate();
		  if(rs >0) {
			  System.out.println("****EmployeeData Deleted Successfully****");
		  }else {
			  System.out.println("****Wrong Employee ID****");
		  }
		
	}
	
	
	
}
