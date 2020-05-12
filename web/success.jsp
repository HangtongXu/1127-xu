<%--
  Created by IntelliJ IDEA.
  User: 11548
  Date: 20-4-29
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功</title>
</head>
<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
    table.imagetable {
        font-family: verdana,arial,sans-serif;
        font-size:20px;
        color:#333333;
        border-width: 10px;
        border-color: #999999;
        border-collapse: collapse;
    }
    table.imagetable th {
        background:#b5cfd2 url('cell-blue.jpg');
        border-width: 10px;
        padding: 8px;
        border-style: solid;
        border-color: #999999;
    }
    table.imagetable td {
        background:#dcddc0 url('cell-grey.jpg');
        border-width: 10px;
        padding: 8px;
        border-style: solid;
        border-color: #999999;
    }
</style>


<!-- Table goes in the document BODY -->

<body>
<table class="imagetable">
    <tr>
        <th>用户名</th><th>密码</th>
    <tr>
        <td>${username}</td><td>${password}</td>
    </tr>
</table>
<a href="/again" ><font size="6">重新登陆</font> </a>
</body>
</html>
