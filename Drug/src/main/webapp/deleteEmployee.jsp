<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="home.jsp" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/emp-style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<title>Payment Delete</title>

<style type="text/css">
        
         body{
              
              
                background-image:url("images/drug.jpg");
                background-repeat:no-repeat;
                background-size:cover;
                background-attachment:fixed;
            
             }
		table {
  			border-collapse: collapse;
  			background-color:white;
  			
		}

		table, th, td {
		  border: 2px solid black;
		  width:50%;
		}
	</style>
	
</head>
<body>

	<%
		String id = request.getParameter("id");
		
	%>


	<h1 style="color:white ; "><center><u>Employee Delete</u></center></h1>
	
	<br><br><br>

	<form action="Delete" method="post">
	<center>
	<table style="width:50%">
	<tr>
	   <th scope="col"> Employee ID </th>
	   
	   <th scope="col"> Delete </th>
	</tr>
	<tr>
       <td><input type="text" name="id" value="<%= id %>" ></td>
       
	   <td><center><input type="submit" name="submit" value="Delete Data"></center></td>
	   
	   
   </tr>
	
	
	</table></center>
	<br>
	
	</form>

</body>
</html>