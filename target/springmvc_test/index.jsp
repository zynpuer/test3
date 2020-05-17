<%--
  Created by IntelliJ IDEA.
  User: zynpu
  Date: 2020/5/14
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/listaccount">查询所有账户</a>
    <form action="account/saveaccount" method="post">
        <input type="text" name="name"><br>
        <input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
