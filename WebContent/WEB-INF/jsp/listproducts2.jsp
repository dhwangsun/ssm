<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>序号</td>
        <td>产品名称</td>
        <td>品牌</td>
        <td>规格型号</td>
        <td>单位</td>
        <td>价格</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
        	<td>${c.brand}</td>
        	<td>${c.type}</td>
        	<td>${c.unit}</td>
        	<td>${c.price}</td>              
        </tr>
    </c:forEach>
</table>
