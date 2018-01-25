<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="css/app.css" />" rel="stylesheet"
	type="text/css">
<title>SIS spring security</title>
</head>
<body class="security-app">
	<div class="details">
		<h2>SIS spring security</h2>
	</div>

	<form action="/login" method="post">

		<div class="lc-block">
			<div>
				<input type="text" class="style-4" name="username"
					placeholder="Korisnicko ime" />
			</div>
			<div>
				<input type="password" class="style-4" name="password"
					placeholder="Lozinka" />
			</div>
			<div>
				<input type="submit" value="Login" class="button red small" />
			</div>
			<c:if test="${param.error ne null}">
				<div class="alert-danger">Netocno korisnicko ime ili lozinka.</div>
			</c:if>
			<c:if test="${param.logout ne null}">
				<div class="alert-normal">Uspjesno ste se odjavili.</div>
			</c:if>
		</div>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>

</body>
</html>