<%--
  Created by IntelliJ IDEA.
  User: Littlekids8
  Date: 2022/2/23
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>全体员工信息表</title>
    <%--导入jquery，删除功能需要--%>
    <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
    <script type="text/javascript">
        /*在提交时，把form表单的action更改为超链接，以便可以post方法直接删除*/
        $(function (){
            $(".delete").click(function (){
                alert("hello");
                var href = $(this).attr("href");// 取出delete的链接赋值给表单的action
                $("form").attr("action", href).submit();
                return false;
            });
        })
    </script>
</head>
<body>


<form action="" method="POST">
    <input type="hidden" name="_method" value="DELETE">
</form>
<br>
<a href="emp"> Add New Emplyee</a>
<br>
<br>
    <c:if test="${empty requestScope.employees}">
        没有任何员工信息。
    </c:if>

    <c:if test="${!empty requestScope.employees}">

        <table border="1" cellpadding="10" cellspacing="0" style="margin: auto">
            <tr>
                <th>ID</th>
                <th>LastName</th>
                <th>email</th>
                <th>gender</th>
                <th>Department</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${requestScope.employees}" var="emp">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.lastName}</td>
                    <td>${emp.email}</td>
                    <td>${emp.gender==0?'Male':'Female'}</td>
                    <td>${emp.department.departmentName}</td>
                    <td><a href="emp/${emp.id}">Edit</a> </td>
                    <td><a class="delete" href="emp/${emp.id}">Delete</a> </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
<%--${requestScope.employees}--%>


</body>
</html>
