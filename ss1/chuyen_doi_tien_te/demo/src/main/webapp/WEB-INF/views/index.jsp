<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/TienTe" method="post">
    <input name="money" type="number"> USD
    <input type="submit">
</form>

<br>
<h1>${result}</h1>
</body>
</html>