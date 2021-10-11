<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Requête D</title>
</head>
<body>
    <p><a href="${pageContext.request.contextPath}/index.jsp">Accueil</a></p>
    <h1>Info réalisateur</h1>
    <p><c:out value="${requestScope.artiste.nom}"/></p>
    <p><c:out value="${requestScope.artiste.prenom}"/></p>
</body>
</html>
