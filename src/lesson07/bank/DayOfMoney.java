package lesson07.bank;

import lesson06.UserInput;

public class DayOfMoney {

    public void MoneyFlow() {

        UserInput ui = new UserInput();

        double n = ui.userInputDouble();

        boolean condition = true;

        int counter = 0;


        while (condition) {

            if(n > 0){
                if ((n % 2) == 0 && n != 1) {
                double div2 = n / 2;
                n = n - div2;

                }else if ((n % 3) == 0 && n != 1){
                double div3 = n / 3;
                n = n - div3;

                }else if ((n % 5) == 0 && n != 1){
                double div5 = n / 5;
                n = n - div5;

                }else if ((n % 7) == 0 && n != 1){
                double div7 = n / 7;
                n = n - div7;

                }else {
                n = n - 1;
                }
            }
            else {
                condition = false;
            }
            counter++;

        }
        System.out.println("Количество дней: " + counter);

    }
}