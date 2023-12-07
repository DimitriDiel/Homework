package lesson13.setStore;


public class SetToolsShop {

    public static void main(String[] args) {

        SetTools setTool1 = new SetTools();

        SetTools setTool2 = new SetTools();

        SetTools setTool3 = new SetTools();

        SetArray setArray = new SetArray();

        System.out.println("Заполните первый набор инструментов ");

        UserInput userInput1 = new UserInput();

        userInput1.inputTools();

        setTool1.tools[0] = userInput1.tool1;

        setTool1.tools[1] = userInput1.tool2;

        System.out.println("Заполните второй набор инструментов ");

        UserInput userInput2 = new UserInput();

        userInput2.inputTools();

        setTool2.tools[0] = userInput2.tool1;

        setTool2.tools[1] = userInput2.tool2;

        System.out.println("Заполните третий набор инструментов ");

        UserInput userInput3 = new UserInput();

        userInput3.inputTools();

        setTool3.tools[0] = userInput3.tool1;

        setTool3.tools[1] = userInput3.tool2;

        setArray.setTools[0] = setTool1;

        setArray.setTools[1] = setTool2;

        setArray.setTools[2] = setTool3;


        System.out.println("Набор 1. " + "Состав: " + setArray.setTools[0]);

        System.out.println("Набор 2. " + "Состав: " + setArray.setTools[1]);

        System.out.println("Набор 3. " + "Состав: " + setArray.setTools[2]);


    }


}
