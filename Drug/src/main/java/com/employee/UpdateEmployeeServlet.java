package com.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		
		
		boolean isTrue;
		
		isTrue = EmployeeDBUtil.updateemployee(id,name,address,phone,email,department);
		
		if(isTrue == true) {
			
			List<Employee> payDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("employeeView.jsp");
			dis.forward(request, response);
		}
		else {
			List<Employee> payDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
			dis.forward(request, response);
		}
	}

}
