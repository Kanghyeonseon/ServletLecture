<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Result</h2>
<%
	String email = request.getParameter("email");
	String pwd = request.getParameter("pwd");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	
%>
<table>
	<tr>
		<td>이메일</td>
		<td><%=email %></td>
	</tr>
		<tr>
		<td>패스워드</td>
		<td><%=pwd %></td>
	</tr>
		<tr>
		<td>주소1</td>
		<td><%=addr1 %></td>
	</tr>
		<tr>
		<td>주소2</td>
		<td><%=addr2 %></td>
	</tr>
</table>
</body>
</html>