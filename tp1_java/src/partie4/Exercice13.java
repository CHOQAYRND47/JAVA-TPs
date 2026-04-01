package partie4;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        System.out.print("Entrez une chaîne de caractères : ");
        String text = reader.nextLine();

        String inverse = "";


        for (int i = text.length() - 1; i >= 0; i--) {
            inverse += text.charAt(i);
        }

        System.out.println("La chaîne inversée est : " + inverse);

        reader.close();
    }
}