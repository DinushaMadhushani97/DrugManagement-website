<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="home.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="css/emp-style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
	<title>Employee Details Update</title>
	<style type="text/css">
	body{
              
              
          background-image:url("images/drug.jpg");
          background-repeat:no-repeat;
          background-size:cover;
          background-attachment:fixed;
          }   
		table {
  			border-collapse: collapse;
		}

		table, th, td {
		  border: 2px solid #b0c4de;
		  width:50%;
		}
	</style>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		
	%>
	
	<h1 style="color:white ; "><center><b><u>Employee Details Update</u></b></center></h1>
	<br><br>
	<form action="Update" method="post">
	<table class="center" style="width:60%">
	
	<tr>
    	<td scope="col">Employee ID</td>
		<td scope="col"><input type="text" name="id" value="<%= id %>" ></td>
	</tr>
	<tr>
		<td scope="col">Name</td>
		<td scope="col"><input type="text" name="name" value="<%= name %>"></td>
	</tr>
    <tr>
		<td scope="col">Address</td>
		<td scope="col"><input type="text" name="address" value="<%= address %>"></td>
	</tr>
	<tr>
		<td scope="col">Phone-Number</td>
		<td scope="col"><input type="text" name="phone" value="<%= phone %>"></td>
	</tr>
	<tr>
		<td scope="col">Email</td>
		<td scope="col"><input type="text" name="email" value="<%= email %>"></td>
	</tr>
    <tr>
		<td scope="col">Department</td>
		<td scope="col"><input type="text" name="department" value="<%= department %>"></td>
	</tr>
   
	<tr>
		<td scope="col">Update Data</td>
		<td scope="col"><input type="submit" name="submit" value="Update Data"></td>
	</tr>
	
	</table>
	<br>
	
	</form>
	<br><br>

</body>
</html>