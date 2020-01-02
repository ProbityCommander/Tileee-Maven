<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<script src="https://kit.fontawesome.com/f64643ede5.js" crossorigin="anonymous"></script>
<title>Insert title here</title>
	<style><%@include file="css/index.css" %></style>
</head>
<body>
	<section id="title">
		<nav id="menu">
			<ul>
				<li><a class="fa fa-user" href="Identification?action=2"></a></li>
			</ul>
		</nav>
	</section>

	<div id="overall">
		<article id="textbox">
			<p class="inner">
				${userMessage}
			</p>
		</article>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>