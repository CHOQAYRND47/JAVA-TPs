package partie3;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[][] matrice = new int[3][3];
        int[][] transposee = new int[3][3];


        System.out.println("Remplissez la matrice 3x3 :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Entrez l'élément ["+i+"]["+j+"] : ");
                matrice[i][j] = reader.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposee[j][i] = matrice[i][j];
            }
        }


        System.out.println("La matrice transposée est :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposee[i][j] + "\t");
            }
            System.out.println();
        }

        reader.close();
    }
}