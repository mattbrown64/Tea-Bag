<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		This is the index view jsp
		<form action="${pageContext.servletContext.contextPath}/addNumbers" method="get">
			<input type="Submit" name="submit" value="Add Numbers!">
		</form>
		
		<form action="${pageContext.servletContext.contextPath}/multiplyNumbers" method="get">
			<input type="Submit" name="submit" value="Multiply Numbers!">
		</form>
		
		<form action="${pageContext.servletContext.contextPath}/guessingGame" method="get">
			<input type="Submit" name="submit" value="Guessing Game!">
		</form>
		<form action="${pageContext.servletContext.contextPath}/gamePage" method="get">
			<input type="Submit" name="submit" value="game!">
		</form>
	</body>
</html>
