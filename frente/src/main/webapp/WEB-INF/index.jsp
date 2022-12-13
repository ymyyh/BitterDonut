<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HomePage</title>
    <style>
        .pic div img{
            width: 576px;
            height: 324px;
            margin-left: 25px;
            margin-right: 25px;
            margin-bottom: 50px;
            float: left;
        }
        .pic div a{
            width: 576px;
            margin-left: 25px;
            margin-right: 25px;
            float: left;
            text-align: center;
        }
        .url div{
            text-align: right;
        }
    </style>
</head>
<body>
<h1 align="center">BitterDonut资源网站</h1>
<div class="url">
    <div><a href="http://localhost:8011/login">登录</a></div>
</div>
<hr>

<%--<div class="pic">--%>
<%--    <div>--%>
<%--        <c:forEach items="${respurces}" var="resource">--%>
<%--            <tr>--%>
<%--                <td><img src="${resource.picUrl}"></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td align="center"><a href="${resource.url}">${resource.name}</a></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </div>--%>
<%--</div>--%>

<p>${requestScope.countResources}</p>

</body>
</html>