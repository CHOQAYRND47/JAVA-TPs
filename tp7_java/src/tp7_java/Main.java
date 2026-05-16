package tp7_java;

public class Main {

	public static double effectuerPaiement(double montant, double solde)
			throws AmountMustBePositiveException, InsufficientBalanceException {

		if (montant <= 0) {
			throw new AmountMustBePositiveException("Le montant doit être supérieur à zéro.");
		}

		if (montant > solde) {
			throw new InsufficientBalanceException("Solde insuffisant.");
		}

		return solde - montant;
	}

	public static double lireMontant(String valeur) throws NumberFormatException, AmountMustBePositiveException {

		double montant = Double.parseDouble(valeur);

		if (montant < 0) {
			throw new AmountMustBePositiveException("Le montant doit être supérieur à zéro.");
		}

		return montant;

	}

	public static double lireTransaction(double[] tab, int index) throws NullPointerException, ArrayIndexOutOfBoundsException {
		return tab[index];
	}
	
	
	
	
	

	public static void main(String[] args) {

		System.out.println("Partie 1 :");
		double solde = 1000;

		try {
			double newSolde = effectuerPaiement(200, solde);
			System.out.println("Paiement effectué avec succès.");
			System.out.println("Nouveau solde : " + newSolde);

		} catch (AmountMustBePositiveException e) {
			System.out.println("Erreur : " + e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println("Erreur : " + e.getMessage());
		} finally {
			System.out.println("Fin de la transaction");
		}
		
		
		

		System.out.println("\nPartie 3 :");
		try {
			double montant1 = lireMontant("150");
			System.out.println("Montant lu : " + montant1);
		} catch (NumberFormatException e) {
			System.out.println("Erreur : " + e.getMessage());
		} catch (AmountMustBePositiveException e) {
			System.out.println("Erreur : " + e.getMessage());
		}

		try {
			double montant2 = lireMontant("abc");
			System.out.println("Montant lu : " + montant2);
		} catch (NumberFormatException e) {
			System.out.println("Erreur : " + e.getMessage());
		} catch (AmountMustBePositiveException e) {
			System.out.println("Erreur : " + e.getMessage());
		}

		try {
			double montant3 = lireMontant("-50");
			System.out.println("Montant lu : " + montant3);
		} catch (NumberFormatException e) {
			System.out.println("Erreur : " + e.getMessage());
		} catch (AmountMustBePositiveException e) {
			System.out.println("Erreur : " + e.getMessage());
		}

		



		System.out.println("\nPartie 4 :");

		double[] transactions = { 120.5, 300.0, 75.25 };

		
		try {
			double valeur = lireTransaction(transactions, 1);
			System.out.println("Transaction : " + valeur);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur : indice invalide.");
		} catch (NullPointerException e) {
			System.out.println("Erreur : tableau non initialisé.");
		}


		
		try {
			double valeur = lireTransaction(transactions, 10);
			System.out.println("Transaction : " + valeur);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur : indice invalide.");
		} catch (NullPointerException e) {
			System.out.println("Erreur : tableau non initialisé.");
		}


		try {
			double[] tabNull = null;
			double valeur = lireTransaction(tabNull, 0);
			System.out.println("Transaction : " + valeur);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur : indice invalide.");
		} catch (NullPointerException e) {
			System.out.println("Erreur : tableau non initialisé.");
		}
	}
}