package partie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Nourddine", 15.5));
        etudiants.add(new Etudiant("Ayman", 12.0));
        etudiants.add(new Etudiant("Aimrane", 18.5));
        etudiants.add(new Etudiant("Ilyass", 14.0));
        etudiants.add(new Etudiant("Mohammed", 16.2));
        
        System.out.println("================================\n");
        
        for (Etudiant e : etudiants) {
            System.out.println(e.toString());
        }

        System.out.println("================================\n");
        
        String nameToSearch = "Ilyass";
        
        boolean trouve = false;
        for (Etudiant e : etudiants) {
            if (e.getNom().equalsIgnoreCase(nameToSearch)) {
                System.out.println("L'étudiant existe ! " + e.toString());
                trouve = true;
                break;
            }
        }
        if (!trouve) System.out.println("L'étudiant n'existe pas dans la liste !");

        System.out.println("================================\nVeuillez saisir l'ID à supprimer : ");
        Scanner reader = new Scanner(System.in);
        
        // Copiez l'ID depuis la liste affichée ci-dessus ! (UUID)
     
        String idToDelete = reader.next();
        for (Etudiant e : etudiants) {
            if(e.getId().toString().equals(idToDelete)) {
                etudiants.remove(e);
                System.out.println("Étudiant supprimé avec succès.");
                
                break;
            }
        }
        System.out.println("================================\nLa nouvelle liste des étudiants :");
        for (Etudiant e : etudiants) {
            System.out.println(e.toString());
        }

        System.out.println("================================\nListe triée :");
        Collections.sort(etudiants);
        for (Etudiant e : etudiants) {
            System.out.println(e.toString());
        }

        System.out.println("================================\nÉtudiant ayant la meilleure moyenne :");
        if (!etudiants.isEmpty()) {
            Etudiant etudiant = Collections.max(etudiants);
            System.out.println("Nom : " + etudiant.getNom() + " | Moyenne : " + etudiant.getMoyenne());
        }
    }
}