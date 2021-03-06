<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Please Log In</title>
</head>
<body>
  <h1>Please Log In2</h1>
  <p>This page demonstrates the use of HttpServletRequest.login(String,String) integration with Spring Security.</p>
  <form:form action="./login" method="post" modelAttribute="loginForm">
    <p>
      <label for="username">username</label>
      <form:input path="username"/>
    </p>
    <p>
      <label for="password">password</label>
      <form:password path="password"/>
    </p>
    <p>
      <input type="submit" value="Log In"/>
    </p>
  </form:form>
</body>
</html>
