<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>SIGEDE</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="../css/bootstrap.css" rel="stylesheet">
<script src="../js/.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/jquery.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap.js"></script>
<script src="../js/bootstrap-confirmation.js" type="text/javascript"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="<c:url value="/login/home"/>"> <img
							src="../img/SIGEDE.png" alt="">
					</a></li>
					<li><a href="<c:url value="/audin/audinfiocruz"/>"> DEMANDAS </a></li>
					<li><a href="<c:url value="/relatorios"/>"> RELATÓRIOS </a></li>
					<li><c:if test="${userSession.usuario.perfil eq 'Administrador' }">
							<a href="<c:url value="/admin/suporte"/>"> SUPORTE </a>
						</c:if></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#" class="dropdown-toggle" data-toggle="dropdown"
						role="button" aria-haspopup="true" aria-expanded="false">
							${userSession.usuario.nome} <span
							class="glyphicon glyphicon-user"></span>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">Perfil</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Sair</a></li>
						</ul></li>
					<li><a href="#"> <span class="glyphicon glyphicon-log-out"></span>
							Sair
					</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="col-md-8">
			<h2>Bem-vindo ao SIGEDE</h2>
			<p>
				Esta é a tela inicial do SIGEDE (Sistema de Geranciamento de
				Demandas). <br> Você pode cadastrar e consultar suas demandas
				através do ícone correspondente no menu do topo.
			</p>
			<br>
			<p>
				<b>Inicie cadastrando suas demandas.</b>
			</p>
			<br> <br>
			<div class="form-group">
				<a href="<c:url value="/audin/audinfiocruz"/>"
					class="btn btn-success btn-large"> <i
					class="glyphicon glyphicon-plus"></i> COMEÇAR A CADASTRAR DEMANDAS
				</a> <br>
			</div>
		</div>
	</div>
	<!-- div row conteudo -->
</body>
</html>
