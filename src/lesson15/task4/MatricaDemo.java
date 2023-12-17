package lesson15.task4;

import java.util.Arrays;

public class MatricaDemo {
    public static void main(String[] args) {

        int[][] matrice1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i = 0; i < matrice1.length; i++) {

            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + "|");
            }
            System.out.println();
        }

        Matrica matrica = new Matrica();

        matrica.transponirMatrica(matrice1);


        System.out.println("=========================");


        for (int i = 0; i < matrice1.length; i++) {

            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + "|");
            }
            System.out.println();
        }

    }
}
