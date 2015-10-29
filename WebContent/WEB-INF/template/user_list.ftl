<!DOCTYPE html>
<html>
<head>
<title>${title}</title>
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
		<#list users as user>  
			<tr>
				<td>${user.id}</td>
				<td>${user.code}</td>
				<td>${user.name}</td>
			</tr>
		</#list>  
	</table>
</body>
</html>