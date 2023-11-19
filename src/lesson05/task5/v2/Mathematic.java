package lesson05.task5.v2;

public class Mathematic {

    public void summNum(int number1, int number2) {
        int resultSumm = number1 + number2 ;
        System.out.println("Результат сложения данных чисел: " + resultSumm);

    }

    public void subNum(int number1, int number2) {
        int resultSumm = number1 - number2 ;
        System.out.println("Результат вычитания данных чисел: " + resultSumm);

    }

    public void multNum(int number1, int number2) {
        int resultSumm = number1 * number2 ;
        System.out.println("Результат умножения данных чисел: " + resultSumm);

    }

    public void divNum(int number1, int number2) {
        double resultSumm = (double) number1 / number2;
        System.out.println("Результат деления данных чисел: " + resultSumm);

    }


}
