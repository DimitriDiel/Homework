package lesson07.prog;

public class Task3 {
    public static void main(String[] args) {

        double random = Math.random()  * (10 - 1 + 1) + 1;

        int n = (int) random;

        System.out.println("Число: " + n);

        if (n == 1){
            System.out.println("На лугу пасется " + n + " корова");
        }else if (n > 1 && n <= 4){
            System.out.println("На лугу пасется " + n + " коровы");
        }else {
            System.out.println("На лугу пасется " + n + " коров");
        }
    }
}
