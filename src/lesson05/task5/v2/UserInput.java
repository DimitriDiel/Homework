package lesson05.task5.v2;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);
    public int userInputInt(){
        int input = scanner.nextInt();
        return input;
    }
}
