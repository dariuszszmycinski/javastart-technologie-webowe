<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Poziom nawodnienia</title>
</head>
<body>
    <h1>Poziom nawodnienia organizmu</h1>
    <form action="control">
        <button name="option" value="water">Dodaj szklankę wody</button>
        <button name="option" value="clear">Wyzeruj licznik</button>
    </form>

<%
    Object water = request.getSession().getAttribute("water");
    if (water == null){
%>
    <h2>Dziś jeszcze nic nie wypiłeś!</h2>
<%
    }else {
%>
    <h2>Dziś wypiłeś: <%=water%>ml wody</h2>
<%
    }
%>
</body>
</html>