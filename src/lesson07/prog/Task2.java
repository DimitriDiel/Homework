package lesson07.prog;

public class Task2 {
    public static void main(String[] args) {

        double random1 =  Math.random() * (10 + 10 + 1) - 10;

        int x = (int) random1;

        System.out.println("Число x = " + x);

        double random2 = Math.random() * (10 + 10 + 1) - 10;

        int y = (int) random2;

        System.out.println("Число y = " + y);

        if (x >= 0 && y >= 0){
            System.out.println("Точка находится в первой четверти");
        }else if (x < 0 && y >= 0){
            System.out.println("Точка находится во второй четверти");
        }else if (x < 0 && y < 0){
            System.out.println("Точка находится в третьей четверти");
        }else {
            System.out.println("Точка находится в четвертой четверти");
        }
    }
}
