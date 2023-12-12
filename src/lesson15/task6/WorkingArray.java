package lesson15.task6;

import java.util.Arrays;

public class WorkingArray {
    public static void main(String[] args) {

        int[] array = new int[8];

        UtilArray utilArray = new UtilArray();

        utilArray.fillArray(array);

        System.out.println(Arrays.toString(array));

        utilArray.replaceElements(array);

        System.out.println(Arrays.toString(array));

    }
}
