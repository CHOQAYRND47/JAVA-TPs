package tp2_java;


public class Banque {
	
	private String nom;
	private CompteBancaire comptes[];
	private int nbActuels;
	public Banque(String nom , int capacite) {
		comptes  = new CompteBancaire[capacite];
		this.nom = nom;
	}
	
	
	public void ajouterCompte(CompteBancaire c) throws Exception {
		if(comptes.length==nbActuels) {
			throw new Exception("aucune place dispo pout cette compte !");
		}
		this.comptes[nbActuels] = c;
		nbActuels++;
	}
	
	public void afficherTous() {
		for (int i = 0; i < nbActuels; i++) {
		    System.out.println(comptes[i].toString());
		}
	}
	

}
