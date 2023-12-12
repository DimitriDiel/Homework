package lesson15.task3;

import java.util.Scanner;

public class NumberOfWordDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова через пробел");

        String text = scanner.nextLine();

        NumberWords numberWords = new NumberWords();

        numberWords.counterWord(text);

        System.out.println("Кол-во слов = " + numberWords.getNumOfWord());

    }
}
