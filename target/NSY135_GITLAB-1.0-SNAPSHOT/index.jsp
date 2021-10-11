<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Menu JDBC</title>
</head>
<body>

<h1>Actions JDBC</h1>

<ul>
    <li>
        <a href="${pageContext.request.contextPath}/jdbc?action=connexion">Connexion</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/jdbc?action=requeteA">RequêteA</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/jdbc?action=requeteB">RequêteB</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/jdbc?action=requeteC&idArtiste=1">RequêteC</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/jdbc?action=requeteD&idArtiste=1">RequêteD</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/Jpa?action=connexion">Connextion JPA</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/Jpa?action=insertion">Insertion JPA</a>
    </li>
</ul>

</body>
</html>