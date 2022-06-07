<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/component/head.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/component/navbar.jsp"%>
         <!--<h2><%@include file="WEB-INF/component/message.jsp" %></h2>-->

         <div class="mt-5">
		<div class="px-5">
                     <h1>Login Here</h1>
                   
                   
			<form action="LoiginServlet" method="post">

				<div class="mb-3" mx-3>
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

				
				<button type="submit" class="btn btn-primary">Login</button>
			</form>
                </div>
         </div>
         <%@include file="WEB-INF/component/jsscript.jsp"%>
    </body>
</html>
