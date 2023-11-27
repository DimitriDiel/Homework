package lesson07.Loop;

public class TaskDop1 {
    public static void main(String[] args) {

        double n = 1;

        do {
            if(n % 5 == 0) {
                System.out.println(n);
                n++;
            }else n++;

        }while (n <= 100);
    }


}
