package lesson07.Loop;

import java.util.Scanner;

public class TaskDop4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

         String numberStr = scanner.next();

         int sum = 0;

         int n = 0;

        for ( ; n > 0; n /= 10) {
            sum += n % 10;
        }
        System.out.println("Результат сложения цифр числа = " + sum);

    }
}
