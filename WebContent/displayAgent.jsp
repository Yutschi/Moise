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
            <p>Mot de passe : <c:out value="${ agent.pwdAgent }"/></p>
            <p>Code Agent : <c:out value="${ agent.codeAgent }"/></p>
            <p>Code Agence : <c:out value="${ agent.codeAgence }"/></p>
            <p>Fonction Agent : <c:out value="${ agent.typeAgent }"/></p>
            <p>Email : <c:out value="${ agent.email }"/></p>
        </div>
    </body>
</html>