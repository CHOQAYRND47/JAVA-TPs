package tp2_java;

import java.util.UUID;

public class CompteBancaire {

	
	private UUID numero;
	private String titulaire;
	private double solde;
	
	private double decouvertAutorise;
	
	private static int nbCompte;
	private static double tauxInteretAnnuel = 0.03;
	
	

	public CompteBancaire() {
		this.numero = UUID.randomUUID();
		nbCompte++;
	}


	
	

	public CompteBancaire(String titulaire, double solde, double decouvertAutorise) throws Exception {
		this.numero = UUID.randomUUID();
		setTitulaire(titulaire);
		setDecouvertAutorise(decouvertAutorise);
		this.solde = solde;
		nbCompte++;
	}





	public UUID getNumero() {
		return numero;
	}




	public String getTitulaire() {
		return titulaire;
	}





	public void setTitulaire(String titulaire) throws Exception {
		if (titulaire == null || titulaire.trim().isEmpty()) {
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





	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}





	public void setDecouvertAutorise(double decouvertAutorise) throws Exception {
		if (decouvertAutorise<0) {
			throw new Exception("Decouverte doit etre non negatif !");
		}
		this.decouvertAutorise = decouvertAutorise;
	}





	public static int getNbCompte() {
		return nbCompte;
	}


	
	public static double getTauxInteretAnnuel() {
		return tauxInteretAnnuel;
	}





	public static void setTauxInteretAnnuel(double tauxInteretAnnuel) {
		CompteBancaire.tauxInteretAnnuel = tauxInteretAnnuel;
	}





	@Override
	public String toString() {
		return "Numero: "+numero+"\t, Titulaire: "+titulaire+"\t, Solde: "+solde+"\t, Decouvert: "+decouvertAutorise;
		}
	
	


	public void deposer(double montant) throws Exception{
		if (!(montant>0)) {
			throw new Exception("Montant de dépôt invalide.");
		}
		solde+=montant;
	}
	
	public void retirer(double montant) throws Exception {
		if(!(montant>0) || montant>solde+decouvertAutorise) {
			throw new Exception("Retrait refusé");
		}
		solde-=montant;
	}
	
	public void virementVers(CompteBancaire autre, double montant) throws Exception{
		if(!(montant>0) || montant>solde+decouvertAutorise) {
			throw new Exception("Virement impossible : montant ou solde insuffisant");
		}
		
		this.retirer(montant);
		autre.deposer(montant);
	}
	
	public double calculerSoldeAvecInterets() {
		return solde + solde * tauxInteretAnnuel;
	}
	
	
	
	public double calculerSoldeAvecInterets(double bonus) {
		return solde + solde * (tauxInteretAnnuel + bonus);
	}
	
	
	
	
	
}
