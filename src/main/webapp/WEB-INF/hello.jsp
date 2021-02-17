<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: haggbart
  Date: 17/02/2021
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h1>${requestScope.greeting}</h1>
<c:forEach var="item" begin="1" end="10">
    <p>Item ${item}</p>
</c:forEach>
</body>
</html>
