package lesson26.bracket;

import java.util.Stack;

public class Brackets {

    public boolean isValid(String text){
        Stack<Character> stack = new Stack<>();
        char bracket;
        for (int i = 0; i < text.length(); i++) {
            bracket = text.charAt(i);
            if (bracket == '(' || bracket == '[' || bracket == '{'){
                stack.push(bracket);
            }
            if (bracket == ')' || bracket == ']' || bracket == '}'){
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((bracket == ')' && top == '(') || (bracket == ']' && top == '[') || (bracket == '}' && top == '{')){
                    stack.pop();
                } else return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String text1 = "()";
        String text2 = "([{}])";
        String text3 = "()()()";
        String text4 = "({[]])";
        String text5 = ")([{({[{{[[(( ))]]}}]}])";


        Brackets brackets = new Brackets();

        System.out.println(brackets.isValid(text1));
        System.out.println(brackets.isValid(text2));
        System.out.println(brackets.isValid(text3));
        System.out.println(brackets.isValid(text4));
        System.out.println(brackets.isValid(text5));

    }
}
