package partie2;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau number : ");
        int number = reader.nextInt();

        int[] tableau = new int[number];


        for (int i = 0; i < number; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = reader.nextInt();
        }


        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < number; i++) {
            System.out.print(tableau[i] + " ");
        }
        reader.close();

	}

}
