package lesson15.task4;

public class Matrica {

    public void transponirMatrica(int[][] matrica){
        for (int i = 0; i < matrica.length; i++) {
            for (int j = i + 1; j < matrica[i].length; j++) {
                int temp = matrica[i][j];
                matrica[i][j] = matrica[j][i];
                matrica[j][i] = temp;

            }

        }

    }

}
