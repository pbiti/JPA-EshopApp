<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<center>
		<h1>Product was Successfully inserted in the Database</h1>
		<h2>Product Info:</h2>
		
		<%
	    out.print("<p><b>Barcode: "+request.getParameter("barcode")+".");
		%>
		<br>
		<%
	    out.print("<p><b>Name: "+request.getParameter("name")+".");
		%>
		<br>
		<%
	    out.print("<p><b>Color: "+request.getParameter("color")+".");
		%>
		<br>
		<%
	    out.print("<p><b>Description: "+request.getParameter("description")+".");
		%>
	</center>
	
</body>
</html>