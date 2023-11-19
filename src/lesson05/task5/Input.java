package lesson05.task5;

import java.util.Scanner;

public class Input {

    public int number1;

    public int number2;


    public void inputNum() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter  first integer number: ");

        number1 = input.nextInt();

        System.out.println("Please enter  second integer number: ");

        number2 = input.nextInt();

    }



    public void summNum() {
        int resultSumm = number1 + number2 ;
        System.out.println("Результат сложения данных чисел: " + resultSumm);

    }

    public void subNum() {
        int resultSumm = number1 - number2 ;
        System.out.println("Результат вычитания данных чисел: " + resultSumm);

    }

    public void multNum() {
        int resultSumm = number1 * number2 ;
        System.out.println("Результат умножения данных чисел: " + resultSumm);

    }

    public void divNum() {
        double resultSumm = (double) number1 / number2;
        System.out.println("Результат деления данных чисел: " + resultSumm);

    }


}



