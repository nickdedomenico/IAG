<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Identity and Access Management Governance (IAG)</title>

<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resources/css/login.css">
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">

      <form:form class="form-signin" method="post" action="processLogin" modelAttribute="theUser">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputUserID" class="sr-only">PNC User ID</label>
        <input type="text" id="inputUserID" name="userID" path="userID" class="form-control" placeholder="PNC User ID" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="userPassword" path="userPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form:form>
      ${message}

    </div>

</body>
</html>