package partie4;

import java.util.HashMap;
import java.util.Map;

public class Exercice4 {
    public static void main(String[] args) {
         
        Map<String, Double> nomNoteList = new HashMap<>();

        nomNoteList.put("Morad", 14.5);
        nomNoteList.put("Sofian", 18.0);
        nomNoteList.put("Ossama", 12.0);
        nomNoteList.put("Ahmed", 16.5);
        

        System.out.println("================================\nListe des notes :");
        for (Map.Entry<String, Double> entree : nomNoteList.entrySet()) {
            System.out.println(entree.getKey() + " | Note : " + entree.getValue());
        }

        System.out.println("================================\nNote d'un étudiant :");
        String etudiant1 = "Ahmed";
        if (nomNoteList.containsKey(etudiant1)) {
            System.out.println("La note de " + etudiant1 + " est : " + nomNoteList.get(etudiant1));
        } else {
            System.out.println("L'étudiant n'existe pas !");
        }

        System.out.println("================================\nModifier une note :");
        String etudiant2 = "Sofian";
        if (nomNoteList.containsKey(etudiant2)) {
            nomNoteList.put(etudiant2, 14.0); 
            System.out.println("La nouvelle note de " + etudiant2 + " est : " + nomNoteList.get(etudiant2));
        }

        System.out.println("================================\nSupprimer un étudiant :");
        String etudiant3 = "Morad";
        nomNoteList.remove(etudiant3);
        System.out.println("L'étudiant " + etudiant3 + " a été supprimé avec succès.");

        System.out.println("================================\nLa moyenne générale de la classe :");
        if (!nomNoteList.isEmpty()) {
            double somme = 0;
            for (double note : nomNoteList.values()) {
                somme += note;
            }
            double moyenneGenerale = somme / nomNoteList.size();
            System.out.println("La moyenne générale de la classe est : " + moyenneGenerale);
        } else {
            System.out.println("La liste est vide !");
        }
    }
}