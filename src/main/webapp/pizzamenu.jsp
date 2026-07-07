<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Pizza Hut Menu</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
}

body{
    font-family:Arial,sans-serif;
    background:#f2f2f2;
}

.header{
    background:#d32f2f;
    color:white;
    text-align:center;
    padding:25px;
}

.container{
    width:1100px;
    margin:40px auto;
    text-align:center;
}

.card{
    width:300px;
    background:white;
    display:inline-block;
    margin:18px;
    padding:15px;
    border-radius:12px;
    box-shadow:0 5px 15px rgba(0,0,0,.2);
    vertical-align:top;
}

.card:hover{
    transform:translateY(-5px);
}

.food-img{
    width:100%;
    height:180px;
    object-fit:cover;
    border-radius:10px;
}

h2{
    margin:15px 0;
}

.price{
    color:#ff6600;
    font-size:24px;
    font-weight:bold;
    margin-bottom:15px;
}

button{
    width:180px;
    padding:12px;
    border:none;
    border-radius:5px;
    background:green;
    color:white;
    font-size:16px;
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

</style>

</head>

<body>

<div class="header">
<h1>🍕 Pizza Hut Menu</h1>
</div>

<div class="container">

<!-- Pizza -->

<div class="card">

<img src="images/pizza.jpg" class="food-img">

<h2>Margherita Pizza</h2>

<p class="price">₹249</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Margherita Pizza">
<input type="hidden" name="price" value="249">

<button type="submit">Add To Cart</button>

</form>

</div>

<!-- Chicken Pizza -->

<div class="card">

<img src="images/pizza.jpg" class="food-img">

<h2>Chicken Pizza</h2>

<p class="price">₹349</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Chicken Pizza">
<input type="hidden" name="price" value="349">

<button type="submit">Add To Cart</button>

</form>

</div>

<!-- Veg Pizza -->

<div class="card">

<img src="images/pizza.jpg" class="food-img">

<h2>Veg Supreme Pizza</h2>

<p class="price">₹299</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Veg Supreme Pizza">
<input type="hidden" name="price" value="299">

<button type="submit">Add To Cart</button>

</form>

</div>

<!-- Pepsi -->

<div class="card">

<img src="images/Pepsi.jpg" class="food-img">

<h2>Pepsi</h2>

<p class="price">₹40</p>

<form action="CartServlet" method="post">

<input type="hidden" name="item" value="Pepsi">
<input type="hidden" name="price" value="40">

<button type="submit">Add To Cart</button>

</form>

</div>

<br><br>

<a href="cart.jsp">
<button class="viewCart">🛒 View Cart</button>
</a>

</div>

</body>
</html>