package partie6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercice6 {
    public static void main(String[] args) {

        List<Livre> inventaire = new ArrayList<>();
        inventaire.add(new Livre("ISBN-001", "Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        inventaire.add(new Livre("ISBN-002", "1984", "George Orwell", 1949));
        inventaire.add(new Livre("ISBN-003", "L'Étranger", "Albert Camus", 1942));
        inventaire.add(new Livre("ISBN-004", "Les Misérables", "Victor Hugo", 1862));

        Set<String> categories = new HashSet<>();
        categories.add("Roman");
        categories.add("Science-Fiction");
        categories.add("Philosophie");

        Map<String, Livre> emprunts = new HashMap<>();
        
        System.out.println("================================\nAssocier un étudiant à un livre emprunté :");
        Livre livre1 = inventaire.get(1);
        emprunts.put("Adam", livre1);
        System.out.println("Adam a emprunté : " + livre1.getTitre());
        
        Livre livre2 = inventaire.get(0);
        emprunts.put("Ayoub", livre2);
        System.out.println("Ayoub a emprunté : " + livre2.getTitre());

        System.out.println("================================\nRechercher un livre :");
        String titre = "L'Étranger";
        boolean exist = false;
        for (Livre l : inventaire) {
            if (l.getTitre().equalsIgnoreCase(titre)) {
                System.out.println("Le livre existe !");
                exist = true;
                break;
            }
        }
        if (!exist) System.out.println("Le livre n'existe pas !");

        System.out.println("================================\nSupprimer un livre :");
        String id = "ISBN-004";
        boolean supprime = inventaire.removeIf(l -> l.getIsbn().equals(id));
        if (supprime) {
            System.out.println("Livre supprimé avec succès !");
        }

        System.out.println("================================\nAfficher tous les livres disponibles :");
        int nbDispo = 0;
        for (Livre l : inventaire) {
            if (!emprunts.containsValue(l)) {
                System.out.println(l);
                nbDispo++;
            }
        }
        if (nbDispo == 0) System.out.println("Aucun livre n'est disponible pour le moment !");

        System.out.println("================================\nGénération du rapport final :");

        System.out.println("\n=======================================");
        System.out.println("RAPPORT FINAL");
        System.out.println("========================================");
        System.out.println("Livres au total dans l'inventaire : " + inventaire.size());
        System.out.println("Livres actuellement en prêt       : " + emprunts.size());
        System.out.println("Livres disponibles en rayon       : " + nbDispo);
        System.out.println("Les genres littéraires proposés   : " + categories);
        System.out.println("\nDétail des emprunts en cours :");
        if (emprunts.isEmpty()) {
            System.out.println("Aucun livre n'est emprunté.");
        } else {
            for (Map.Entry<String, Livre> entry : emprunts.entrySet()) {
                System.out.println(entry.getKey() + " a emprunté : " + entry.getValue().getTitre());
            }
        }
    }
}