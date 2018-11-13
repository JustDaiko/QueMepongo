<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><fmt:message key="title" /></title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form method="post" modelAttribute="userAAA">
		<table>
			<tr>
				<td align="right" width="20%">Usuario:</td>
				<td width="20%"><form:input path="userName" /></td>
				<c:if test="${userView.error}">
					<p>
						My salary is:
					<p>
				</c:if>
				<td align="right" width="20%">Contraseña:</td>
				<td width="20%"><form:password path="password" /></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="Iniciar sesion">
	</form:form>
	<a href="<c:url value="home.htm"/>">Home</a>
</body>
</html>