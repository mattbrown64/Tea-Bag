<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Add Numbers</title>
		<style>
		#center {
  			  	margin: auto;
  				width: 15%;
  				border: 3px solid purple;
  				padding: 10px;
  				text-align: center;
			}
		</style>
	</head>

	<body id= center>
		
		<form action="${pageContext.servletContext.contextPath}/CreateAccount" method="post">
			<table>
				<tr>
					<td class="label">Username:</td>
					<td><input type="text" name="username" size="12" value="${username}" /></td>
				</tr>
				<tr>
					<td class="label">Password:</td>
					<td><input type="text" name="password" size="12" value="${password}" /></td>
				</tr>
				<tr>
					<td class="label">Confirm Password:</td>
					<td><input type="text" name="passwordConfirm" size="12" value="${passwordConfirm}" /></td>
				</tr>
				<tr>
					<td>${result}</td>
				</tr>
			</table>
			<input type="Submit" name="submit" value="Create Account">
		</form>
		
	</body>
</html>