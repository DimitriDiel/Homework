package lesson03;

public class AverageDemo {

    public static void main(String[] args) {
        Average avr = new Average();

        int result = avr.avr(0,1,2,3,4,5,6,7,8,9);

        System.out.println("Среднее значение: " + result);

        int resultRem = avr.rem(0,1,2,3,4,5,6,7,8,9);

        System.out.println("Остаток: " + resultRem);


    }
}
