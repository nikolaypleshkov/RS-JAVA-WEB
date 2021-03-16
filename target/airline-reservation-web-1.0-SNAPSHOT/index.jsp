<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/style.css" />

    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
    $( function() {
      $( "#datepicker" ).datepicker();
    } );
    </script>
</head>
<body>
        <nav class="stroke">
          <ul>
              <li><a href="book-servlet">Book</a></li>
              <li><a href="register-user">About</a></li>
             <li><a href="#">Contact</a></li>
          </ul>
        </nav>

        <h1><%= "Airline Reservation" %></h1>
</body>
</html>