<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<!-- path URI 형식 기준으로 사용 -->
	<div class="d-flex m-3">
		<form action="upload" method="post" enctype="multipart/form-data">
		    <p>Custom file:</p>
		    <div class="custom-file mb-3">
		      <input type="file" class="custom-file-input" id="customFile" name="file">
		      <label class="custom-file-label" for="customFile">Choose file</label>
		    </div>
			<input type="text" name="text"  class="form-control"> <br>
		    <div class="mt-3">
		      <button type="submit" class="btn btn-info">Upload</button>
		    </div>
		</form>
	</div>
	<script>
		//$: JQuery 시작(=jquery.)
		$(".custom-file-input").on("change", function() {
			// val(): value, split(\\): 마지막\뒤의 문자열만 남김, pop(): 띄움
		  let fileName = $(this).val().split("\\").pop();
			// siblings("#"): this의 형제중에 #인것, 
		  $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
		});
	</script>
</body>
</html>