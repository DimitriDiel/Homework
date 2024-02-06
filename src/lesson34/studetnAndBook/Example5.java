package lesson34.studetnAndBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example5 {
    /*
Студент записывает книги которые прочитал,
задача вывести все прочитанные книги у всех студентов
(в качестве дополнения, применить фильтр на тему: найти книги которые не содержат HTML)
 */

    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        student1.addBook("Java 8 vs Java 21");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);


        List<String> studentList = students.stream()
                .flatMap(student -> student.getBook().stream())
                .toList();


        System.out.println(studentList);

        Set<String> booksNoHTML = studentList.stream()
                .filter(books -> !books.contains("HTML"))
                .collect(Collectors.toSet());


        System.out.println(booksNoHTML);

    }
}
