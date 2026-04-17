package tp4_java;

import java.util.UUID;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte[] = new Compte[4];

		try {
			compte[0] = new CompteCourant(UUID.randomUUID().toString(), "Ayman", 800, 100);
		} catch (Exception e) {
			System.out.println("ERROR :" + e.getMessage());
		}

		try {
			compte[1] = new CompteEpargne(UUID.randomUUID().toString(), "Mohammed", 2000, 50);
		} catch (Exception e) {
			System.out.println("ERROR :" + e.getMessage());
		}

		try {
			compte[2] = new ComptePremium(UUID.randomUUID().toString(), "Ilyass", 1200, 500);
		} catch (Exception e) {
			System.out.println("ERROR :" + e.getMessage());
		}

		try {
			compte[3] = new CompteCourant(UUID.randomUUID().toString(), "Aimrane", 5000, 400);
		} catch (Exception e) {
			System.out.println("ERROR :" + e.getMessage());
		}

		for (int i = 0; i < compte.length; i++) {
			try {
				compte[i].deposer(300);

			} catch (Exception e) {
				System.out.println("ERROR :" + e.getMessage());
			}

			try {
				compte[i].retirer(1250);

			} catch (Exception e) {
				System.out.println("ERROR :" + e.getMessage());
			}

			compte[i].afficher();
			System.out.println("\n");
		}

		for (int i = 0; i < compte.length; i++) {
			if (compte[i] instanceof CompteEpargne)
				compte[i].afficher();
		}

		try {
			Compte c = new CompteEpargne(UUID.randomUUID().toString(), "Ali", 3000, 250);
			CompteCourant cc = (CompteCourant) c;
		} catch (Exception e) {
			System.out.println("\nERROR :" + e.getMessage());
		}

	}

}