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
    width:900px;
    margin:40px auto;
    display:flex;
    justify-content:center;
    flex-wrap:wrap;
    gap:30px;
}

.card{
    width:250px;
    background:white;
    border-radius:10px;
    overflow:hidden;
    box-shadow:0 0 10px gray;
    text-align:center;
}

.card img{
    width:100%;
    height:180px;
    object-fit:cover;
}

.card h2{
    margin:15px 0 10px;
}

.card p{
    margin-bottom:20px;
    font-size:18px;
}

button{
    width:150px;
    padding:10px;
    margin-bottom:20px;
    border:none;
    background:green;
    color:white;
    border-radius:5px;
    cursor:pointer;
    font-size:16px;
}

button:hover{
    background:#006400;
}

</style>

</head>

<body>

<div class="header">
    <h1>Restaurants</h1>
</div>

<div class="container">

    <!-- Pizza Hut -->
    <div class="card">

        <img src="images/pizzahut.jpg" alt="Pizza Hut">

        <h2>Pizza Hut</h2>

        <p>Mangalore</p>

        <form action="menu.jsp" method="get">
            <button type="submit">View Menu</button>
        </form>

    </div>

    <!-- KFC -->
    <div class="card">

        <img src="images/kfc.jpg" alt="KFC">

        <h2>KFC</h2>

        <p>Bangalore</p>

        <form action="menu.jsp" method="get">
            <button type="submit">View Menu</button>
        </form>

    </div>

    <!-- Udupi Cafe -->
    <div class="card">

        <img src="images/udupicafe.jpg" alt="Udupi Cafe">

        <h2>Udupi Cafe</h2>

        <p>Mysore</p>

        <form action="menu.jsp" method="get">
            <button type="submit">View Menu</button>
        </form>

    </div>

</div>

</body>
</html>