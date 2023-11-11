package lesson03;

public class PersonDemo {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.name = "Dmitri";
        person1.age = 40;
        person1.city = " города Bitterfeld";

        System.out.println("Меня зовут " + person1.name);
        System.out.println("Мне " + person1.age + " лет");
        System.out.println("Я из " + person1.city);
    }
}
