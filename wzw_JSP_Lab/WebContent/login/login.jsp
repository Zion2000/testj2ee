<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@page import="java.text.*"%>
<%@page import="java.util.Date"%>

<html>
  <head>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>在此处插入标题</title>
  </head>
  <body style="text-align: center;" >

	
  <%!
  String uname;
  String upwd;
  
  %>
  <%
  Cookie[] cookies = request.getCookies();
  
  for(Cookie c:cookies){
	 // out.print(c.getName()+"<br/>"+ c.getValue()+"<br/>");
	  
	  if(c.getName().equals("name")){
		  uname = c.getValue();}
	if(c.getName().equals("pwd"))  {
		  upwd = c.getValue();}
	  
  }
  
  %>
  
  
  <%
  Date date = new Date();
  SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
  Object count = application.getAttribute("count");
  if(count==null){
      application.setAttribute("count", 1);
  }else{
      Integer c = (Integer)count;
      application.setAttribute("count", c.intValue()+1);
  }
  Integer i = (Integer)application.getAttribute("count");
  out.print("第："+i+"位访客，访问时间为："+ft.format(date));
  
 %>
  
  	<div>
		<jsp:include page="..\Header.jsp"/>
		</div>
  
  <h1 >红色书店登陆？	</h1>
    <form action="doLogin.jsp" method="post">
      <table align="center">
    
    <tr>
    <td>用户名：	</td>
    <td><input type="text" name="username" value="<%=(uname==null?"":uname)%>"/></td>	
     </tr>	
    
   <tr>  
   
   	<td>密&nbsp;码：	   	</td>
	<td><input type="password" name="userpwd" value="<%=(upwd==null?"":upwd)%>"/></td>
   </tr>	
      	
	
     
  </table>
   <input type="submit" value="登陆" />
    </form>
 	
   
  </body>
</html>
