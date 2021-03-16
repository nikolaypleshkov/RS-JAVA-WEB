<html lang="en">
<head>
<title>Login V2</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/login.css" />
	<link rel="stylesheet" href="/assets/login.css">
</head>
<body>
	<div id="id01" class="modal">
		<form class="modal-content animate" action="login-servlet" method="post">
		  <div class="imgcontainer">
			<span>Sign in</span>
		  </div>
	  
		  <div class="container">
			<label for="email"><b>Email</b></label>
			<input type="text" placeholder="Enter Email" name="email" required>
	  
			<label for="pass"><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="pass" required>
			  
			<button type="submit">Login</button>
			<label>
			  <input type="checkbox" checked="checked" name="remember"> Remember me
			</label>
		  </div>
	  
		  <div class="container" style="">
			<button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		  </div>
		</form>
	  </div>
</body>
</html>
