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
	欢迎。${session.get("user").name}<br>
	全局变量：${application.get("applicationAcount")}<br>
	会话变量：<%=session.getAttribute("user") %><br>
	当前用户数量：${users.size() }<br>
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
		struts2标签获取属性：<s:property value="#session.user.name"/>	
</body>
</html>