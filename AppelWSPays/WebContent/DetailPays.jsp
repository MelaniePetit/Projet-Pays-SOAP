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
		<link rel="stylesheet" href="CSS/index.css">
		
		<title>Détail du pays</title>
	</head>
	<body>
		<div class="container">
				<h1 class="display-3">Information sur le pays : <c:out value = "${pays.getNomPays()}"></c:out></h1>
		</div>
		
		<div class="container">
			<div class="jumbotron vertical-center">
				<h2>Capital : <c:out value = "${pays.getNomCapitale()}"></c:out></h2>
				<h3>Continent : <c:out value = "${pays.getNomContinent()}"></c:out></h3>
				<h4>Nombre d'habitant : <c:out value = "${pays.getNbhabitants()}"></c:out></h4>
				<iframe width="500" height="300"
			  src="https://www.google.com/maps/embed/v1/place?key=AIzaSyBX2a3Dh2dNOBB0-iv39LIOlyTAjbedoFM&q=${pays.getNomCapitale()},${pays.getNomPays()}" allowfullscreen>
			</iframe>
			</div>
		</div>
			
	</body>
</html>