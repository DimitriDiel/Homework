package lesson24.listStudent;

import java.util.ArrayList;

public class ArrayListStudents {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Ruslan");
        students.add("Valerii");
        students.add("Viktoria");
        students.add("Konstantin");
        students.add("Olga");

        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.print(students.get(i) + ", ");
        }

        System.out.println();

        students.remove(3);

        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.print(students.get(i) + ", ");
        }

    }
}
