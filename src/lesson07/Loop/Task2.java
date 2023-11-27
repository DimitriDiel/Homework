package lesson07.Loop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {

            int result = n * i;

            System.out.println(result);

        }
    }
}
