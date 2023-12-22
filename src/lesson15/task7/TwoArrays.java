package lesson15.task7;

import java.util.Arrays;

public class TwoArrays {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            int random = (int) (Math.random() * (5 - 0 + 1) + 0);
            array1[i] = random;
        }
        for (int i = 0; i < array2.length; i++) {
            int random = (int) (Math.random() * (5 - 0 + 1) + 0);
            array2[i] = random;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int sumArray1 = 0;

        for (int i = 0; i < array1.length; i++) {
            sumArray1 = sumArray1 + array1[i];
        }
        int averageArray1 = sumArray1 / 5;

        int sumArray2 = 0;

        for (int i = 0; i < array2.length; i++) {
            sumArray2 = sumArray2 + array2[i];
        }
        int averageArray2 = sumArray2 / 5;

        System.out.println("Среднее арифметическое массива 1: " + averageArray1);
        System.out.println("Среднее арифметическое массива 2: " + averageArray2);

        if (averageArray1 > averageArray2) {
            System.out.println("Среднее арифметическое массива 1 больше");
        }
        if (averageArray2 > averageArray1) {
            System.out.println("Среднее арифметическое массива 2 больше");
        }
        if (averageArray1 == averageArray2) {
            System.out.println("Средние арифметические массивов равны");
        }
    }
}
