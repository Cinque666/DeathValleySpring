<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Список пользователей</title>
</head>
<body>
<table border="2">
    <tr>
        <td>Name</td>
        <td>Surname</td>
        <td>Account</td>
    </tr>
    <tr>
        <%--<c:set target="${userandaccountjoin}"/>--%>
        <td>${name}</td>
        <td>${surname}</td>
        <td>${account}</td>
    </tr>
</table>
</body>
</html>