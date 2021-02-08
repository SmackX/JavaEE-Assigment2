<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Demo for Assigment2</title>
    <style>
        h1{
            margin-left: 28%;
            margin-right: 30%;
            width: 800px;
            font-family: Arial;
            font-size: xxx-large;
            color: white;
            border-radius: 25px;
            margin-top: 480px;
        }
        .Cap{
            margin-left: 2%;
            width: 100px;
            float: left;
        }
        #Cap{
            float: right;
            margin-top: 2%;
            width: 225px;
            height: 60px;
        }
        #Between{
            background-color: white;
            width: 2px;
            height: 40px;
        }
        a{
            text-decoration: none;
            color: white;
            font-size: xx-large;
        }
        body {
            background-image: url(https://wallpaperstock.net/honeycomb-background-wallpapers_36560_1366x768.jpg);
        }
        #FirstDiv{
            padding-left: 3%;
        }
    </style>
</head>
<body>

    <div id="Cap">
        <div id="SecondDiv" class="Cap">
            <a href="LogIn">Log In</a>
        </div>
        <div id="Between" class="Cap">.</div>
        <div id="FirstDiv" class="Cap">
            <a href="SignIn">Sign In</a>
        </div>
    </div>
    <br/>
    <h1><%= "Welcome to Demo website!" %></h1>

</body>
</html>