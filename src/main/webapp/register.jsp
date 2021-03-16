
<!DOCTYPE html>
<html>
<head>
    <title>Insert Data</title>
</head>
<body>
<!-- Give Servlet reference to the form as an instances
GET and POST services can be according to the problem statement-->
<form action="/register-user" method="post">
    <p>Title:</p>
    <!-- Create an element with mandatory name attribute,
    so that data can be transfer to the servlet using getParameter() -->
    <input type="text" name="title"/>
    <br/>
    <p>First name:</p>
    <input type="text" name="fname"/>
    <br/>
    <p>Second name:</p>
    <input type="text" name="sname"/>
    <br/>
    <p>Phone number:</p>
    <input type="text" name="phone"/>
    <br/>
    <p>Email:</p>
    <input type="text" name="fname"/>
    <br/>
    <p>Password:</p>
    <input type="text" name="pass"/>
    <br/><br/><br/>
    <input type="submit"/>
</form>
</body>
</html>
