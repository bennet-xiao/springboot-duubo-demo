<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
<script src="/static/js/addUser.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add users</title>
</head>
<body>
	<form id="add-user-form" action="/hello/add/user" method="POST">
	<input type="text" name="userId" placeholder="user id"/>
	<input type="text" name="userName" placeholder="user name"/>
	<input type="password" name="password" placeholder="user password"/>
	<input type="text" name="userAddress" placeholder="user address"/>
	<input type="button" value="sure" id="add-user-form-sure" onclick="addUser();"/>
	</form>
</body>
</html>