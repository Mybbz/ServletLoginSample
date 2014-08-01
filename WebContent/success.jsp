<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<%
		AccountBean account = (AccountBean)session.getAttribute("account");
	%>
	UserName: <%=account.getUsername() %><br>
	PassWord: <%=account.getPassword() %><br>
</body>
</html>