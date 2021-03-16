<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body style="text-align: center;" >
<jsp:useBean id="deuser" scope="request" 
class="Register.registerbean"></jsp:useBean>
 <jsp:setProperty property="*" name="deuser"/>
 
		<div>
		<jsp:include page="..\Header.jsp"/>
		</div>
		
	
      <%=deuser.getErrorMsg("errname")%><br> 
		
		<h1 >红色书店注册系统？	</h1>
		<form action="rcheck.jsp" method="post" accept-charset="UTF-8" >
			<table align="center">			
				<tr><td>用户名：</td><td><input type="text" name="username" value='<jsp:getProperty property="username" name="deuser"/>'/></td>  
				  <td> <%=deuser.getErrorMsg("errname")%> <%=deuser.getErrorMsg("namenullerror") %></td>
				  </tr>
				<tr><td>年&nbsp;&nbsp;龄： </td><td><input type="text" name="userage"  value='<jsp:getProperty property="userage" name="deuser"/>'/></td>
				  <td> <%=deuser.getErrorMsg("errorage")%>  </td>
				</tr>
				<tr><td>email：&nbsp; </td><td><input  type="text" name="useremail" value='<jsp:getProperty property="useremail" name="deuser"/>'/></td>
				 <td>  <%=deuser.getErrorMsg("errormail")%><%=deuser.getErrorMsg("emnullerror") %></td>
				</tr>
				<tr><td>密&nbsp;&nbsp;码：</td><td> <input type="password" name="userpwd" value='<jsp:getProperty property="userpwd" name="deuser"/>'/></td>
				  <td> <%=deuser.getErrorMsg("errorpwd")%>  <%=deuser.getErrorMsg("pwdnullerror") %></td>
				</tr>
				<tr><td>确认密码：</td><td> <input type="password" name="cf_pwd" value='<jsp:getProperty property="cf_pwd" name="deuser"/>'/></td>
				 <td> <%=deuser.getErrorMsg("errorcf")%></td>
				</tr>
			</table>
			<br/>
			<input type="submit" value="注册"  >
		</form>
	
	
	
</body>
</html>