package com.controller;

import java.util.ArrayList;
import com.entity.Employee;
import com.services.EmployeeServices;
import com.utlity.ValidationUtility;

public class Controller {
	
	static public ArrayList<Employee> FetchAllEmployees() throws Exception {
		
		return EmployeeServices.getAllEmployeeDetails();
	}	
	
static public Employee getEmployeeDetailsById(int empid){
	Employee employee  =null;
		if(ValidationUtility.isIDzero(empid)== false) {
	
			  employee=EmployeeServices.FetchEmployeeDetailsById(empid);	
		}
		return employee ;
	}	

static public void ClearEmployeeDetailsByID(int Id) throws Exception {
	
	EmployeeServices.deleteEmployeeDetailsByID(Id);
  }
	
	
}


