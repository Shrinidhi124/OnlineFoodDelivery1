<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Checkout</title>

<style>

body{

    font-family:Arial;
    background:#f2f2f2;

}

.container{

    width:450px;
    margin:60px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    text-align:center;
    box-shadow:0px 0px 10px gray;

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

</style>

</head>

<body>

<div class="container">

<h2>Checkout</h2>

<form action="orderSuccess.jsp">

<input type="text"
placeholder="Delivery Address"
required>

<input type="text"
placeholder="Phone Number"
required>

<button type="submit">

Place Order

</button>

</form>

</div>

</body>

</html>