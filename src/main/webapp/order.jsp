<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Single song page</h1>
	
	<h3>Id -- <c:out value="${s.id}"/></h3>
	<h3>customer -- <c:out value="${s.customer}"/></h3>
	<h3>product -- <c:out value="${s.product}"/></h3>
	<h3>quantity -- <c:out value="${s.quantity}"/></h3>
	<h3>price -- <c:out value="${s.price}"/></h3>
	
	
</body>