package lesson18.animals;

public class HomeAnimalsVersion2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barbos","kolly");
        Dog dog2 = new Dog("Palkan","mastif");

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");

        Animal[] animals = {dog1, dog2, cat1, cat2};

// вывести на экран все имена собак и кошек с использованием массивов

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName());
            animals[i].voice();
        }
    }
}
