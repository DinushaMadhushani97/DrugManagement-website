package com.employee;

public class Employee {     // data increment
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String department;
   
    
   
    public Employee(int id, String name, String address, String phone, String email, String department){ //constructors
	this.id = id;
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.department = department;
    }


//getters
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getAddress() {
		return address;
	}



	public String getPhone() {
		return phone;
	}



	public String getEmail() {
		return email;
	}



	public String getDepartment() {
		return department;
	}
    
    
    
    


	
}  

	    