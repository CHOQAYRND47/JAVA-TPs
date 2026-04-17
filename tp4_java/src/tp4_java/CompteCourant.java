package tp4_java;

public class CompteCourant extends Compte {
	
	private double decouvertAutorise;
	
	public CompteCourant(String numero, String titulaire, double solde , double decouvertAutorise) throws Exception {
		super(numero, titulaire, solde);
		this.decouvertAutorise=decouvertAutorise;
	}
	
	
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}


	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}


	@Override
	public void retirer(double montant) throws Exception {
		if (montant <= 0) {
		    throw new Exception("montant doit etre positive");
		}
		if (solde-montant < -decouvertAutorise) {
			throw new Exception("solde insufisant");
		}
		solde-=montant;
	}

	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("le decouvert autorise :" +decouvertAutorise);
	}
	
	
	

}
