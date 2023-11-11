package lesson03;

public class TemperaturDemo {

    public static void main(String[] args) {

        Temperature tempAvr = new Temperature();

        double result = tempAvr.sum(14,12,11,12,11,7,8);
        double resultAvr = result / 7;

        System.out.println("Средняя температура за прошлую неделю в городе Биттерфельд составляла: " + resultAvr);

    }
}
