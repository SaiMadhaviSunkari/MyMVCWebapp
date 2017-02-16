<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
<!-- Register CSS style -->
<link href="resources/css/Register.css" rel="stylesheet">



</head>
<body>

	<div class="container text-center" style="color:white;">
		<h3>JOIN The Cartoon Family</h3>
		<p>
			<em>We are all cartoon lovers!</em>
		</p>
		<p>2 Easy steps to become one among us:</p>
		<p> 1. Fill in details</p>
		<p> 2. Hit the big blue button </p>
		
		<br>
		<div class="row">
			<div class="col-sm-4">
				<p class="text-center">
					<strong>Bear</strong>
				</p>
				<br> <a href="#demo" data-toggle="collapse"> <img
					src="resources/images/bear.gif" class="img-circle person" alt="Random Name"
					width="255" height="255">
				</a>
				<div id="demo" class="collapse">
					<p>Guitarist and Lead Vocalist</p>
					<p>Loves long walks on the beach</p>
					<p>Member since 1988</p>
				</div>
			</div>
			<div class="col-sm-4">
				<p class="text-center">
					<strong>Tweety</strong>
				</p>
				<br> <a href="#demo2" data-toggle="collapse"> <img
					src="resources/images/tweety.gif" class="img-circle person" alt="Random Name"
					width="255" height="255">
				</a>
				<div id="demo2" class="collapse">
					<p>Drummer</p>
					<p>Loves drummin'</p>
					<p>Member since 1988</p>
				</div>
			</div>
			<div class="col-sm-4">
				<p class="text-center">
					<strong>Twinker Bell</strong>
				</p>
				<br> <a href="#demo3" data-toggle="collapse"> <img
					src="resources/images/shiny.gif" class="img-circle person" alt="Random Name"
					width="255" height="255">
				</a>
				<div id="demo3" class="collapse">
					<p>Bass player</p>
					<p>Loves math</p>
					<p>Member since 2005</p>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
			<div class="row main">
				<div class="main-login main-center">
				<h5>Sign up once and watch any of our free animated videos.</h5>
					<sf:form method="post" action="homeAfterRegisterentry" onSubmit="return ValidateForm()" commandName="registering"> <!---->
						<div style="color:red;"> ${errorMsg}</div>
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Your Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="name"  placeholder="Enter your Name"/>
									<!--  <div style="color:red;" id="nameerror"> ${nameerrorMsg}</div> -->
									<sf:errors path="name" style="color: red;" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Your Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="email"  placeholder="Enter your Email"/>
									<!--  <div style="color:red;" id="emailerror"> ${emailerrorMsg}</div> -->
									<sf:errors path="email" style="color: red;" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="userName"  placeholder="Enter your Username"/>
									<!--  <div style="color:red;" id="unameerror"> ${unameerrorMsg}</div>-->
									<sf:errors path="userName" style="color: red;" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<sf:input type="password" class="form-control" path="password"  placeholder="Enter your Password"/>
									<!-- <div style="color:red;" id="pwderror"> ${pwderrorMsg}</div> -->
									<div class="pwd">
									<sf:errors path="password" style="color: red;" >
									</sf:errors>
									</div>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<sf:input type="password" class="form-control" path="confirm"  placeholder="Confirm your Password"/>
									<!--<div style="color:red;" id="conerror"> ${conerrorMsg}</div>-->
									<div class="cpwd">
									<sf:errors path="confirm" style="color: red;" >
									</sf:errors>
								</div>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<!--  <a href="http://deepak646.blogspot.in" target="_blank" type="button" id="button" class="btn btn-primary btn-lg btn-block login-button">Register</a>-->
						<button type="submit" class="btn btn-default" >Submit</button> <!--onclick="btnClickedFunction()"-->
						</div>
						
					</sf:form>
				</div>
			</div>
		</div>

 <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/Register.js"></script>
</body>
</html>