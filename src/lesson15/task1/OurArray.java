package lesson15.task1;

import java.util.Arrays;

public class OurArray {

    public static void main(String[] args) {

        String[] ourArray = new String[5];

        ourArray[0] = "String 1";
        ourArray[1] = "String 2";
        ourArray[2] = "String 3";
        ourArray[3] = "String 4";
        ourArray[4] = "String 5";

        System.out.println(Arrays.toString(ourArray));

        ServiceArray serviceArray = new ServiceArray();

        serviceArray.mirrorArray(ourArray);

        System.out.println(Arrays.toString(ourArray));




    }

}
