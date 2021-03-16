<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>

<%
	//check 服务器端   A login suceess 客服端

	request.setCharacterEncoding("utf-8");
	String name =request.getParameter("username");
	String pwd =request.getParameter("userpwd");
	
	Cookie cookie1 = new Cookie("name",name);
  	Cookie cookie2 = new Cookie("pwd",pwd);
  	
  	//设置保留时间
  	/* cookie1.setMaxAge(100);
  	cookie2.setMaxAge(200); */
  	
  	response.addCookie(cookie1);   
  	response.addCookie(cookie2);   
     	
	      
	if(name.equals("wzw") && pwd.equals("123")){
		out.print("ok");
		
	 session.setAttribute("s_name", name);
	 session.setAttribute("s_pwd", pwd);
		
		
	response.sendRedirect("showLoginInfo.jsp"); //	重定向数据丢失 地址栏变化 // 两次请求 两次响应	
	//页面跳转	  //但地址栏无变化    //一次请求 一次响应
		//request.getRequestDispatcher("showLoginInfo.jsp").forward(request,response);
	}else{
		// error
		out.print("用户名或密码有误");
	} 

%>
</body>
</html>