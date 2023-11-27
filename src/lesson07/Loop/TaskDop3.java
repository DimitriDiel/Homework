package lesson07.Loop;

import java.util.Objects;
import java.util.Scanner;

public class TaskDop3 {
    public static void main(String[] args) {


       String word = null;

       String hello = "Hello";

        boolean condition = true;

        while (condition){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите слово - Hello");

            word = scanner.next();

            if(word.equals(hello)) condition = false;


        }

        System.out.println("Правильный ввод");


    }
}
