<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<table border="1" width="600px">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>성별</th>
		</tr>
		<c:forEach var="bean1" items="${list1}">
			<tr>
				<th>${bean1.cust_id}</th>
				<th>${bean1.cust_name}</th>
				<th>${bean1.cust_gender}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>