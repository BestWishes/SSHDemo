<%@page import="com.bigbest.utils.MessageUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>struts2 demo page</title>
</head>
<body>
<s:debug></s:debug>
<%-- 	${application}<br> --%>
<%-- 	${request }<br> --%>
	1:<s:property value="#session"/><br>
	2:<s:property value="#session.json"/>
	<br>
	3:<%=request.getLocale()%><br>
	tips:<s:property value="session.message"></s:property>
		<table>
		<caption>用户列表</caption>
		<tr>		
			<th>编号:</th><th>姓名:</th><th>年龄:</th><th>密码:</th>
		</tr>
		<s:iterator id="u" value="users">
			<tr>
			<td><s:property value="#u.id"/></td>
			<td><s:property value="#u.name"/> </td>
			<td><s:property value="#u.age"/> </td>
			<td><s:property value="#u.password"/> </td>
		</tr>
		</s:iterator>
		</table>
		struts2标签获取属性：<s:property value="#session.user.name"/>	<br>
		<s:url value="/index.jsp" var="url1">
			<s:param name="user" value="'123'"></s:param>
		</s:url>
		s:url:${indexurl }	
		<s:url action="login" method="post" namespace="/" includeParams="all" var="url2" > </s:url>
		${url2 }
		<br>
		<s:url var="url3" includeParams="all"></s:url>
		${url3 }
</body>
</html>