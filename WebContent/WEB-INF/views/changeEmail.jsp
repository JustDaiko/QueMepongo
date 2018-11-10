<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
  </style>  
</head>
<body>
<h1><fmt:message key="priceincrease.heading"/></h1>
<form:form method="post" modelAttribute="changeEmail">
  <table >
    <tr>
      <td align="right" width="20%">Email nuevo:</td>
        <td width="20%">
          <form:input path="email"/>
        </td>
        <td width="60%">
          <form:errors path="email" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
  <input type="submit" value="Execute">
</form:form>
<a href="<c:url value="home.htm"/>">Home</a>
</body>
</html>