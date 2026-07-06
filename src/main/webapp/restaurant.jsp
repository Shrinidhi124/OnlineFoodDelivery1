<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Restaurants</title>

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

    width:900px;
    margin:40px auto;

}

.card{

    background:white;
    width:250px;
    display:inline-block;
    margin:20px;
    padding:20px;
    text-align:center;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;

}

button{

    width:150px;
    padding:10px;
    border:none;
    background:green;
    color:white;
    border-radius:5px;
    cursor:pointer;

}

</style>

</head>

<body>

<div class="header">

<h1>Restaurants</h1>

</div>

<div class="container">

<div class="card">

<h2>Pizza Hut</h2>

<p>Mangalore</p>

<form action="menu.jsp">

<button>View Menu</button>

</form>

</div>

<div class="card">

<h2>KFC</h2>

<p>Bangalore</p>

<form action="menu.jsp">

<button>View Menu</button>

</form>

</div>

<div class="card">

<h2>Udupi Cafe</h2>

<p>Mysore</p>

<form action="menu.jsp">

<button>View Menu</button>

</form>

</div>

</div>

</body>
</html>