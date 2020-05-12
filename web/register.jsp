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
<script type="text/javascript">
	function check() {
		var password=document.getElementById("password").value;
		var checkpassword=document.getElementById("checkpassword").value;
		if(password==checkpassword){
		    document.getElementById("registerform").submit();
		}
		else
		{
		    alert("两次输入的密码不一致");
		}
    }
</script>
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

				<h1>Sign up</h1>

				<!-- Loging form -->
				<form action="/register" method="get" id="registerform">
					<div class="form-group">
						<input type="text" class="form-control" id="exampleInputEmail1" name="username" aria-describedby="emailHelp" placeholder="Enter Username" value="${rusername}">

					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="password" name="password" placeholder="Password" value="${rpassword}">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="checkpassword" name="checkpassword" placeholder="Check Password" value="${rpassword}">
					</div>



					<br>
					<button type="button" class="btn btn-lg btn-block btn-success" onclick="check()">Sign up</button>
				</form>
				<!-- End Loging form -->

			</div>Copyright &copy; 2020.Company name All rights reserved.<a target="_blank" href="#">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
		</div>
	</div>
</div>


</body>
</html>