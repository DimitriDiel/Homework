package lesson34.person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class PersonMaxAgeDemo {
    public static void main(String[] args) {

    /*
    найти сотрудника у кого самый большой возраст
     */
        Person person1 = new Person("Petr", 28);
        Person person2 = new Person("Ruslan", 32);
        Person person3 = new Person("Victor", 29);
        Person person4 = new Person("Mike", 48);
        Person person5 = new Person("Vadim", 38);

        List<Person> users = Arrays.asList(person1, person2, person3, person4, person5);

    //    List<String> alterAge = users.stream()
     //           .map(person -> person.getAge())
     //           .sorted(Comparator.comparingInt(())
    }
}
