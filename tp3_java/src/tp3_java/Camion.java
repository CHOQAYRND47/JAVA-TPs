package tp3_java;

public class Camion  extends Vehicule{
	
	private double chargeMax;

	public Camion(String matricule, String marque, double chargeMax) {
		super(matricule, marque);
		this.chargeMax = chargeMax;
	}
	
	@Override
	public void stationner() {
		System.out.println("Le camion se gard dans une zone pour vehicules lourds.");
	}
	
	@Override
	public void afficher() {
			super.afficher();
			System.out.println("charge max :"+chargeMax);
	}

}
