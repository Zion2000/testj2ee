<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>

<jsp:useBean id="deuser" scope="request" 
class="Register.registerbean"></jsp:useBean>
<jsp:setProperty property="*" name="deuser"/>
<body>


		<%
				/* String name =request.getParameter("username");
				String pwd=  request.getParameter("userpwd");
				String age=	request.getParameter("userage");
				String ema=  request.getParameter("useremail");
				String food[]=request.getParameterValues("uhobbies"); */
		%>
		
	
		
		
		注册成功，信息如下：<br/>
		姓名：<jsp:getProperty name="deuser" property="username" /><br/>	
		密码：<jsp:getProperty name="deuser" property="userpwd" /><br/>
		年龄：<jsp:getProperty name="deuser" property="userage" /><br/>
		email：<jsp:getProperty name="deuser" property="useremail" /><br/>
	<% 
//获得所有name=choice的标签中被选中的
		
		/* if(food!=null)
			for(int a=0;a<food.length;a++){
			out.print(food[a]);
			} */
%>

</body>
</html>