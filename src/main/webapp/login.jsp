<!-- /WEB-INF/jsp/login.jsp -->
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/login">
  <label for="login">Login:</label>
  <input type="text" name="login" id="login" required><br>

  <label for="password">Password:</label>
  <input type="password" name="password" id="password" required><br>

  <input type="submit" value="Login">
</form>
</body>
</html>
