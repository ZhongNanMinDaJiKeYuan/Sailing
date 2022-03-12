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
    <title>功能列表</title>
    <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#testJson").click(function (){
                /*如何发送一个Ajax请求*/
                var url = this.href;
                var args = {};
                alert("hello");
                $.post(url, args, function (data){
                    alert("hey");
                    for(var i = 0; i<data.length; i++){
                        var id = data[i].id;
                        var lastName = data[i].lastName;
                        //alert(id + ":" + lastName);
                    }
                });
                return false;
            })
        })
    </script>

</head>
<body>

<a href="testException?i=1">testException</a><br><br>
<form action="testFileUpload" method="post" enctype="multipart/form-data">
    File:<input type="file" name="file"/><br>
    Desc:<input type="text" name="desc"/><br>
    <input type="submit" value="Submit"/>
</form>

    <a href="emps">List All Employees</a><br><br>
    <a href="testJson" id="testJson">testJson</a><br><br>


</body>
</html>
