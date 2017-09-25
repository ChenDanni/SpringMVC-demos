<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: cdn
  Date: 17/7/25
  Time: 下午2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="/test" method="post">

    <label for="inputUsername" class="sr-only">username</label>
    <input type="text" id="inputUsername" class="form-control" name="username" placeholder="username">


    <label for="inputPassword" class="sr-only">pwd</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="pwd" name="password">

    <button type="submit">login</button>
</form>

</body>
</html>
