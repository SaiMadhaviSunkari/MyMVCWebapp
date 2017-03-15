<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="resources/css/Login.css" rel="stylesheet">
</head>
<body>
	<div class="container" style="color: white;">
		
			<sf:form style="margin-top:100px;" method="POST" action="homeAfterlogin" commandName="Login-g">
			<div style="color:red;"> ${errorMsg}</div>
				<fieldset>
					<label> Bunch of Cartoon Lovers</label>
					<div class="form-group">
						<label for="userName">User-name:</label> <sf:input type="text"
							class="form-control" path="userName" placeholder="Enter User-name"/>
							<sf:errors path="userName" style="color: red;" />
					</div>
					<div class="form-group">
						<label for="password">Password:</label> <sf:input type="password"
							class="form-control" path="password" placeholder="Enter password"/>
							<sf:errors path="password" style="color: red;" />
					</div>

					<div class="checkbox">
						<label><input type="checkbox"> Remember me</label>
					</div>
					<button type="submit" class="btn btn-default" onclick="btnClickedFunction()">Submit</button>
				</fieldset>
			</sf:form>

		</div>
	 <script type="text/javascript" src="resources/js/Login.js"></script>

</body>
</html>