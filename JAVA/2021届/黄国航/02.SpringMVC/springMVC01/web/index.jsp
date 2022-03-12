<%--
  Created by IntelliJ IDEA.
  User: Littlekids8
  Date: 2022/2/21
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<br><br>
<a href="springmvc/testRedirect">testRedirect</a>

<br><br>
<a href="springmvc/testHelloView">testHelloView</a>

<br><br>
<a href="springmvc/testViewAndViewResolver">testViewAndViewResolver</a>
<%--模拟修改操作
    1. 原始数据为 User:1,Tom，12345，guo@qq.com,12
    2. 密码不能修改
    3. 表单回显， 模拟操作直接在表单填写对应的属性值
--%>
<br><br>
<form action="springmvc/testModelAttribute" method="post">
    <input type="hidden" name="id" value="1"><br>
    username: <input type="text" name="username" value="Tom"><br>
    email: <input type="text" name="email" value="guo@qq.com"><br>
    age: <input type="text" name="age" value="12"><br>
    <input type="submit" name="submit"><br>
</form>

<br><br>
<a href="springmvc/testSessionAttributes">testSessionAttributes</a>
<br><br>
<a href="springmvc/testMap">testMap</a>
<br><br>
<a href="springmvc/testModelAndView">testModelAndView</a>
<form action="springmvc/testPojo" method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="password" name="password"/><br>
    email:<input type="text" name="email"/><br>
    age:<input type="text" name="age"/><br>
    <%--级联属性--%>
    city:<input type="text" name="address.city"/><br>
    province:<input type="text" name="address.province"/><br>

    <input type="submit" value="submit"/><br>
</form>


<a href="hello">hello</a>
<br><br>
<a href="springmvc/testRequestParam?username=marry&age=10">test RequestParam</a>
<br><br>
<a href="springmvc/testRequestHeader">testRequestHeader</a>
<br><br>
<a href="springmvc/testCookieValue">testCookieValue</a>
</body>
</html>
