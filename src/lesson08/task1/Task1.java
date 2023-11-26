package lesson08.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your array size: ");
        int arraySize = scanner.nextInt();

        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {

            System.out.println("Please enter " + i + " element of array");
            intArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(intArray));

        int[] intArrayResult = new int[intArray.length];


        for (int i = 0; i < intArray.length; i++) {

            intArrayResult[i] = intArray[intArray.length - (i+1)];

        }
        System.out.println(Arrays.toString(intArrayResult));

    }
}
