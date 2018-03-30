<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>序号</td>
            <td>名字</td>
            <td>年龄</td>
            <td>状态</td>
        </tr>
        <c:forEach items="${users}" var="user" varStatus="i">
	        <tr>
	            <td>${i.index}</td>
	            <td>${user.name}</td>
	            <td>${user.age}</td>
	            <td><a href="delete?id=${user.id}" onclick="return confirm('你确定要删除？')">删除</a></td>
	        </tr>
        </c:forEach>
    </table>
</body>
</html>
