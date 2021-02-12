<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Test</title>
</head>
<body>
    <%! String name; %>
    <% name = "Jan Kowalski"; %>
    <h1>Witaj <%=name%>!</h1>
    <% for (int i=0; i<5; i++){ %>
        <p>Paragraf numer <%=i %></p>
    <%    }%>
</body>
</html>