<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.regex.Pattern"%>

<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="error.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



<title>在此处插入标题</title>
</head>
<body>

 

 <jsp:useBean id="deuser" scope="request"
  class="Register.registerbean">
  </jsp:useBean>
 <jsp:setProperty property="*" name="deuser"/>

<%


/* 	request.setCharacterEncoding("utf-8");
	String pwd =request.getParameter("userpwd");
	String email =request.getParameter("useremail");
	String age =request.getParameter("userage");
	String name =request.getParameter("username");
	 */
	  
	
%>
  <%       
  	
  
 if(deuser.isValidate()){	  
	 request.getRequestDispatcher("show.jsp").forward(request,response);
  }else{
	  
	 request.getRequestDispatcher("register.jsp").forward(request,response);
  }
%>
</body>
</html>