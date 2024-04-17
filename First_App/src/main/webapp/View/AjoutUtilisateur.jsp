<%@page import="org.apache.tomcat.jakartaee.commons.lang3.ObjectUtils.Null"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JEE WEB APP</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/AjoutUtilisateur.css">
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
	    	<form action="addUser" method="post">
	      		<div class="form-group">
	        		<label for="firstName">Nom</label>
	        		<input type="text" class="form-control" id="nom" name="nom">
	      		</div>
	      		<div class="form-group">
	        		<label for="lastName">Prenom</label>
	        		<input type="text" class="form-control" id="prenom" name="prenom">
	      		</div>
	      		<div class="form-group">
	       			<label for="email">Email</label>
	        		<input type="email" class="form-control" id="email" name="email" placeholder="Jee.web@gmail.com">
	      		</div>
	      		<div class="form-group">
	        		<label for="age">Age</label>
	        		<input type="number" class="form-control" id="age" name="age" min="18" max="100">
	      		</div>
	      		<button type="submit" class="btn btn-primary" >Submit</button>
	    	</form>
	    	<%if(request.getAttribute("message") != null){%>
	    		<p style="color:red;"><%= request.getAttribute("message") %></p>
	    	<%}%>	
	  </div>
	</body>
</html>