<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.edutecno.model.Estudiante"%>
<%@page import="com.edutecno.model.Curso"%>
<%@page import="com.edutecno.model.Region"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="charset=ISO-8859-1">
<script src="/webjars/jquery/jquery.min.js"></script>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<title>Sistema Estudiantes</title>
</head>
<body>
	<!-- Inicio navbar -->
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <div class="container-fluid">
	    <p class="navbar-brand">Sistema estudiantes</p>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarNav">
	      <ul class="navbar-nav ms-auto">	        
	        <li class="nav-item">
			  <a class="nav-link" href="https://giofranco79.github.io/landing/">Giovanni Franco</a>
	        </li>	       
	      </ul>
	    </div>
	  </div>
	</nav>	
	<!-- Fin navbar -->
	<!-- Inicio Contenido -->
	<div class="container text-center">
		<div class="row mt-2">
			<form action="/buscartexto" method="post">
				<div class="col-2 col-sm-10 mx-2 text-start" style="display:inline-block;">
					 <label class="form-label">Región</label>
					 <select class="form-select" id="regiones" name="regiones">
					 	<option value="0" selected>Seleccionar región</option>  						
    					<c:forEach items="${region}" var="r">
    						 <option value="${r.codigoRegion}">${r.nombre}</option>
    					</c:forEach>
					 </select>					 
				</div>
				<div class="col-2 col-sm-10 mx-2 text-start" style="display:inline-block;">
					<label class="form-label text-start">Curso</label>
					 <select class="form-select" id="cursos" name="cursos">
					 	 <option value="0" selected>Seleccionar curso</option>    						
    					<c:forEach items="${curso}" var="c">
    						 <option value="${c.codigoCurso}">${c.codigoCurso}</option>
    					</c:forEach>
					 </select>					
				</div>
				<div class="col-2 col-sm-10 mx-2" style="display:inline-block;">
					<button class="btn btn-dark my-3" name="Submit" type="Submit">Filtrar</button>
				</div>
			</form>			
		</div>		
		<!-- Inicio Tabla -->
		<div class="container">
			<table border="1" class="table table-dark table-striped">
				<thead class="thead-dark">
					<tr class="text-center">						
						<th class="col-2 align-middle" scope="col">Rut</th>
						<th class="col-2 align-middle" scope="col">Nombre</th>
						<th class="col-2 align-middle" scope="col">Apellido paterno</th>
						<th class="col-2 align-middle" scope="col">Apellido materno</th>
						<th class="col-2 align-middle" scope="col">Código curso</th>
						<th class="col-2 align-middle" scope="col">Descripción curso</th>
					</tr>
				</thead>
				<tbody class="text-center">
					<c:forEach items="${estudiantes}" var="e">
						<tr>							
							<td>${e.rut}</td>
							<td>${e.nombre}</td>
							<td>${e.apellidoPat}</td>
							<td>${e.apellidoMat}</td>
							<td>${e.codigoCurso.codigoCurso}</td>
							<td>${e.codigoCurso.codigoPlanFormativo.descripcion}</td>	
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>		
		<!-- Fin tabla -->
	</div>
	<!-- Fin Contenido -->
	<!-- footer -->
	<footer
		class="container-fluid text-center bg-dark text-white py-2">
		<h1>Sistema estudiantes</h1>
		<a href="https://giofranco79.github.io/landing/" class="text-white">web site developed by Popopo <i class="far fa-registered"></i>
		</a>
	</footer>
	<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>