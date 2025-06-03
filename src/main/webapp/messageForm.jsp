<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Message</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/getMessage">
        <label>Title: <input type="text" name="title" /></label><br/>
        <label>Author: <input type="text" name="author" /></label><br/>
        <label>Age: <input type="number" name="age" /></label><br/>
        <label>Message: <textarea name="message"></textarea></label><br/>
        <input type="submit" value="Send Message" />
    </form>
</body>
</html>
