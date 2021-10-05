<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Requête C (Artiste)</title>
</head>
<body>
    <p><a href="${pageContext.request.contextPath}/jdbc">Accueil</a></p>
    <h1>Info artiste</h1>
    <p><c:out value="${requestScope.artiste.nom}"/></p>
    <p><c:out value="${requestScope.artiste.prenom}"/></p>
    <p><c:out value="${requestScope.artiste.annee_naissance}"/></p>
</body>
</html>
