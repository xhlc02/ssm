<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list }" var="item">
		<table>
			<tr>
				<td>
					${item.id }
				</td>
				<td>
					${item.name}
				</td>
				<td>
					${item.age}
				</td>
			</tr>
			
		</table>
	</c:forEach>
</body>
</html>