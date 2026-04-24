package tp5_java;

public abstract class Abonnement {
	
	private String nom;
	private double prixBase;
	private int nbProfils;
		
	public Abonnement(String nom, double prixBase, int nbProfils) {
		this.nom = nom;
		this.prixBase = (!(prixBase>0))? 100 : prixBase ;
		this.nbProfils = (!(nbProfils>0))? 1 : nbProfils;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrixBase() {
		return prixBase;
	}

	public void setPrixBase(double prixBase) {
		this.prixBase = prixBase;
	}

	public int getNbProfils() {
		return nbProfils;
	}


	public void setNbProfils(int nbProfils) {
		this.nbProfils = nbProfils;
	}
	
	public boolean estPartageFamilial() {
		return nbProfils >=3;
	}
	
	public void afficherInfos() {
		System.out.println("Nom :"+nom+" ,PrixBase :"+prixBase+" ,nombre de profile :"+nbProfils+" ,est patage faminlial :"+estPartageFamilial());
	}
	
	
	public abstract double calculerCoutMensuel();
	
	public abstract int calculerScoreSatisfaction();
	
	
	
	
}
