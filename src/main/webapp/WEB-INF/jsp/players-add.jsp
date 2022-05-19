<%--
  Created by IntelliJ IDEA.
  User: nluo
  Date: 2022/5/19
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>add player</h1>
<form action="${pageContext.request.contextPath}/player/add" method="post">
    name<input type="text" name="name"><br>
    team<input type="text" name="team"><br>
    number<input type="text" name="number"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
