<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<!-- 파일 업로드 위해서는 enctype을 아래와같이 선언해야한다. -->
	<form action="uploadProc" method="post" enctype="multipart/form-data">
		<label for="file">choose a file :</label> <input type="file" name="file" id="file">
		<br>
		<input type="submit" value="upload">
	</form>
</body>
</html>