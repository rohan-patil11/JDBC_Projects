package com.utlity;

public class ValidationUtility {
	
	public static boolean isIDzero(int id) {
		if (id <=0) {
			System.out.println("Please Enter Valid Id");
			return true;
		}
		return false;
	}
	
	
	public static boolean isIDString(String id) {
	        try {
	            int num = Integer.parseInt(id); // Convert the string to an integer
	            if (num > 0) {
	                return false; 
	            }
	        } catch (NumberFormatException e) {
	            
	        }
	        System.out.println("Enter a valid positive number ID");
	        return true; 
	    }

	   

	
	//public static void main(String[] args) {
		//ValidationUtility.isIDzero(-45);
		//ValidationUtility.isIDnullORblank("dtfghbn");
		
	//}
}

