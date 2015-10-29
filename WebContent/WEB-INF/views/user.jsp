<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Code</th>
				<th>Name</th>
			</tr>
		</thead>
		<c:forEach var="user" items="${users}">
			<%--用EL表达式调用list对象的属性循环输出对象的各个属性值--%>
			<tr>
				<td>${user.id}</td>
				<td>${user.code}</td>
				<td>${user.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>