<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Category Information</title>
</head>
<body>
	<h1>Category Insert Form</h1>
	<form action="/todo2/cTest?action=insert" method="post">
		<input type="text" name="name" required="required">
		<input type="submit" value="카테고리 저장">
	</form>
</body>
</html>