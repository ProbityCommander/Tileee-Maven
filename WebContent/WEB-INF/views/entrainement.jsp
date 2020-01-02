<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = en>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Tileee</title>
	<script src="https://kit.fontawesome.com/f64643ede5.js" crossorigin="anonymous"></script>
	<script type="text/javascript"><%@include file="js/index.js" %></script>
	<style><%@include file="css/index.css" %></style>
</head>
<body>
<%@include file="header.jsp" %>
	<div id="overall">
			<article id="textbox">
			<c:choose>
				<c:when test="${tL ne null}">
					<table>
			<c:forEach items="${tL}" var="lol">	 <!--  varStatus="loop"  -->
				<tr><td>Stack ${lol}</td>
				<td><a href="/tileee/EntrainementStack/${user.id}/${lol}">S'entrainer sur la stack ${lol}</a></td></tr>
			</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				Vous n'avez actuellement entré aucune stack de carte
			</c:otherwise>
			</c:choose>
			</article>
	</div>
<%@include file="footer.jsp" %>
</body>
</html>