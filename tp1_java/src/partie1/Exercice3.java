package partie1;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		
Scanner reader = new Scanner(System.in);
		
		System.out.print("Entrez un entier : ");
        int number = reader.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        reader.close();

	}

}
