package tp4_java;

public class Compte {

	protected String numero, titulaire;
	protected double solde;

	public Compte(String numero, String titulaire, double solde) throws Exception {
		if(null == titulaire || titulaire.isEmpty()) {
			throw new Exception("titulaire doit etre non vide !");
		}
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = solde;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(String titulaire) throws Exception {
		if(null == titulaire || titulaire.isEmpty()) {
			throw new Exception("titulaire doit etre non vide !");
		}
		this.titulaire = titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void deposer(double montant) throws Exception {
		if(montant<=0) {
			throw new Exception("montant depose doit etre positive !");
		}
		solde+=montant;
	}

	public void retirer(double montant) throws Exception {
		if (montant <= 0) {
		    throw new Exception("montant doit etre positive");
		}
		if (solde < montant) {
		    throw new Exception("solde insuffisant");
		}
		solde-=montant;
	}

	public void afficher() {
		System.out.println("Numero :"+ numero + ", Titulaire : "+ titulaire +", solde :"+solde);
	}

}
