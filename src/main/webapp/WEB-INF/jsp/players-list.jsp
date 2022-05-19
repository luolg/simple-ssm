<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Here are players</h1>

<ol>
    <c:forEach items="${players}" var="player">
        <li>${player}</li>
    </c:forEach>

</ol>

</body>
</html>
