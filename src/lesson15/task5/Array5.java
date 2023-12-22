package lesson15.task5;

import java.util.Arrays;

public class Array5 {

    public static void main(String[] args) {

        int[] array5 = new int[12];

        for (int i = 0; i < array5.length; i++) {

            int random = (int) (Math.random() * (15 + 15 + 1) - 15);

            array5[i] = random;
        }
        System.out.println(Arrays.toString(array5));

        int max = 0;

        for (int i = 0; i < array5.length; i++) {
            if (array5[i] >= max) {
                max = array5[i];
                System.out.println("Число " + max + " с индексом " + i + " является максимальным");
            }

        }

    }

}
