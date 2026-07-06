<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Home</title>

<style>

body{

    margin:0;
    padding:0;
    font-family:Arial, sans-serif;
    background:#f2f2f2;

}

.header{

    background:#ff6600;
    color:white;
    padding:20px;
    text-align:center;

}

.container{

    width:500px;
    margin:60px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    text-align:center;
    box-shadow:0px 0px 10px gray;

}

h2{

    color:#333;

}

button{

    width:220px;
    padding:12px;
    margin:15px;
    font-size:16px;
    border:none;
    border-radius:5px;
    cursor:pointer;

}

.restaurant{

    background:green;
    color:white;

}

.menu{

    background:#ff9800;
    color:white;

}

.cart{

    background:#2196F3;
    color:white;

}

.logout{

    background:red;
    color:white;

}

button:hover{

    opacity:0.8;

}

</style>

</head>

<body>

<div class="header">

<h1>Online Food Delivery System</h1>

</div>

<div class="container">

<h2>Welcome to Online Food Delivery</h2>

<p>Select an option below</p>

<form action="restaurant.jsp" method="get">

<button type="submit" class="restaurant">

View Restaurants

</button>

</form>

<form action="menu.jsp" method="get">

<button type="submit" class="menu">

View Menu

</button>

</form>

<form action="cart.jsp" method="get">

<button type="submit" class="cart">

Go To Cart

</button>

</form>

<form action="logout" method="get">

<button type="submit" class="logout">

Logout

</button>

</form>

</div>

</body>

</html>