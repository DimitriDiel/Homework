package lesson06;

public class Task3 {
    public static void main(String[] args) {

        double n = Math.random() * (28800 - 0 + 1);

        System.out.println("До конца раб. дня осталось: " + Math.round(n) + " сек.");

        double hours = n / 60 / 60;

        if(hours == 0) {
            System.out.println("Рабочий день закончился");
            } else if (hours < 1){
            System.out.println("До конца раб. дня осталось менее часа");
                }else if (hours < 2){
                System.out.println("До конца раб. дня осталcя 1 час");
                    }else if (hours < 3){
                    System.out.println("До конца раб. дня осталось 2 часа");
                        }else if (hours < 4){
                        System.out.println("До конца раб. дня осталось 3 часа");
                            }else if (hours < 5) {
                            System.out.println("До конца раб. дня осталось 4 часа");
                                }else if (hours < 6) {
                                System.out.println("До конца раб. дня осталось 5 часов");
                                    }else if (hours < 7) {
                                    System.out.println("До конца раб. дня осталось 6 часов");
                                        }else if (hours < 8) {
                                        System.out.println("До конца раб. дня осталось 7 часов");
                                            }else  {
                                            System.out.println("До конца раб. дня осталось 8 часов");
        }
    }
}
