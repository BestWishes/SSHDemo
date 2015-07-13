<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		欢迎。
		${user.name}<br>
		<table>
		<caption>用户列表</caption>
		<tr>		
			<th>编号:</th><th>姓名:</th><th>年龄:</th><th>密码:</th>
		</tr>
		<tr>
			<td><s:property value="session.user.id"/></td>
			<td><s:property value="session.user.name"/> </td>
			<td><s:property value="session.user.age"/> </td>
			<td><s:property value="session.user.password"/> </td>
		</tr>
		
		</table>
		<form action="getUsers" method="post">
			<input type="submit" name="getUsers">
		</form>
		
	</body>
</html>