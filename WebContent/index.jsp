<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
<base href="<%=basePath%>" />
<title>SSH demo.</title>
</head>
<body>

	<form method="POST" action="user/add">
		 	用户编码： <input type="text" name="code">
		<p>
			用户名称： <input type="text" name="name">
		<p>
			&nbsp;&nbsp; <a href="user/index"> 查询已有账号 </a> &nbsp;&nbsp; 
		<input type="Submit" value="提  交" />
	</form>
</body>
</html>