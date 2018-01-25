<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/app.css"rel="stylesheet"
	type="text/css"></link>
<title>SIS spring security</title>
</head>
<body class="security-app">
	<div class="details">
	<h2>SIS spring security</h2>
	</div>
	<div class="lc-block">		
		<div class="alert-danger">
			<h3>Nemate prava za pristup ovoj stranici!</h3>
		</div>
		<form action="/logout" method="post">
			<input type="submit" class="button red big" value="Odjava" /> <input
				type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>		
	</div>	
</body>
</html>
