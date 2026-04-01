package partie1;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Entrez un entier : ");
		int number = reader.nextInt();

		System.out.println(number < 0 ? "Négatif" : number == 0 ? "Nul" : "Positif");

		reader.close();

	}

}
