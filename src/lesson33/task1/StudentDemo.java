package lesson33.task1;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

    //Фильтрация списка студентов по возрасту и со средним баллом больше 4.5
    // studentAndBook.Student { String name; int age; double avgGrade; }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Pablo",19,4.6));
        students.add(new Student("Paul",20,4.2));
        students.add(new Student("Olga",18,5));
        students.add(new Student("Alex",21,4));
        students.add(new Student("Sonya",19,4.5));

        CompareAge compareAge = new CompareAge();


        List<Student> studentResult = students.stream()
                .sorted(compareAge)
                .filter(student -> student.getAvgGrade() > 4.5)
                .toList();

        System.out.println(studentResult);
    }
}
