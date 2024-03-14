<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Game page</title>
		<style type="text/css">
		#container {
            width: 66.67%;
            height: 50%;  
            border: 1px solid #ccc;
            box-sizing: border-box;
            overflow: hidden;
            justify-content: left;
        }
        #input{
        	width: 60%;
         	justify-content: center;
        }
        
		</style>
	</head>

	<body>
	
		<div align="center">
			<h1>The tea-bag adventure game</h1>
			
			<form action="${pageContext.servletContext.contextPath}/gamePage" method="post">
			<textarea id="container" style="overflow-y: scroll;" rows="30"  name="terminal">${model.output}</textarea>
				<input id= "input" type="text" name="input" size="12"  />
			</form>
		</div>
		
		
		
	</body>
</html>