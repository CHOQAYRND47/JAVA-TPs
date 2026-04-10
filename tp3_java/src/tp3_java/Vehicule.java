package tp3_java;

public class Vehicule {
	
	protected String matricule , marque;

	public Vehicule(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}
	
	
	public void stationner() {
		System.out.println("Le vehicule se gard dans le parking.");
	}


	public void afficher() {
		System.out.print("Matricule=" + matricule + ", Marque=" + marque + ". ");
	}
	
	
}
