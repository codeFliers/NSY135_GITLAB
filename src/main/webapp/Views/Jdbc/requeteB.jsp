<%--
  Created by IntelliJ IDEA.
  User: fabie
  Date: 05/10/2021
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Requête B</title>
</head>
<body>
    <p><a href="${pageContext.request.contextPath}/jdbc">Accueil</a></p>
    <h1>Liste de films</h1>
    <c:forEach items="${requestScope.film}" var="value">
        <p><c:out value="${value.titre}"/> <c:out value="${value.annee}"/></p>
    </c:forEach>
</body>
</html>
