package Beans;

public class Agent {
	    private String nom;
	    private String prenom;
	    private String codeAgent;
	    private String pwdAgent;
	    private String codeAgence;
	    private String typeAgent;
	    private String email;

	    public void setNom( String nom ) {
	        this.nom = nom;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setPrenom( String prenom ) {
	        this.prenom = prenom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public String getCodeAgent() {
			return codeAgent;
		}

		public void setCodeAgent(String codeAgent) {
			this.codeAgent = codeAgent;
		}

		public String getPwdAgent() {
			return pwdAgent;
		}

		public void setPwdAgent(String pwdAgent) {
			this.pwdAgent = pwdAgent;
		}

		public String getCodeAgence() {
			return codeAgence;
		}

		public void setCodeAgence(String codeAgence) {
			this.codeAgence = codeAgence;
		}

		public String getTypeAgent() {
			return typeAgent;
		}

		public void setTypeAgent(String typeAgent) {
			this.typeAgent = typeAgent;
		}

		public void setEmail( String email ) {
	        this.email = email;
	    }

	    public String getEmail() {
	        return email;
	    }
}