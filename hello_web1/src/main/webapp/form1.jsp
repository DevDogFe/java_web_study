<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Trebuchet MS;
}

body {
	background-color: #ddd;
	padding: 5px;
}

header {
	padding: 30px;
	text-align: center;
}

fieldset div {
	padding: 25px;
	display: flex;
	justify-content: space-between;
}

fieldset :first-child {
	padding-bottom: 0;
}

</style>
</head>
<body>

	<header>
		<h1>flex form 태그 만들어보기</h1>
	</header>

	<section>
		<form action="">
			<fieldset>
				<div>
					<label>Name : </label> <input type="text" size="100">
				</div>
				<div>
					<label>password : </label> <input type="password" size="100">
				</div>
			</fieldset>
		</form>
	</section>

</body>
</html>