<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <style>
        body{
        background-color: hotpink;
        margin-top: 250px;
        text-align: center;
    }
        #button{
            font-weight: 700;
            color: hotpink;
            text-decoration: none;
            padding: .8em 1em calc(.8em + 3px);
            border-radius: 3px;
            background: black;
        }
        input{
            width: 300px;
            font-size: 13px;
            padding: 1px 0 4px 3px;
            border: 1px solid #cecece;
            border-radius: 8px;
        }
        input{
            padding-bottom: 5px\0;
        }
    </style>

</head>
    <body>
        <form action="${pageContext.request.contextPath}\registration" method="POST">

            <input type="text" name = "login" placeholder="Username"></br>
            <input type="text" name = "password" placeholder="Password"></br>
            <input type="text" name = "email" placeholder="Email"></br>
            <label> Ж </label>
            <input type="radio" name = "radio" value = "female"></br>
            <label> М </label>
            <input type="radio" name = "radio" value = "male"></br>

            <input type="submit" value="Login" id = "button">
        </form>
    </body>
</html>
