<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/ThuVien/search" method="get">
    <input type="text" name="search"/>
    <input type="submit" value="search">
</form>
<c:if test="${result != null}">
    <p >Result: ${result}</p>
</c:if>

</body>
</html>