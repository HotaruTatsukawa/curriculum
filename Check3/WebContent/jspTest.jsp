<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<!-- name、idの入力エリアを作成しなさい -->
	<div class="jsp">
		<table>
			<tr>
				<th>name</th>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<th>id</th>
				<td><input type="text" name="id"></td>
			</tr>
		</table>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>