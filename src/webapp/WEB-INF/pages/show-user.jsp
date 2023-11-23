<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<html lang="en">
<head>
    <title>Show user:</title>
</head>
<body>
<div>ID:</div>
<p style="color:rebeccapurple" th:text="${user.id}"></p>

<div>firstname:</div>
<p style="color:rebeccapurple" th:text="${user.firstName}"></p>

<div>lastname:</div>
<p style="color:rebeccapurple" th:text="${user.lastName}"></p>

<div>email:</div>
<p style="color:rebeccapurple" th:text="${user.email}"></p>

<a style="display:inline-block" th:href="'/edit?id='+${user.id}" >
    <input style="color: black" type="button" value="Update user">
</a>
<form style="display:inline-block" th:method="DELETE" th:action="'/deleteUser?id='+${user.Id}">
    <input type="submit" value="Delete user"/>
</form>
<input style="color:black; display:inline-block" type="button" value="Cancel" onclick="window.location.href='/users'">
</body>
</html>


