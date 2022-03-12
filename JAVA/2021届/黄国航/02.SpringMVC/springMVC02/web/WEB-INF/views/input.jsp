<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Littlekids8
  Date: 2022/2/23
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${employee.id == null?'添加新员工':'修改员工信息'}</title>
</head>
<body>

    <%--1. 使用form标签可以更快速开发出表单页面，而且可以更方便的进行表单的回显
        2. 可以通过 modelAttribute 属性指定绑定的模型属性。若没有指定该属性，则默认从 request 域对象中读取 command 的表单 bean,如果该属性值也不存在，则会发住错误。

    --%>
<form:form action="${pageContext.request.contextPath}/emp" method="post" modelAttribute="employee">
    <%--path属性值对应html表单标签的name属性值--%>
    <c:if test="${employee.id == null}">
        LastName: <form:input path="lastName"/><br>
    </c:if>
    <c:if test="${employee.id != null}">
        <form:hidden path="id"/><br>
        <%--如果是修改操作的话，需要把提交方式改为put--%>
        <input type="hidden" name="_method" value="PUT"/>
    </c:if>
    Email: <form:input path="email"/><br>
    <%
        Map<String,String>  genders = new HashMap<>();
        genders.put("1","Male");
        genders.put("0","Female");
        /*一个map存放性别标签，*/
        request.setAttribute("genders",genders);
    %>
    Gender: <form:radiobuttons path="gender" items="${genders}"/><br>
    Department: <form:select path="department.id" items="${departments}"
            itemLabel="departmentName" itemValue="id"></form:select>

    <input type="submit" value="Submit">
</form:form>

</body>
</html>
