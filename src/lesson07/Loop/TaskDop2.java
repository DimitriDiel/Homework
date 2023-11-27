package lesson07.Loop;

public class TaskDop2 {
    public static void main(String[] args) {

        double n = 1;

        boolean condition = true;

        int counter = 0;

        while (n <= 100 && counter <= 6){
            if(n % 5 == 0) {
                System.out.println(n);
                n++;
                counter++;
            }else n++;

        }

    }
}
