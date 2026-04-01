package partie3;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[][] matrice = new int[3][3];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Entrez l'élément ["+i+"]["+j+"] : ");
                matrice[i][j] = reader.nextInt();
            }
        }

        int sum = 0 ;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum+= matrice[i][j];
            }
        }
        
        System.out.println(sum);

        reader.close();
    }
}