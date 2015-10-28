<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
	    <meta charset="utf-8">
	    <title>SIGEDE</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link href="css/bootstrap.css" rel="stylesheet">
	    <script src="js/.js"></script>
	    <script src="js/bootstrap.min.js"></script>
	    <script src="js/jquery.js"></script>
	    <script src="js/bootstrap.min.js"></script>
	    <script src="js/bootstrap.js"></script>
	    <script src="js/bootstrap-confirmation.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="container">
			<div id="loginbox"
				class="mainbox col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3">
				<div class="row">
					<div class="iconmelon">
						<script type="image/svg">
              				<svg viewBox="0 0 32 32">
                				<g filter="">
                  					<use xlink:href="#git"></use>
                				</g>
              				</svg>
						</script>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title text-center">
							<a><img src="img/SIGEDE-LOGIN.png" alt=""></a>
						</div>
					</div>
					<div class="panel-body">
						<c:if test="${mensagemErro ne null}">
							<div class="alert alert-danger" role="alert">
								<span class="glyphicon glyphicon-exclamation-sign"
									aria-hidden="true"></span> <span class="sr-only">Erro:</span>
								${mensagemErro}
							</div>
						</c:if>
	
						<!-- <form name="form" id="form" class="form-horizontal" enctype="multipart/form-data" method="POST"> -->
	
						<form name="form" id="form" class="form-horizontal"
							enctype="multipart/form-data"
							action="<c:url value="/autenticar"/>" method="post" role="form">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-user"></i></span> <input id="login"
									type="text" class="form-control" name="usuario.email"
									placeholder="Email" required autofocus>
							</div>
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <input id="senha"
									type="password" class="form-control" name="usuario.senha"
									placeholder="Senha" required>
							</div>
							<div class="form-group">
								<!-- Button -->
								<div class="col-sm-12 controls">
									<button type="submit" class="btn btn-lg btn-primary btn-block">
										<i class="glyphicon glyphicon-log-in"></i> ENTRAR
									</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>