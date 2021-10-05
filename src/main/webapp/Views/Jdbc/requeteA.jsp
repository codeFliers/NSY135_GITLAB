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
    <title>Requête A</title>
</head>
<body>
    <p><a href="${pageContext.request.contextPath}/jdbc">Accueil</a></p>
    <h1>Liste de films</h1>
    <!-- List<Map<String, String>> filmList = new ArrayList<Map<String, String>>(); -->

    <c:set var="cmpt" value="0" scope="page" />
    <c:forEach items="${requestScope.film}" var="value">
        <table style="border:1px solid #333">
            <thead style="background-color: #333;color: #fff;">
                <th colspan="2">FILMS ${cmpt = cmpt +1}</th>
            </thead>
            <tbody>
                <c:forEach var="entry" items="${value}">
                    <tr>
                        <td><c:out value="${entry.key}"/></td>
                        <td><c:out value="${entry.value}"/> </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:forEach>
</body>
</html>
