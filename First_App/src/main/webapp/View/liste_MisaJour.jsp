<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JEE WEB APP</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/listeUtilisateurs.css">
	</head>
	<body>
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
	  		<div class="container-fluid">
	    		<img src="icon/java-icon.png" width="40px" height="40px"><b>Java EE</b>
	    		<div class="collapse navbar-collapse" id="navbarNav">
	      			<ul class="navbar-nav">
	        			<li class="nav-item">
	          				<a class="nav-link ms-5" href="<%= request.getContextPath()%>/users">Liste des Utilisateurs</a>
	        			</li>
	        			<li class="nav-item">
	          				<a class="nav-link ms-5" href="<%= request.getContextPath()%>/addUser">Ajout Utilisateur</a>
	        			</li>
	        			<li class="nav-item">
	          				<a class="nav-link ms-5" href="<%= request.getContextPath()%>/deleteUser">Liste après suppression</a>
	        			</li>
	      			</ul>
	    		</div>
	  		</div>
		</nav>
		<div class="container">
			<table class="table">
				<thead>
			    	<tr>
				      <th scope="col">Utilisateur ID</th>
				      <th scope="col">Nom</th>
				      <th scope="col">Prénom</th>
				      <th scope="col">Email</th>
				      <th scope="col">Age</th>
				    </tr>
			  	</thead>
			  	<tbody>
			    	<c:forEach var="ut" items="${utilisateurs}">
			    		<tr>
			    			<th scope="row">${ut.num}</th>
					      	<td>${ut.nom}</td>
					      	<td>${ut.prenom}</td>
					      	<td>${ut.email}</td>
					      	<td>${ut.age}</td>
					    </tr>
			    	</c:forEach>
			   	</tbody>
		   	</table>
		</div>
	</body>
</html>