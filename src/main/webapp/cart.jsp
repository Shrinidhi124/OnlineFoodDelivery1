<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="com.OnlineFoodDelivery.model.CartItem"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Shopping Cart</title>

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
    padding:20px;
    text-align:center;
}

.container{
    width:800px;
    margin:40px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}

table{
    width:100%;
    border-collapse:collapse;
}

table,th,td{
    border:1px solid gray;
}

th{
    background:#ff6600;
    color:white;
}

th,td{
    padding:12px;
    text-align:center;
}

button{
    padding:10px 20px;
    background:green;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;
    margin-top:20px;
}

.backBtn{
    background:blue;
    margin-left:10px;
}

.empty{
    text-align:center;
    font-size:20px;
    color:red;
}

</style>

</head>

<body>

<div class="header">

<h1>Shopping Cart</h1>

</div>

<div class="container">

<%

ArrayList<CartItem> cart =
(ArrayList<CartItem>)session.getAttribute("cart");

double total=0;

if(cart==null || cart.size()==0){

%>

<h2 class="empty">Your Cart is Empty</h2>

<a href="menu.jsp">

<button class="backBtn">

Go To Menu

</button>

</a>

<%

}else{

%>

<table>

<tr>

<th>Food Item</th>
<th>Price</th>
<th>Quantity</th>
<th>Total</th>

</tr>

<%

for(CartItem item : cart){

total = total + item.getTotal();

%>

<tr>

<td><%=item.getItemName()%></td>

<td>₹<%=item.getPrice()%></td>

<td><%=item.getQuantity()%></td>

<td>₹<%=item.getTotal()%></td>

</tr>

<%

}

%>

<tr>

<td colspan="3"><b>Grand Total</b></td>

<td>

<b>₹<%=total%></b>

</td>

</tr>

</table>

<form action="OrderServlet" method="post">

<button type="submit">

Proceed To Checkout

</button>

</form>

<a href="menu.jsp">

<button type="button" class="backBtn">

Continue Shopping

</button>

</a>

<%

}

%>

</div>

</body>

</html>