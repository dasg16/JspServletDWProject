<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color:#a6f2a6">
<form action="loginprocess" method="post">
  <div class="imgcontainer">
    <img src="Login.JPG" alt="Login" width="200" height="200">
  </div>
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
<br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
<br>
<br>
<br>
<br>
    <button type="submit" style="background-color: #f2dfa6">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
<br>
  <div class="container">
    <button type="button" class="cancelbtn" style="background-color: #f2dfa6">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
<br>
<br>
<label for="Login Status" style="background-color: #FF0000"><b>${LoginStatus}</b></label>

</body>
</html>