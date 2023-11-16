<!DOCTYPE html>
<html>
    <h1>Cars list</h1>
    <body>
        <table>
            <tr>
                <th>YEAR</th>
                <th>MARK</th>
                <th>NUMBER</th>
            </tr>
            <tr th:each="car: ${cars}">
                <td th:text="${car.year}" />
                <td th:text="${car.mark}" />
                <td th:text="${car.number}" />
            </tr>
        </table>
    </body>
</html>


