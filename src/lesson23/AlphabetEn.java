package lesson23;

import java.util.ArrayList;

public class AlphabetEn {

    public static void main(String[] args) {

        ArrayList<String> alphabetEn = new ArrayList<>();

        alphabetEn.add("A");
        alphabetEn.add("B");
        alphabetEn.add("C");
        alphabetEn.add("D");
        alphabetEn.add("E");
        alphabetEn.add("F");
        alphabetEn.add("G");
        alphabetEn.add("H");
        alphabetEn.add("I");
        alphabetEn.add("J");

        System.out.println(alphabetEn);

        System.out.println("===========================");

        for (int i = 0; i < alphabetEn.size(); i++) {

            System.out.println(alphabetEn.get(i));
        }

        System.out.println("===========================");

        for (int i = alphabetEn.size() - 1; i >= 0; i--) {

            System.out.println(alphabetEn.get(i));
        }


    }
}
