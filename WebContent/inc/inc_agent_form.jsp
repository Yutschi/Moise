<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<label for="nomAgent">Nom <span class="requis">*</span></label>
<input type="text" id="nomAgent" name="nomAgent" value="<c:out value="${agent.nom}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['nomAgent']}</span>
<br />

<label for="prenomAgent">Prénom </label>
<input type="text" id="prenomAgent" name="prenomAgent" value="<c:out value="${agent.prenom}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['prenomAgent']}</span>
<br />

<label for="pwdAgent">Mot de passe <span class="requis">*</span></label>
<input type="text" id="pwdAgent" name="pwdAgent" value="<c:out value="${agent.pwdAgent}"/>" size="20" maxlength="20" />
<span class="erreur">${form.erreurs['pwdAgent']}</span>
<br />
    
<label for="codeAgent">Code Agent <span class="requis">*</span></label>
<input type="text" id="codeAgent" name="codeAgent" value="<c:out value="${agent.codeAgent}"/>" size="20" maxlength="20" />
<span class="erreur">${form.erreurs['codeAgent']}</span>
<br />

<label for="codeAgence">Code Agence	 <span class="requis">*</span></label>
<input type="text" id="adresseClient" name="adresseAgent" value="<c:out value="${agent.codeAgence}"/>" size="20" maxlength="20" />
<span class="erreur">${form.erreurs['codeAgence']}</span>
<br />        


<label for="emailAgent">Adresse email</label>
<input type="email" id="emailAgent" name="emailAgent" value="<c:out value="${agent.email}"/>" size="30" maxlength="60" />
<span class="erreur">${form.erreurs['emailAgent']}</span>
<br /><br />
       
<div id="typeAgent">
    <select name="listeTypeAgent" id="listeTypeAgent">
        <option value="">Choisissez une fonction...</option>
        <option id="AC" value="<c:out value="${agent.typeAgent}"/>">Agent comptable</option>
        <option id="AG" value="<c:out value="${agent.typeAgent}"/>">Agent de guichet</option>
        <option id="AD" value="<c:out value="${agent.typeAgent}"/>">Agent de direction</option>
    </select>
</div>
<br /><br />
