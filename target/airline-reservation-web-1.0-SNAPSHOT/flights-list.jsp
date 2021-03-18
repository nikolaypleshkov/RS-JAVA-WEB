<%--
  Created by IntelliJ IDEA.
  User: Nikky
  Date: 17.3.2021 г.
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.example.airline_reservation_web.Entity.TableSearch" %>
<%@ page import="com.example.airline_reservation_web.Entity.FetchData" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/src/main/webapp/assets/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>

    </script>
</head>
<body>



<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">ArtiX Reservation</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="home-servlet">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="#">Booking</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href="#">Contact</a>
            </li>
        </ul>
    </div>
</nav>


<div class="form-group" style="margin-top:5%;">
    <h1 class="text-center">Flights</h1>
</div>
<div class="d-flex justify-content-center" >

    <form action="${pageContext.request.contextPath}/add-list" method="get">
        <div class="form-row">
            <div class="col" style="width: 50%">
                <input type="text" class="form-control" placeholder="Travelling To?" name="city_to">
            </div>

            <div class="col">
                <input type="text" class="form-control" placeholder="Travelling From?" name="city_from">
            </div>
            <div class="col">
                <input class="form-control"  id="datepicker" placeholder="Travelling when?" />
            </div>
            <div class="col">
                <button type="submit" class="btn btn-dark" style="width: 60%;" name="flight-search">Search</button>
            </div>
        </div>
    </form>
</div>





<form action="/add-list" method="get">
    <div class="d-flex justify-content-center" style="margin-top: 5%;">
        <%
            try
            {
                TableSearch search = new TableSearch();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=(Connection) DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/usersData","root","root");
                Statement st=con.createStatement();
                FetchData data = new FetchData();
                ResultSet rs=st.executeQuery("select * from flights WHERE flight_from = '"+search.getFrom_city()+"' AND flight_to = '"+search.getTo_city()+"';");
        %>
        <table class="table" style="width: 50%">
            <thead class="thead-dark">

            <tr>
                <th scope="col">Flight №</th>
                <th scope="col">Flight Name</th>
                <th scope="col">From</th>
                <th scope="col">To</th>
                <th scope="col">Data</th>
                <th scope="col">Time</th>
                <th scope="col">Airport</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <%while(rs.next()){%>
            <tr>
                <th scope="row"><%=rs.getString("flight_number") %></th>
                <td><%=rs.getString("flight_name") %></td>
                <td><%=rs.getString("flight_from") %></td>
                <td><%=rs.getString("flight_to") %></td>
                <td><%=rs.getString("flight_date") %></td>
                <td><%=rs.getString("fligt_time") %></td>
                <td><%=rs.getString("flight_airport") %></td>
                <td><button type="submit" class="btn btn-dark">Book</button></td>
            </tr>
            <%
                    st.close();
                    con.close();
                }%>
            </tbody>
        </table>
        <%}
        catch(Exception e){
            e.printStackTrace();
        %><br><%
        }

    %>

    </div>
</form>
<script>
    $('#datepicker').datepicker({
        uiLibrary: 'bootstrap'
    });
</script>
</body>
</html>
