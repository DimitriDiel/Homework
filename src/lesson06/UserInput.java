package lesson06;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public double userInputDouble() {
        System.out.println("Введите число");
        double input = scanner.nextDouble();
        return input;

    }




}
