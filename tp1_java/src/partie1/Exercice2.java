package partie1;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Entrez le premier nombre : ");
		int number1 = reader.nextInt();

		System.out.print("Entrez le deuxième nombre : ");
		int number2 = reader.nextInt();

		System.out.print("Entrez le troisième nombre : ");
		int number3 = reader.nextInt();

		System.out.println("Le maximum est :" +
				(number1 > number2 ?
				(number1 > number3 ? number1 : number3)
				:
				(number2 > number3 ? number2 : number3)));
		
		//OR
		
		System.out.println("Le maximum est :" +Math.max(Math.max(number1, number2), number3));
		
		reader.close();

	}

}
