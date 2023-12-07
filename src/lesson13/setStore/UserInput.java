package lesson13.setStore;

import lesson05.task5.Input;

import java.util.Scanner;

public class UserInput {

    public String tool1;

    public String tool2;


    public void inputTools() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter  first tool name: ");

        tool1 = scanner.next();

        System.out.println("Please enter  second tool name: ");

        tool2 = scanner.next();
    }


}
