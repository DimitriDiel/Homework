package lesson30.homework.task6;

import java.util.ArrayList;
import java.util.Collections;

public class PersonDemo {

    public static void main(String[] args) {


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan",24));
        persons.add(new Person("Sona",20));
        persons.add(new Person("Petr",18));
        persons.add(new Person("Klaus",36));

        Collections.sort(persons);

        for (Person person : persons){
            System.out.println("Name: " + person.getName() + ", возраст:" + person.getAge());


        }

    }

}
