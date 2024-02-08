package lesson33.task4And5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterAndSort {
    public static void main(String[] args) {

        List<Student4> student4s = new ArrayList<>();

        student4s.add(new Student4("Pablo",5,20015));
        student4s.add(new Student4("Paul",4,2020));
        student4s.add(new Student4("Olga",3,2008));
        student4s.add(new Student4("Alex",4,2015));
        student4s.add(new Student4("Sonya",5,2020));

        Comparator<Student4> gradeComparator = new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                return Double.compare(o2.getAvgGrade(), o1.getAvgGrade());
            }
        };
        Comparator<Student4> yearOfEnteringComparator = new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                return Integer.compare(o1.getYearOfEntering(), o2.getYearOfEntering());
            }
        };

        List<Student4> listResult = student4s.stream()
                .sorted(gradeComparator)
                .limit(3)
                .sorted(yearOfEnteringComparator)
                .toList();

        System.out.println(listResult);

        Map<Integer,List<Student4>> grup = student4s.stream()
                .collect(Collectors.groupingBy(Student4::getYearOfEntering));

        System.out.println(grup);



    }
}
