<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Users</h3>
    
    <c:forEach items="${model.users}" var="user">
      <c:out value="${user.user}"/> <c:out value="${user.email}"/><br><br>
    </c:forEach>
    <br>
    	<a href="<c:url value="/changeEmail.htm"/>">ChangeEmail</a>
    <br>
  </body>
</html>