package lesson30.addHomeTask.generics.addTask1;

public class BoxDemo {

    public static void main(String[] args) {

        Box<String> boxString = new Box<>();

        Box<Integer> boxInteger = new Box<>();

        String myString = "String text";

        Integer myInteger = 5;

        boxString.putItem(myString);

        boxInteger.putItem(myInteger);


        System.out.println(boxString + " " +  boxInteger);


    }
}
