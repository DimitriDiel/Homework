package lesson07.prog;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите число");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double exponent = Math.pow(n,n);

        System.out.println("Результат возведения " + n + " в степень " + n + " будет равен: " + exponent);

        double result = 0;

        for (int i = 1; i <= n; i++){
            result = result + i;
        }

        double average = result / n;

        System.out.println("Среднее арифметическое последовательности из n чисел равно " + average);

    }
}
