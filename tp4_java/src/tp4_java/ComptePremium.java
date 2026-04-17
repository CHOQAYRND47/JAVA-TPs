package tp4_java;

public class ComptePremium extends Compte{
	
	private double plafondRetrait;
	
	public ComptePremium(String numero, String titulaire, double solde, double plafondRetrait) throws Exception {
		super(numero, titulaire, solde);
		this.plafondRetrait=plafondRetrait;
	}

	
	
	
	
	public double getPlafondRetrait() {
		return plafondRetrait;
	}

	public void setPlafondRetrait(double plafondRetrait) {
		this.plafondRetrait = plafondRetrait;
	}


	@Override
	public void retirer(double montant) throws Exception {
		if (montant <= 0) {
		    throw new Exception("montant doit etre positive");
		}
		if (montant > plafondRetrait) {
			throw new Exception("impossible de retirer , car monatant > plafond");
		}
		
		super.retirer(montant);
		super.retirer(montant);
	}
	
	

}
