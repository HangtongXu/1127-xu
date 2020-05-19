<%@ page import="com.domain.Video" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 11548
  Date: 20-5-18
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>视频信息页</title>
</head>
<link href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
<style>
    * {
        box-sizing: border-box;
    }

    body {
        margin: 0;
        padding: 0;
        background: #494A5F;
        font-weight: 500;
        font-family: "Microsoft YaHei","宋体","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif, FreeSans, Arimo;
    }

    #container {
        width: 500px;
        height: 820px;
        margin: 0 auto;
    }
    div.search {padding: 30px 0;}

    form {
        position: relative;
        width: 300px;
        margin: 0 auto;
    }

    input, button {
        border: none;
        outline: none;
    }

    input {
        width: 100%;
        height: 42px;
        padding-left: 13px;
    }

    button {
        height: 42px;
        width: 42px;
        cursor: pointer;
        position: absolute;
    }

    /*搜索框1*/
    .bar1 {background: #A3D0C3;}
    .bar1 input {
        border: 2px solid #7BA7AB;
        border-radius: 5px;
        background: #F9F0DA;
        color: #9E9C9C;
    }
    .bar1 button {
        top: 0;
        right: 0;
        background: #7BA7AB;
        border-radius: 0 5px 5px 0;
    }
    .bar1 button:before {
        content: "\f002";
        font-family: FontAwesome;
        font-size: 16px;
        color: #F9F0DA;
    }

    table.hovertable {
        font-family: verdana,arial,sans-serif;
        font-size:20px;
        color:#333333;
        border-width: 1px;
        border-color: #999999;
        border-collapse: collapse;
    }
    table.hovertable th {
        background-color:#c3dde0;
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #a9c6c9;
    }
    table.hovertable tr {
        background-color:#d4e3e5;
    }
    table.hovertable td {
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #a9c6c9;
    }
</style>
<style type="text/css">

</style></p>
<body>
<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<center>

    <div id="container">
    <div class="serch bar1">
        <form action="/video" >
            <input type="text" placeholder="请输入要搜索的影视名称" name="video_message">
            <button type="submit"></button>
        </form>
    </div>

<table class="hovertable">
    <tr>
        <th>影视名称</th><th>影视上载时间</th><th>链接网址</th>
    </tr>
    <c:forEach items="${videos}" var="video" varStatus="count">
    <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td>${video.v_name}</td><td>${video.v_date}</td><td><a href=" ${video.v_url}">${count.index+1}</a></td>
    </tr>
    </c:forEach>
</table>
    </div>
</center>
</body>
</html>
