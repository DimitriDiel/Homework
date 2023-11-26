package lesson07.Loop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите число");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            int result = (int) Math.pow(i , 3);

            System.out.println(i + " в кубе = " + result);

        }

    }
}
