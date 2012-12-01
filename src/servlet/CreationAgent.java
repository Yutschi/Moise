package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Agent;
import formulaire.FormulaireCreationAgent;

/**
 * Servlet implementation class creationAgent
 */
public class CreationAgent extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    public static final String ATT_AGENT = "agent";
    public static final String ATT_FORMULAIRE  = "form";
    public static final String SESSION_AGENTS  = "agents";
    
    public static final String VUE_SUCCES = "/WEB-INF/displayAgent.jsp";
    public static final String VUE_FORMULAIRE = "/WEB-INF/creerAgent.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* À la réception d'une requête GET, simple affichage du formulaire */
        this.getServletContext().getRequestDispatcher( VUE_FORMULAIRE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Préparation de l'objet formulaire */
        FormulaireCreationAgent form = new FormulaireCreationAgent();

        /* Traitement de la requête et récupération du bean en résultant */
        Agent agent = form.creerAgent(request);

        /* Ajout du bean et de l'objet métier à l'objet requête */
        request.setAttribute( ATT_AGENT, agent );
        request.setAttribute( ATT_FORMULAIRE, form );
/* Si aucune erreur */
if ( form.getErreurs().isEmpty() ) {
    /* Alors récupération de la map des clients dans la session */
    HttpSession session = request.getSession();
    @SuppressWarnings("unchecked")
	Map<String, Agent> agents = (HashMap<String, Agent>) session.getAttribute( SESSION_AGENTS );
    /* Si aucune map n'existe, alors initialisation d'une nouvelle map */
    if ( agents == null ) {
        agents = new HashMap<String, Agent>();
    }
    /* Puis ajout du client courant dans la map */
    agents.put( agent.getNom(), agent );
    /* Et enfin (ré)enregistrement de la map en session */
    session.setAttribute( SESSION_AGENTS, agents );

    /* Affichage de la fiche récapitulative */
    this.getServletContext().getRequestDispatcher( VUE_SUCCES ).forward( request, response );
} else {
    /* Sinon, ré-affichage du formulaire de création avec les erreurs */
    this.getServletContext().getRequestDispatcher( VUE_FORMULAIRE ).forward( request, response );
}
//        if ( formulaire.getErreurs().isEmpty() ) {
//            /* Si aucune erreur, alors affichage de la fiche récapitulative */
//            this.getServletContext().getRequestDispatcher( VUE_SUCCES ).forward( request, response );
//        } else {
//            /* Sinon, ré-affichage du formulaire de création avec les erreurs */
//            this.getServletContext().getRequestDispatcher( VUE_FORMULAIRE ).forward( request, response );
//        }
    }
}
