<!--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> -->
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Reservation System</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">ArtiX Reservation</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
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

<!-------CONTACT FORM------->
<div class="form-group">
    <h1 class="text-center">Contact</h1>
</div>

<div class="d-flex justify-content-center">

    <form style="width: 50%;" action="servlet/EmailSender">
        <div class="form-group">
            <label for="formGroupExampleInput">Name</label>
            <input type="text" class="form-control" id="formGroupExampleInput" name="name">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Email</label>
            <input type="email" class="form-control" id="formGroupExampleInput2" name="email">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput">Subject</label>
            <input type="text" class="form-control" id="formGroupExampleInput" name="subject" >
        </div>
        <div class="col-auto my-1">
            <label class="mr-sm-2" for="inlineFormCustomSelect">Reason</label>
            <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                <option selected></option>
                <option value="1">Just to Say Hi</option>
                <option value="2">Business</option>
                <option value="3">Other</option>
            </select>
        </div>
        <div class="form-group" style="width: auto;">
            <label for="exampleFormControlTextarea1">Message</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="message"></textarea>
        </div>
        <button type="submit" class="btn btn-dark">Dark</button>
    </form>

</div>
<!-------/CONTACT FORM------->


</body>
</html>