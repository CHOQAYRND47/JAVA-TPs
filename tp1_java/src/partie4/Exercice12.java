package partie4;
import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        System.out.print("Entrez une chaîne de caractères : ");
        String texte = reader.nextLine().toLowerCase();
        
        int compteur = 0;


        for (int i = 0; i < texte.length(); i++) {
            char character = texte.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                compteur++;
            }
        }

        System.out.println("Le nombre de voyelles dans la chaîne est : " + compteur);

        reader.close();
    }
}