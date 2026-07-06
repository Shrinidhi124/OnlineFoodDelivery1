<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Order Success</title>

<style>

body{

    font-family:Arial;
    background:#f2f2f2;

}

.container{

    width:500px;
    margin:100px auto;
    background:white;
    padding:30px;
    text-align:center;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;

}

h1{

    color:green;

}

button{

    width:200px;
    padding:10px;
    background:#ff6600;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;

}

</style>

</head>

<body>

<div class="container">

<h1>🎉 Order Placed Successfully!</h1>

<p>Thank you for ordering with us.</p>

<form action="home.jsp">

<button type="submit">

Back To Home

</button>

</form>

</div>

</body>

</html>