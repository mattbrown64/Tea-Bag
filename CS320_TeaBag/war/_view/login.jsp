<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>login</title>
	</head>

	<body>
		<form action="${pageContext.servletContext.contextPath}/addNumbers" method="post">
			<table>
				<tr>
					<td class="label">User Name:</td>
					<td><input type="text" name="UserName" size="12" value="${model.userName}" /></td>
				</tr>
				<tr>
					<td class="label">Password:</td>
					<td><input type="text" name="Password" size="12" value="${model.Password}" /></td>
				</tr>
				<tr>
					<td>${result}</td>
				</tr>
			</table>
			<input type="Submit" name="submit" value="login!">
		</form>
		
	</body>
</html>