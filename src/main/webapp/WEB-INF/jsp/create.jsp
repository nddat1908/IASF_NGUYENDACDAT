<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create New Employee</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1 style="text-align: center">Create New Employee</h1>

<form  method="post" action="add">
    <input class="form-control form-control-lg mb-3" type="text" placeholder="Name " name="name"><br>
    <hr>
    <input  type="number" placeholder="Wage" name="wage"><br>
    <hr>
    <input class="btn btn-primary" type="submit" value="Submit">
</form>

</body>
</html>
