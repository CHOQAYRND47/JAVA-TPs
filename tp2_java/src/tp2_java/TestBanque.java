package tp2_java;

public class TestBanque {

	public static void main(String[] args) {

		Banque banque = new Banque("MarocBank", 1500);

		CompteBancaire c1 = null, c2 = null, c3 = null;

		try {
			c1 = new CompteBancaire("Nourddine", 1000, 250);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		try {
			c2 = new CompteBancaire("Ayman", 1500, 500);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		try {
			c3 = new CompteBancaire("Aimrane", 2000, 750);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		CompteBancaire[] comptes = { c1, c2, c3 };

		for (int i = 0; i < comptes.length; i++) {

			try {
				banque.ajouterCompte(comptes[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		try {
			if (c1 != null) {
				c1.deposer(250.0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			if (c1 != null) {
				c1.retirer(2000.0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			if (c2 != null && c3 != null) {
				c2.virementVers(c3, 500.0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("===================================== \nComptes : \n");

		banque.afficherTous();

		System.out.println("=====================================");

		System.out.println("Solde Avec Interets : " + c2.calculerSoldeAvecInterets());
		System.out.println("Solde Avec Interets (avec bonus) : " + c2.calculerSoldeAvecInterets(0.015));

		System.out.println("nombre total de comptes : " + CompteBancaire.getNbCompte());
		System.out.println("taux d’intérêt annuel : " + CompteBancaire.getTauxInteretAnnuel());

	}

}
