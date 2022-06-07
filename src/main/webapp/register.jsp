<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="WEB-INF/component/head.jsp"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/component/navbar.jsp"%>
        <h2><%@include file="WEB-INF/component/message.jsp" %></h2>

	<div class="mt-5">
		<div class="px-5">
			<h1>Register User</h1>
			<form action="RegisterServlet" method="post">

				<div class="mb-3">
					<label for="username" class="form-label">User Name</label> <input
						type="text" name="user_name" class="form-control" id="username"
						aria-describedby="emailHelp">
				</div>

				<div class="mb-3">
					<label for="email" class="form-label">Email address</label> <input
						type="email" name="user_email" class="form-control" id="email"
						aria-describedby="emailHelp">
				</div>
				<div class="mb-3">
					<label for="password" class="form-label">Password</label> <input
						type="password" name="user_password" class="form-control"
						id="password">
				</div>

				<div class="mb-3">
					<label for="phonel" class="form-label">Phone</label> <input
						type="number" name="user_phone" class="form-control" id="phone"
						aria-describedby="emailHelp">
				</div>

				<div class="mb-3">
					<label for="address" class="form-label">Address</label> <input
						type="text" name="user_address" class="form-control" id="address"
						aria-describedby="emailHelp">
				</div>
				<button type="submit" class="btn btn-primary">Register</button>
			</form>
		</div>
	</div>
	<%@include file="WEB-INF/component/jsscript.jsp"%>
</body>
</html>