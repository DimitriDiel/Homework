package Consultation.cons24_2.service;

import java.util.Scanner;

public class InputMessage {

    private String textForCoding;

    public void userInput (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        textForCoding = scanner.next();
    }

    public String getTextForCoding() {
        return textForCoding;
    }
}
