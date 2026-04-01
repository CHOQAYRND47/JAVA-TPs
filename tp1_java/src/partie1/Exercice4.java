package partie1;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {

Scanner reader = new Scanner(System.in);
		
		System.out.print("Entrez un entier : ");
        int number = reader.nextInt();
        
        int sum = 0 ;
        
        while (number>=1) sum+=number--;
        
        System.out.println("La somme est :"+ sum);
        
        reader.close();

	}

}
