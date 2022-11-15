package com.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	
	
	public static List<Employee> getEmployee(String Id) {
		int convertedID = Integer.parseInt(Id);
		ArrayList<Employee> pay = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from emp where id='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String email = rs.getString(5);
				String department = rs.getString(6);
				
				
				Employee p = new Employee(id,name,address,phone,email,department);
				pay.add(p);
			}
			
		} catch (Exception e) {
			
		}
		
		return pay;	
	}
    
    public static boolean insertemployee(String name, String address, String phone, String email, String department) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into emp values(0,'"+name+"','"+address+"','"+phone+"','"+email+"','"+department+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
    public static boolean updateemployee(String id, String name, String address, String phone, String email, String department) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update emp set name='"+name+"',address='"+address+"',phone='"+phone+"',email='"+email+"',department='"+department+"'"
    				+ "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
    public static List<Employee> getEmployeeDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);
    	
    	ArrayList<Employee> pay = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from emp where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			
    			int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String email = rs.getString(5);
				String department = rs.getString(6);
				
				
    			Employee p = new Employee(id,name,address,phone,email,department);
    			pay.add(p);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return pay;	
    }
    
    
    public static boolean deleteEmployee(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from emp where id='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }

	


    
}