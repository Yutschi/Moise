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
     String adresse = request.getParameter( "adresseAgent" );
     String telephone = request.getParameter( "telephoneAgent" );
     String email = request.getParameter( "emailAgent" );

     String message;
     
     if ( nom.isEmpty() || adresse.isEmpty() || telephone.isEmpty() ) {
         message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerAgent.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un client.";
     } else {
         message = "Agent créé avec succès !";
     }
     
     Agent agent = new Agent();
     agent.setNom( nom );
     agent.setPrenom( prenom );
     agent.setAdresse( adresse );
     agent.setTelephone( telephone );
     agent.setEmail( email );
     request.setAttribute( "agent", agent );
     request.setAttribute( "message", message );
     this.getServletContext().getRequestDispatcher( "/afficherAgent.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
