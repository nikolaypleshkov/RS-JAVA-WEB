<html lang="en">
<head>
<title>Login V2</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/login.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/style.css">
</head>
<body>

	<nav class="stroke">
		<ul>
			<li><a href="home-servlet">Home</a></li>
			<li><a href="#">About</a></li>
		   <li><a href="#">Contact</a></li>
		</ul>
	  </nav>

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
			<span class="psw">Forgot <a href="#">password?</a></span>
		  </div>
			<button type="submit" class="btn btn-dark">Dark</button>
		</form>
	  </div>
</body>
</html>
