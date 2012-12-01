package gestion_err;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Agent;


/**
 * Servlet implementation class Inscription
 */
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 String nom = request.getParameter( "nomAgent" );
     String prenom = request.getParameter( "prenomAgent" );
     String pwdAgent = request.getParameter( "pwdAgent" );
     String codeAgence = request.getParameter( "codeAgence" );
     String codeAgent = request.getParameter( "codeAgent" );
     String typeAgent = request.getParameter( "typeAgent" );
     String email = request.getParameter( "emailAgent" );

     String message;
     
     if ( nom.isEmpty() || pwdAgent.isEmpty() || typeAgent.isEmpty() || codeAgent.isEmpty() || codeAgence.isEmpty() || email.isEmpty()) {
         message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerAgent.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un client.";
     } else {
         message = "Agent créé avec succès !";
     }
     
     Agent agent = new Agent();
     agent.setNom( nom );
     agent.setPrenom( prenom );
     agent.setPwdAgent( pwdAgent );
     agent.setCodeAgent( codeAgent );
     agent.setCodeAgence( codeAgence );
     agent.setTypeAgent( typeAgent );
     agent.setEmail( email );
     request.setAttribute( "agent", agent );
     request.setAttribute( "message", message );
     this.getServletContext().getRequestDispatcher( "/displayAgent.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
