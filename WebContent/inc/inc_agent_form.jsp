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

<label for="adresseAgent">Adresse de livraison <span class="requis">*</span></label>
<input type="text" id="adresseAgent" name="adresseAgent" value="<c:out value="${agent.adresse}"/>" size="30" maxlength="60" />
<span class="erreur">${form.erreurs['adresseAgent']}</span>
<br />

<label for="telephoneAgent">Numéro de téléphone <span class="requis">*</span></label>
<input type="text" id="telephoneAgent" name="telephoneAgent" value="<c:out value="${agent.telephone}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['telephoneAgent']}</span>
<br />

<label for="emailAgent">Adresse email</label>
<input type="email" id="emailAgent" name="emailAgent" value="<c:out value="${agent.email}"/>" size="30" maxlength="60" />
<span class="erreur">${form.erreurs['emailAgent']}</span>
<br />