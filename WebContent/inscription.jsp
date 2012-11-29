<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un Agent</title>
        <link type="text/css" rel="stylesheet" href="inc/design.css" />
    </head>
    <body>
        <div>
            <form method="get" action="CreationAgent">
                <fieldset>
                    <legend>Informations agent</legend>
    
                    <label for="nomAgent">Nom <span class="requis">*</span></label>
                    <input type="text" id="nomAgent" name="nomAgent" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="prenomAgent">Prénom </label>
                    <input type="text" id="prenomAgent" name="prenomAgent" value="" size="20" maxlength="20" />
                    <br />
    
                    <label for="adresseAgent">Adresse de livraison <span class="requis">*</span></label>
                    <input type="text" id="adresseClient" name="adresseAgent" value="" size="20" maxlength="20" />
                    <br />
    
                    <label for="telephoneAgent">Numéro de téléphone <span class="requis">*</span></label>
                    <input type="text" id="telephoneAgent" name="telephoneAgent" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="emailAgent">Adresse email</label>
                    <input type="email" id="emailAgent" name="emailAgent" value="" size="20" maxlength="60" />
                    <br />
                </fieldset>
                <input type="submit" value="Valider"  />
                <input type="reset" value="Réinitialiser" /> <br />
            </form>
        </div>
    </body>
</html>