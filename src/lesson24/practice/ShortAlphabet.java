package lesson24.practice;

import java.util.HashMap;

public class ShortAlphabet {
    public static void main(String[] args) {

        HashMap<Character, String> shortAlphabet = new HashMap<>();

        shortAlphabet.put('A',"Apple");
        shortAlphabet.put('B',"Bus");

        System.out.println(shortAlphabet);

        System.out.println(shortAlphabet.get('A'));

    }
}
