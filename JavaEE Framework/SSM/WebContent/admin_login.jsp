<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% String path = request.getContextPath();%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=path %>/user/login" method="post">
		<input type="text" name="email" />
		<input type="password" name="pwd" />
		<input type="submit"/>
	</form>
</body>
</html>