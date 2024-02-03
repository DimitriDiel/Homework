package lesson32.task1;

import java.util.function.Function;

public class MyUpperCaseDemo {
    public static void main(String[] args) {

        MyUpperCase myUpperCase = new MyUpperCase() {
            @Override
            public String upperCase(String string) {
                String resultString = string.toUpperCase();

                return resultString;
            }
        };

        Function<String,String> function = newString -> newString.toUpperCase();

        String newString = "hello java";

        String afterUpperCase =  myUpperCase.upperCase(newString);

        System.out.println(afterUpperCase);
        System.out.println();
        System.out.println(function.apply(newString));



    }


}
