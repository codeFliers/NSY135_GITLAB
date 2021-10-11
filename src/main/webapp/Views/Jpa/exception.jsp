
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Exception JPA</title>
</head>
<body>
    <p><a href="${pageContext.request.contextPath}/index.jsp">Accueil</a></p>
    <p>Exception JPA PAS OK</p>
    <p><c:out value="${requestScope.message}"/> </p>
</body>
</html>
