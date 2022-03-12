<%--
  Created by IntelliJ IDEA.
  User: Littlekids8
  Date: 2022/2/21
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Success</h3>
    <%--通过requestScope.time去获取ModelAndView中的数据--%>
    time: ${requestScope.time}
    <br>    <br>
    names: ${requestScope.names}
    <br>    <br>
    sessionAttributes user: ${sessionScope.user}
    <br>    <br>
    test request user : ${requestScope.user}<%--访问request域中的--%>
    <br>    <br>
    sessionAttributes school: ${sessionScope.school}

</body>
</html>
