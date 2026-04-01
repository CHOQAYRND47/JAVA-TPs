package partie2;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		 int[] tableau = new int[10];

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Entrez l'élément "+(i + 1)+" : ");
	            tableau[i] = reader.nextInt();
	        }

	        
	        System.out.print("Entrez le nombre à rechercher : ");
	        int number = reader.nextInt();

	       
	        int position = -1;
	        for (int i = 0; i < 10; i++) {
	            if (tableau[i] == number) {
	                position = i;
	                break;
	            }
	        }

	        
	        if (position != -1) {
	            System.out.println("Le nombre " + number + " se trouve à la position " + position);
	        } else {
	            System.out.println("Le nombre " + number + " n'est pas dans le tableau.");
	        }



	        reader.close();

	}

}
