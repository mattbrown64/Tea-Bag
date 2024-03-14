<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>login</title>
		<style>
		#center {
  			  margin: auto;
  			width: 15%;
  			padding: 10px;
  			text-align: center;
		}
		#hidden{
		display:none
		}
		</style>
	</head>

	<body id=center>
		<form  action="${pageContext.servletContext.contextPath}/login" method="post">
			<h1>Log In</h1>
			<table >
				<tr>
					<td class="label">User Name:</td>
					<td><input type="text" name="username" size="12" value="${username}" /></td>
				</tr>
				<tr>
					<td class="label">Password:</td>
					<td><input type="text" name="password" size="12" value="${password}" /></td>
				</tr>
				<tr>
					
				</tr>
				
			</table>
			<p style ="color: red" >${result}</p>
			<input  type="Submit" name="submit" value="login">
		
		
		</form>
		<form action="${pageContext.servletContext.contextPath}/CreateAccount" method="get">
			<input  type="Submit" name="submit" value="Create Account">
		</form>
		<h1  >${usernameNew}&${passwordNew}</h1>
	</body>
</html>