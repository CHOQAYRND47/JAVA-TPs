package tp4_java;

public class CompteEpargne extends Compte {

	private double tauxInteret;

	public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) throws Exception {
		super(numero, titulaire, solde);
		this.tauxInteret = tauxInteret;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public void calculerInteret() {
		solde+= solde*tauxInteret/100;
	}

	@Override
	public void retirer(double montant) throws Exception {
		if (montant <= 0) {
			throw new Exception("montant doit etre positive");
		}
		if (solde < montant) {
			throw new Exception("solde insuffisant");
		}
		solde -= montant;
	}

}
