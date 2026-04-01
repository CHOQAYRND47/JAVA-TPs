package partie4;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        System.out.print("Entrez une chaîne de caractères : ");
        String texte = reader.nextLine();

        
        String texteNormalise = texte.replaceAll("\\s+", "").toLowerCase();

        boolean estPalindrome = true;
        int longueur = texteNormalise.length();

        for (int i = 0; i < longueur / 2; i++) {
            if (texteNormalise.charAt(i) != texteNormalise.charAt(longueur - 1 - i)) {
                estPalindrome = false;
                break;
            }
        }

        if (estPalindrome) {
            System.out.println("La chaîne est un palindrome.");
        } else {
            System.out.println("La chaîne n'est pas un palindrome.");
        }

        reader.close();
    }
}