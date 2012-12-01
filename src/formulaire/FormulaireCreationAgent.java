package formulaire;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import Beans.Agent;

public class FormulaireCreationAgent
{
	    private static final String CHAMP_NOM  = "nomAgent";
	    private static final String CHAMP_PRENOM = "prenomAgent";
	    private static final String CHAMP_PWDAGENT = "pwdAgent";
	    private static final String CHAMP_CODEAGENT  = "codeAgent";
	    private static final String CHAMP_CODEAGENCE = "codeAgencd";
//	    private static final String CHAMP_TYPEAGENT   = "typeAgent"; car imposé par la listebox
	    private static final String CHAMP_EMAIL = "emailAgent";

	    private String              resultat;
	    private Map<String, String> erreurs  = new HashMap<String, String>();

	    public Map<String, String> getErreurs() {
	        return erreurs;
	    }

	    public String getResultat() {
	        return resultat;
	    }

	    public Agent creerAgent( HttpServletRequest request ) {
	        String nom = getValeurChamp( request, CHAMP_NOM );
	        String prenom = getValeurChamp( request, CHAMP_PRENOM );
	        String pwdAgent = getValeurChamp( request, CHAMP_PWDAGENT );
	        String codeAgent = getValeurChamp( request, CHAMP_CODEAGENT );
	        String codeAgence = getValeurChamp( request, CHAMP_CODEAGENCE );
	        String email = getValeurChamp( request, CHAMP_EMAIL );

	        Agent agent = new Agent();

	        try {
	            validationNom( nom );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_NOM, e.getMessage() );
	        }
	        agent.setNom( nom );

	        try {
	            validationPrenom( prenom );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_PRENOM, e.getMessage() );
	        }
	        agent.setPrenom( prenom );

	        try {
	            validationPassword( pwdAgent );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_PWDAGENT, e.getMessage() );
	        }
	        agent.setPwdAgent( pwdAgent );

	        try {
	            validationCodeAgent( codeAgent );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_CODEAGENT, e.getMessage() );
	        }
	        agent.setCodeAgent( codeAgent );
	        
	        try {
	            validationCodeAgence( codeAgence );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_CODEAGENCE, e.getMessage() );
	        }
	        agent.setCodeAgence( codeAgence );
	        
	                
	        try {
	            validationEmail( email );
	        } catch ( Exception e ) {
	            setErreur( CHAMP_EMAIL, e.getMessage() );
	        }
	        agent.setEmail( email );

	        if ( erreurs.isEmpty() ) {
	            resultat = "Succès de la création du client.";
	        } else {
	            resultat = "Échec de la création du client.";
	        }

	        return agent;
	    }

	    private void validationNom( String nom ) throws Exception {
	        if ( nom != null ) {
	            if ( nom.length() < 2 ) {
	                throw new Exception( "Le nom d'utilisateur doit contenir au moins 2 caractères." );
	            }
	        } else {
	            throw new Exception( "Merci d'entrer un nom d'utilisateur." );
	        }
	    }

	    private void validationPrenom( String prenom ) throws Exception {
	        if ( prenom != null && prenom.length() < 2 ) {
	            throw new Exception( "Le prénom d'utilisateur doit contenir au moins 2 caractères." );
	        }
	    }

	    private void validationPassword( String pwdAgent ) throws Exception {
	        if ( pwdAgent != null ) {
	        	 if ( !pwdAgent.matches( "^\\d+$" ) ) {
		                throw new Exception( "Le mot de passe ne doit pas contenir les caracteres :  ^\\d+$." );
		         } else if ( pwdAgent.length() < 8 && pwdAgent.length() > 50) {
	                throw new Exception( "Le mot de passe doit contenir minimum 8 caractères et maximum 50 caracteres." );
	            }
	        } else {
	            throw new Exception( "Merci d'entrer un mot de passe valide." );
	        }
	    }

	    private void validationCodeAgent( String codeAgent ) throws Exception {
	        if ( codeAgent != null ) {
	            if ( !codeAgent.matches( "^\\d+$" ) ) {
	                throw new Exception( "Le code de l'agent ne doit pas contenir les caracteres : ^\\d+$." );
	            } else if ( codeAgent.length() != 8  ) {
	                throw new Exception( "Le code de l'agent doit contenir  8 chiffres." );
	            }
	        } else {
	            throw new Exception( "Merci d'entrer un code agent valide." );
	        }
	    }
	    
	    private void validationCodeAgence( String codeAgence ) throws Exception {
	        if ( codeAgence != null ) {
	            if ( !codeAgence.matches( "^\\d+$" ) ) {
	                throw new Exception( "Le code de l'agence ne doit pas contenir les caracteres : ^\\d+$." );
	            } else if ( codeAgence.length() < 4  ) {
	                throw new Exception( "Le code de l'agence doit contenir  au moins 4 caracteres." );
	            }
	        } else {
	            throw new Exception( "Merci d'entrer un code agence valide." );
	        }
	    }
	    
	    private void validationEmail( String email ) throws Exception {
	        if ( email != null && !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
	            throw new Exception( "Merci de saisir une adresse mail valide." );
	        }
	    }

	    /*
	     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
	     */
	    private void setErreur( String champ, String message ) {
	        erreurs.put( champ, message );
	    }

	    /*
	     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
	     * sinon.
	     */
	    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
	        String valeur = request.getParameter( nomChamp );
	        if ( valeur == null || valeur.trim().length() == 0 ) {
	            return null;
	        } else {
	            return valeur;
	        }
	    }
	}
