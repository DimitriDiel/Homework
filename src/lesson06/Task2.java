package lesson06;

public class Task2 {

    public static void main(String[] args) {


        UserInput ui = new UserInput();

        System.out.println("Введите температуру первой колбы: ");

        double Temperature1 = ui.userInputDouble();

        System.out.println("Введите температуру второй колбы: ");

        double Temperature2 = ui.userInputDouble();

        if(Temperature1 > 100 && Temperature2 < 100){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }
}
