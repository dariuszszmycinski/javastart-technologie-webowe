<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kalkulator</title>
</head>
<body>
    <h2>Kalkulator</h2>
    <p>Jesteś zalogowany jako ${pageContext.request.userPrincipal.name}</p>
    <form action="${pageContext.request.contextPath}/calculator" method="post">
        <fieldset>
            <lagend>Wprowadź liczby i wybierz operator</lagend>
            <input type="number" name="first">
            <select name="operator">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>
            <input type="number" name="second">
        </fieldset>
        <button type="submit">Oblicz</button>
    </form>
</body>
</html>