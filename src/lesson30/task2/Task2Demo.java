package lesson30.task2;

public class Task2Demo {
    public static void main(String[] args) {

        Task2 task2 = new Task2();

        String text = "Hello World! I love Java! I love World!  Hello Java!";

        System.out.println(task2.uniqueWordCount(text));

        System.out.println(task2.findLengthStringMor5(task2.getUniqueWord()));

    }
}
