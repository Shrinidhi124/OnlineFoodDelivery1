<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>

body{
    font-family: Arial;
    background:#f2f2f2;
}

.container{

    width:350px;
    margin:100px auto;
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

<h2>User Login</h2>

<form action="login" method="post">

<input type="email"
name="email"
placeholder="Enter Email"
required>

<input type="password"
name="password"
placeholder="Enter Password"
required>

<button type="submit">
Login
</button>

</form>

<br>

<a href="register.jsp">
New User? Register Here
</a>

</div>

</body>
</html>