package lesson24.practice;

import java.util.HashMap;
import java.util.HashSet;

public class Company {
    public static void main(String[] args) {

        HashMap<Integer, Person> companyMap = new HashMap<>();

        Person person1 = new Person("Ivanov");
        Person person2 = new Person("Petrov");
        Person person3 = new Person("Sidorov");

        companyMap.put(1,person1);
        companyMap.put(2,person2);
        companyMap.put(3,person3);

        System.out.println(companyMap);


        HashSet<Department> departments = new HashSet<>();

        Department department1 = new Department("Buch");
        Department department2 = new Department("Logistik");

        departments.add(department1);
        departments.add(department2);

        System.out.println(departments);

        HashMap<Person,Department> companyDepartment = new HashMap<>();

        companyDepartment.put(companyMap.get(1),department1);
        companyDepartment.put(companyMap.get(2),department1);
        companyDepartment.put(companyMap.get(3),department2);

        System.out.println(companyDepartment);


    }
}
