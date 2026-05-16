package partie3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercice3 {
    public static void main(String[] args) {
        
        Set<String> matieres = new HashSet<>();
        matieres.add("Mathématiques");
        matieres.add("Physique");
        matieres.add("Informatique");
        matieres.add("Histoire");
        
        System.out.println("================================\nVérifier qu’aucun doublon n’existe :");
        boolean estAjoute = matieres.add("Informatique");
        if (!estAjoute) {
            System.out.println("La matière Informatique existe déjà !");
        }

        System.out.println("================================\nListe des matières :");
        for (String matiere : matieres) {
            System.out.println(matiere.toString());
        }

        System.out.println("================================\nCopier les matières dans un TreeSet :");
        Set<String> matierestree = new TreeSet<>(matieres);

        System.out.println("================================\nAfficher les matières triées par ordre alphabétique :");
        for (String matiere : matierestree) {
            System.out.println(matiere.toString());
        }
    }
}