package lesson05;

import java.util.Scanner;

public class Task4name {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");

        String name = input.nextLine();

        System.out.println("Hello " + name + "!");


    }
}
