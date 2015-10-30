<!DOCTYPE html>
<html>
<head>
<title>${title}</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Code</th>
				<th>Name</th>
				<th>Operation</th>
			</tr>
		</thead>
		<#list users as user>  
			<tr>
				<td>${user.code}</td>
				<td>${user.name}</td>
				<td><a href="user/delete/${user.id}">delete</a></td>
			</tr>
		</#list>  
	</table>
</body>
</html>