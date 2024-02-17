package lesson33.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class PersonDemo {
    /*
     Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
   Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их
     */

    public static void main(String[] args) {


        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Alex",26, Arrays.asList("Java","SQL")));
        persons.add(new Person("Mark",29, Arrays.asList("Java","Spring","SQL")));
        persons.add(new Person("Oleg",20, Arrays.asList("Java","SQL")));
        persons.add(new Person("Tom",21, Arrays.asList("Java","SQL")));
        persons.add(new Person("Jeri",33, Arrays.asList("Java","HTML","SQL")));


//        List<Person> filteredPersons = persons.stream()
//                .filter(Person -> Person.getAge() >= 25)
//                .sorted(Comparator.comparing(Person :: getAge))
//                .filter(Person -> Person.getSkills().stream())
//                .toList();

 //       System.out.println(filteredPersons);


    }
}
