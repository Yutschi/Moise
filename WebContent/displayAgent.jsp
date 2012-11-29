<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage d'un agent</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/design.css"/>" />
    </head>
    <body>
        <c:import url="/inc/menu.jsp" />
        <div id="corps">
            <p class="info">${ form.resultat }</p>
            <p>Nom : <c:out value="${ agent.nom }"/></p>
            <p>Prénom : <c:out value="${ agent.prenom }"/></p>
            <p>Adresse : <c:out value="${ agent.adresse }"/></p>
            <p>Numéro de téléphone : <c:out value="${ agent.telephone }"/></p>
            <p>Email : <c:out value="${ agent.email }"/></p>
        </div>
    </body>
</html>