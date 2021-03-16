<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>

 <jsp:useBean id="conn" scope="request"
  class="DataBase.JDBC">
  </jsp:useBean>
 <jsp:setProperty property="*" name="conn"/>

	<%
	conn.connect();
	%>
	
	<a href="test">test</a>
	
</body>
</html>