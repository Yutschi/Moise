<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="inc/design.css" />
    </head>
    <body>
    
    	<c:import url="/inc/menu.jsp" />
    
        <div>
            <form method="get" action="CreationAgent">
                <fieldset>
                    <legend>Merci d'entrer les informations suivantes</legend>
    
                    <label for="nomAgent">Nom <span class="requis">*</span></label>
                    <input type="text" id="nomAgent" name="nomAgent" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="prenomAgent">Prénom </label>
                    <input type="text" id="prenomAgent" name="prenomAgent" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="pwdAgent">Mot de passe <span class="requis">*</span></label>
                    <input type="text" id="pwdAgent" name="pwdAgent" value="" size="20" maxlength="20" />
                    <br />
                    
    				<label for="codeAgent">Code Agent <span class="requis">*</span></label>
                    <input type="text" id="codeAgent" name="codeAgent" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="codeAgence">Code Agence	 <span class="requis">*</span></label>
                    <input type="text" id="adresseClient" name="adresseAgent" value="" size="20" maxlength="20" />
                    <br />
                    
    				<div id="typeAgent">
                        <select name="listeTypeAgent" id="listeTypeAgent">
                            <option value="">Choisissez une fonction...</option>
                            <option id="AC" value="">Agent comptable</option>
                            <option id="AG" value="">Agent de guichet</option>
                            <option id="AD" value="">Agent de direction</option>
                        </select>
                    </div>
                    
                    <label for="emailAgent">Adresse email <span class="requis">*</span></label>
                    <input type="email" id="emailAgent" name="emailAgent" value="" size="20" maxlength="60" />
                    <br />
                </fieldset>
                
                <input type="submit" value="Valider"  />
                <input type="reset" value="Réinitialiser" /> <br />
            </form>
        </div>
    </body>
</html>