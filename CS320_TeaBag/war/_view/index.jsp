<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		This is the index view jsp
		<form action="${pageContext.servletContext.contextPath}/login" method="get">
			<input type="Submit" name="submit" value="Log In">
		</form>
		
		<form action="${pageContext.servletContext.contextPath}/createAccount" method="get">
			<input type="Submit" name="submit" value="Create Account">
		</form>
		<form action="${pageContext.servletContext.contextPath}/gamePage" method="get">
			<input type="Submit" name="submit" value="Game">
		</form>
	</body>
</html>
