<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
	编号:<input type="hidden" value="${en.empId }" name="empId" > 
	姓名:<input type="text" value="${en.empName }" name="empName">
	职位:
	<select name="postId">
	<c:forEach items="${plist }" var="row">
		<c:if test="${row.postName==en.post.postName }">
			<option value="${row.postId }" selected="selected">${row.postName }</option>
		</c:if>
		<c:if test="${row.postName!=en.post.postName }">
			<option value="${row.postId }" >${row.postName }</option>
		</c:if>
	</c:forEach>
	</select>
	<input type="submit">
	</form>
</body>
</html>