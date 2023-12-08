<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>C4C Message Board</title>
    <link rel="stylesheet" href="webapp/CSS/board.css">
</head>
<body>
<h1><%= "C4C Anonymous Message Board" %></h1><br/>

<form name="createMessage" action="PostMessageServlet" method="post">
    <label for="message">Enter your message:</label><br>
    <input type="text" id="message" name="message">
    <button type="submit">Post Message</button>

    <ul>
        <c:forEach var="message" items="${messages}">
            <li>${message.getText()}</li>
        </c:forEach>
    </ul>
</form>
</body>
</html>


<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%--</body>--%>
<%--</html>--%>