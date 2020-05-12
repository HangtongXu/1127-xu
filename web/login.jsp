<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/css/bootstrap.min.css">

<!-- Loding font -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:300,700" rel="stylesheet">

<!-- Custom Styles -->
<link rel="stylesheet" type="text/css" href="./css/styles.css">

<title>登录</title>
</head>
<body>
<%
	String mess=(String)session.getAttribute("message");
	String alt=mess;

	session.setAttribute("message", "");
	if("".equals(alt)  || alt==null){

	}

	else{%>
<script type="text/javascript">
    alert("<%=alt%>");
</script>

<% }%>
<!-- Backgrounds -->

<div id="login-bg" class="container-fluid">

  <div class="bg-img"></div>
  <div class="bg-color"></div>
</div>

<!-- End Backgrounds -->

<div class="container" id="login">
	<div class="row justify-content-center">
	<div class="col-lg-8">
	  <div class="login">

		<h1>Login</h1>

		<!-- Loging form -->
			  <form action="/login" method="get">
				<div class="form-group">
				  <input type="text" class="form-control" id="exampleInputEmail1" name="username" aria-describedby="emailHelp" placeholder="Enter email" value="${rusername}">

				</div>
				<div class="form-group">
				  <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password" value="${rpassword}">
				</div>

				  <div class="form-check">

				  <label class="switch">
				  <input type="checkbox">
				  <span class="slider round"></span>
				</label>

				  <label ><input class="form-check" type="checkbox" id="check" name="check">Remember me</label>

				  <label class="forgot-password"><a href="#">Forgot Password?</a></label>

				</div>

				<br>
				<button type="submit" class="btn btn-lg btn-block btn-success">Sign in</button>
				  <label class="forgot-password"><a href="register.jsp">Sign up</a></label>
			  </form>
		 <!-- End Loging form -->

	  </div>Copyright &copy; 2020.Company name All rights reserved.<a target="_blank" href="#">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
	</div>
	</div>
</div>


</body>
</html>