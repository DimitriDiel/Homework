package lesson08.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100);

        }

        System.out.println(Arrays.toString(array));

        ServiceArray serviceArray = new ServiceArray();

        System.out.println(serviceArray.isDoubleInArray(array));


    }
}
