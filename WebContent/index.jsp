<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><td>编号</td><td>姓名</td><td>职位</td><td>操作</td></tr>
	<c:forEach items="${list }"  var ="row">
	<tr><td>${row.empId }</td><td>${row.empName }</td>
	<td>${row.post.postName }</td>
	<td><a href="selbyid">修改</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>