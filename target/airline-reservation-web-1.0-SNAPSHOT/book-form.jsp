<!DOCTYPE html>
<html lang="en" style=" min-height: 100%;">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book</title>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
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
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Account
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                <a class="dropdown-item" href="signin">Sign In</a>
                <a class="dropdown-item" href="signup">Create Account</a>
                <a class="dropdown-item" href="#" style="display: none;">Logout</a>
              </div>
            </li>
          </ul>
        </div>
      </nav>

      <div class="d-flex justify-content-center" style="margin-top: 2%;" >
          <form >
            <div class="form-group">
                <h1 class="display-4 text-center">Personal Details</h1>
              </div>
            <hr class="my-4">
            <div class="row">
          <div class="col">
            <input type="text" class="form-control" placeholder="First name">
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Last name">
          </div>
        </div>
        <div class="row" style="margin-top: 2%;">
            <div class="col">
              <input type="email" class="form-control" placeholder="Email">
            </div>
            <div class="col">
              <input type="text" class="form-control" placeholder="Phone Number">
            </div>
          </div>
          <div class="form-group" style="margin-top: 2%;">
            <h1 class="display-4 text-center">Trip Information</h1>
          </div> 
          <hr class="my-4">
            
        <div class="row" style="margin-top: 2%;">
            <div class="col">
            <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
            <option selected>Type of trip</option>
            <option value="1">One</option>
            <option value="2">Two</option>
            <option value="3">Three</option>
            </select>
            </div>
            <div class="col">
                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                <option selected>Travel Class</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
                </select>
            </div>
        </div>
        <div class="row" style="margin-top: 2%;">
            <div class="col">
                <input class="form-control" type="text" name="dep_country" placeholder="Departure Country" readonly>
              </div>
              <div class="col">
                <input type="text" class="form-control" name="dest_country" placeholder="Destination Country" readonly>

              </div>
          </div>

          <div class="row" style="margin-top: 2%;">
              <div class="col">
                  <input class="form-control" type="text" name="date" placeholder="Departure date & time" readonly>
              </div>
              <div class="col">
                  <input class="form-control" type="text" placeholder="Return date & time" readonly>

              </div>
          </div>
          <div class="row" style="margin-top: 2%;">
              <div class="col">
                  <input class="form-control" id="airport" type="text" placeholder="Airport" readonly>
              </div>
              <div class="col">
                <input type="text" class="form-control" placeholder="Number of luggage">
              </div>
          </div>
            
          <div class="row" style="margin-top: 2%;"> 
             <div class="col">
                 <input class="form-control" type="text" name="arline" placeholder="Airline" readonly>
              </div>
              <div class="col">
                <input type="text" class="form-control" name="flight_number" placeholder="Flight number"readonly>
              </div>
          </div>
              
          <div class="row" style="margin-top: 2%;"> 
              <div class="col">
                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                <option selected>Number of Adults</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
                </select>
            </div>
            <div class="col">
                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                <option selected>Number of chilren</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
                </select>
            </div>
          </div>

          <div class="form-group" style="margin-top: 2%;">
            <h1 class="display-4 text-center">Traveler's Details</h1>
          </div> 
          <hr class="my-4">
          <div class="row" style="margin-top: 2%;">
            <div class="col">
              <input type="text" class="form-control" placeholder="Passport number">
            </div>
            <div class="col">
              <input type="text" class="form-control" placeholder="Passport expiration date">
            </div>
            </div>
            <div class="form-group" style="width: auto; margin-top: 2%;">
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="message" placeholder="Any message..."></textarea>
            </div>    
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-dark">Book Now</button>
            </div>

      </form>
      </div>

    <footer class="bg-dark text-center text-white" style="bottom: 0; width: 100%; margin-top: 5%;">

        <!-- Copyright -->
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
            © 2020 Copyright:
            <a class="text-white" href="https://mdbootstrap.com/">MDBootstrap.com</a>
        </div>
        <!-- Copyright -->
    </footer>

<script>
    var airport = $('#airport-td').text();

    var airportText = airport.innerHTML;

    $('#airport').attr('placeholder','Burgas International');
</script>
</body>
</html>