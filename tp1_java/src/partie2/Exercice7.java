package partie2;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int number = reader.nextInt();

        int[] tableau = new int[number];


        for (int i = 0; i < number; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = reader.nextInt();
        }


        int max = tableau[0];
        for (int i = 1; i < number; i++) {
            if (tableau[i] > max)
            	max = tableau[i];
        }

        
        System.out.println("Le plus grand élément du tableau est : " + max);

        reader.close();

	}

}
