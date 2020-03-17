<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page import="com.fullth.test.config.jdbcConfig"%>
<%@ page
	import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page import="com.fullth.test.mapper.reportMapperImpl"%>
<%@ page import="com.fullth.test.beans.reportVO"%>
<%@ page import="java.util.List"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<table border="1" width="600px">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>성별</th>
		</tr>
		<%
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);

			reportMapperImpl mapper = context.getBean("test_mapper", reportMapperImpl.class);
		%>
		<%
			List<reportVO> list1 = mapper.select_data();
			for (reportVO bean1 : list1) {
		%>
		<tr>
			<th><%=bean1.getCust_id()%></th>
			<th><%=bean1.getCust_name()%></th>
			<th><%=bean1.getCust_gender()%></th>
		</tr>
		<%
			}
			context.close();
		%>

	</table>
</body>
</html>
