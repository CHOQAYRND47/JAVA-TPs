package tp3_java;

public class Moto extends Vehicule{
	
	private boolean avecCasque;

	public Moto(String matricule, String marque, boolean avecCasque) {
		super(matricule, marque);
		this.avecCasque = avecCasque;
	}
	
	@Override
	public void stationner() {
		System.out.println("Le moto se gard dans une place reservee aux deux-roues.");
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println(avecCasque ? "avec casque.": "sans casque.");
	}

}
