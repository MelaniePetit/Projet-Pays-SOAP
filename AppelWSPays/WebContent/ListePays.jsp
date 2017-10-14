<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %><%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link rel="stylesheet" href="CSS/listePays.css">
	
	<title>Liste des pays</title>
</head>
<body>
	<div class="container">
			<h1 class="display-3">Pays du monde</h1>
	</div>
	<div class="container">	
		<table class="table table-hover table-inverse">
		  <thead>
		    <tr>
		      <th>Nom</th>
		      <th>Capital</th>
		      <th>Population</th>
		    </tr>
		  </thead>
		  <tbody>
		   		<c:forEach items = "${liste}" var = "l">
			       <tr>
			           <td><c:out value = "${l.getNomPays()}"></c:out></td>
			           <td><c:out value = "${l.getNomCapitale()}"></c:out></td>
			           <td><c:out value = "${l.getNbhabitants()}"></c:out></td>
			           <td><a class="btn btn-info" href = "Detail?nomPays=${l.getNomPays()}"> Détail </a> </td>
			       </tr>
		       </c:forEach>
		   </tbody>
		</table>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</html>