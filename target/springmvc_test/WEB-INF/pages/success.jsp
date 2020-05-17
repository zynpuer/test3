<%--
  Created by IntelliJ IDEA.
  User: zynpu
  Date: 2020/5/14
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>SUCCESS</h3>
    <table border="1">
        <tbody>
            <tr>
                <td>ID</td>
                <td>NAME</td>
                <td>MONEY</td>
            </tr>
        </tbody>
        <c:forEach items="${list}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
