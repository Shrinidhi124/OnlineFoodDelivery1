<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Food Menu</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:#f2f2f2;
}

.header{
    background:#ff6600;
    color:white;
    text-align:center;
    padding:20px;
}

.container{
    width:1000px;
    margin:40px auto;
    text-align:center;
}

.card{
    width:250px;
    background:white;
    display:inline-block;
    margin:15px;
    padding:20px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}

button{
    width:170px;
    padding:10px;
    background:green;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:darkgreen;
}

.viewCart{
    background:blue;
}

.viewCart:hover{
    background:darkblue;
}

.message{
    width:350px;
    margin:20px auto;
    background:#d4edda;
    color:green;
    padding:15px;
    border-radius:8px;
    font-weight:bold;
}

</style>

</head>

<body>

<div class="header">
<h1>Food Menu</h1>
</div>

<%
String msg=(String)session.getAttribute("message");

if(msg!=null){
%>

<div class="message">
<%=msg%>
</div>

<%
session.removeAttribute("message");
}
%>

<div class="container">

<div class="card">

<h2>Veg Burger</h2>

<p>₹120</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Veg Burger">
<input type="hidden" name="price" value="120">

<button type="submit">
Add To Cart
</button>

</form>

</div>

<div class="card">

<h2>Chicken Burger</h2>

<p>₹180</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Chicken Burger">
<input type="hidden" name="price" value="180">

<button type="submit">
Add To Cart
</button>

</form>

</div>

<div class="card">

<h2>French Fries</h2>

<p>₹90</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="French Fries">
<input type="hidden" name="price" value="90">

<button type="submit">
Add To Cart
</button>

</form>

</div>

<div class="card">

<h2>Chicken Biryani</h2>

<p>₹250</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Chicken Biryani">
<input type="hidden" name="price" value="250">

<button type="submit">
Add To Cart
</button>

</form>

</div>

<div class="card">

<h2>Veg Biryani</h2>

<p>₹180</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Veg Biryani">
<input type="hidden" name="price" value="180">

<button type="submit">
Add To Cart
</button>

</form>

</div>

<div class="card">

<h2>Pepsi</h2>

<p>₹40</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Pepsi">
<input type="hidden" name="price" value="40">

<button type="submit">
Add To Cart
</button>

</form>

</div>

<br><br>

<a href="cart.jsp">

<button class="viewCart">
View Cart
</button>

</a>

</div>

</body>

</html>