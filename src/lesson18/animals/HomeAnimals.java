package lesson18.animals;

public class HomeAnimals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barbos","kolly");
        Dog dog2 = new Dog("Palkan","mastif");


        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");

        Dog[] dogs = {dog1, dog2};
        Cat[] cats = {cat1, cat2};


// вывести на экран все имена собак и кошек с использованием массивов



        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName());
            dogs[i].voice();
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName());
            cats[i].voice();
            cats[i].greeting();
        }



    }
}
