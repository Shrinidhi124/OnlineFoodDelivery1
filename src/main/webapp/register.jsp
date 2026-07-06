<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<style>

body{

    font-family: Arial;
    background:#f2f2f2;

}

.container{

    width:400px;
    margin:50px auto;
    background:white;
    padding:25px;
    border-radius:10px;
    text-align:center;

}

input{

    width:90%;
    padding:10px;
    margin:10px;

}

button{

    width:95%;
    padding:10px;
    background:green;
    color:white;
    border:none;
    cursor:pointer;

}

a{

    text-decoration:none;

}

</style>

</head>

<body>

<div class="container">

<h2>User Registration</h2>

<form action="register" method="post">

<input type="text"
name="name"
placeholder="Enter Name"
required>

<input type="email"
name="email"
placeholder="Enter Email"
required>

<input type="password"
name="password"
placeholder="Enter Password"
required>

<input type="text"
name="phone"
placeholder="Enter Phone Number"
required>

<input type="text"
name="address"
placeholder="Enter Address"
required>

<button type="submit">
Register
</button>

</form>

<br>

<a href="login.jsp">
Already have an account? Login
</a>

</div>

</body>
</html>