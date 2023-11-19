package lesson05.task5.v2;

public class MathDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        Mathematic mathematic = new Mathematic();

        System.out.println("Please enter first number: ");
        int number1 = ui.userInputInt();
        System.out.println("Please enter second number: ");
        int number2 = ui.userInputInt();

        mathematic.summNum(number1,number2);
        mathematic.subNum(number1,number2);
        mathematic.multNum(number1,number2);
        mathematic.divNum(number1,number2);

    }
}
