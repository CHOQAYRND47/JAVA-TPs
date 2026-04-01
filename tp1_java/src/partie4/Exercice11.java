package partie4;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        System.out.print("Entrez une chaîne de caractères : ");
        String text = reader.nextLine();



        System.out.println("La longueur de la chaîne est : " + text.length());

        reader.close();
    }
}