<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<html lang="en">
<head>
    <title>User-info:</title>
</head>
<body>
<form action="#" th:action="@{/saveUser}" th:object="${user}" th:method="POST">
    <div>
    <label for="firstName">firstName</label>
    <input type="text" th:field="*{firstName}" id="firstName" placeholder="firstName">
    </div>
    <div>
    <label for="lastName">secondName</label>
    <input type="text" th:field="*{lastName}" id="lastName" placeholder="lastName">
    </div>
    <div>
    <label for="email">email</label>
    <input type="text" th:field="*{email}" id="email" placeholder="email">
    </div>
    <div>
        <input type="submit" value="Add user">
        <input style="color:black; display:inline-block" type="button" value="Cancel" onclick="window.location.href='/users'">
    </div>
</form>
</body>
</html>