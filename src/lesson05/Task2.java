package lesson05;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое слово: ");

        String word1 = input.nextLine();

        int word1length = word1.length();

        int word1half = word1length / 2;

        String word1result = word1.substring(0,word1half);

        System.out.println("Введите второе слово: ");

        String word2 = input.nextLine();

        int word2length = word2.length();

        double word2half = Math.ceil((double) word2length / 2);

        String word2result = word2.substring((int) word2half);

        System.out.println("Получилось слово: " + word1result.concat(word2result));



    }
}
