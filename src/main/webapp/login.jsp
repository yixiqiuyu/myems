<%--
  Created by IntelliJ IDEA.
  User: gejian
  Date: 11/17/19
  Time: 7:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="/logincheck" method="post">
        用户名：<input type="text" name="adminName"/>
        密  码：<input type="password" name="password"/>
    </form>
    <input type="submit" value="提交">
</body>
</html>
