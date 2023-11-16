package lesson05;

public class Task3 {
    public static void main(String[] args) {

    // Площадь круга вычисляется по формуле: S = π × d2 : 4
    // пицца d = 24 см, 28 см
    // 1 кв см = 40 калл.

    double diameterPizza1 = 24;
    double diameterPizza2 = 28;
    double calories = 40;

    double squarePizza1 = Math.PI * Math.pow(diameterPizza1,2) / 4;

        System.out.println(squarePizza1);

    double squarePizza2 = Math.PI * Math.pow(diameterPizza2,2) / 4;

        System.out.println(squarePizza2);

    double sumCalories1 = squarePizza1 * calories;

        System.out.println(sumCalories1);

    double sumCalories2 = squarePizza2 * calories;

        System.out.println(sumCalories2);

    double result = sumCalories2 - sumCalories1;

    System.out.println("Купив пиццу диаметром " + diameterPizza2 + " см. вместо пиццы диаметром "
            + diameterPizza1 + " см. Вы получите на " + result + " каллорий больше");



    }

}
