<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<html lang="en">
<head>
    <title>User-info:</title>
</head>
<body>
<form action="#" th:action="@{/updateUser}" th:object="${user}" th:method="PATCH">
    <div>
        <input type="text" th:field="*{id}" id="id" placeholder="id" hidden="hidden">
    </div>
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
        <input type="submit" value="update">
        <a href="/users"><input type="button" value="Cancel"></a>

    </div>
</form>
</body>
</html>