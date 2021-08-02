<html lang="ru">
<meta charset="utf-8">
<title> MAIN MENU</title>

<style type="text/css">

    body{
        background-color: black;
        margin-top: 250px;
        text-align: center;
    }
    /*form{*/
    /*    margin-top: 320px;*/
    /*    text-align: center;*/
    /*}*/
    .button{
        font-weight: 700;
        color: black;
        text-decoration: none;
        padding: .8em 1em calc(.8em + 3px);
        border-radius: 3px;
        background: hotpink;
    }

</style>

</head>
<body>
<form action="${pageContext.request.contextPath}\name" method="POST">
    <input type="text" name="name" placeholder="Enter your name">
    <input class="button" type="submit" name = "submit" value = "Hello world">
</form>
<form action="${pageContext.request.contextPath}\february" method = "GET">
    <input class="button" type="submit" name = "submit" value = "Calendar">
</form>
</body>
</html>
