<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>出生日期</td>
        <td>性别</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${cs1}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.username}</td>
        	<td>${c.birthday}</td>
        	<td>${c.sex}</td>
        	<td>${c.address}</td>              
        </tr>
    </c:forEach>
</table>