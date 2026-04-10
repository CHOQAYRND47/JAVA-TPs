package tp3_java;

public class Voiture extends Vehicule {
	
	
	private int nbPortes;

	public Voiture(String matricule, String marque, int nbPortes) {
		super(matricule, marque);
		this.nbPortes = nbPortes;
	}
	
	
	@Override
	public void stationner() {
		System.out.println("La voiture se gard dans une pace standard.");
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("nombre de portes : "+nbPortes);
	}
	

}
