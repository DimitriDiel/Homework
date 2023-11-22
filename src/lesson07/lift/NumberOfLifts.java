package lesson07.lift;

public class NumberOfLifts {

    public void numberOfLifts(int floor, int stepUp, int stepDown){

        int lift = 0;


        boolean condition = true;

        int counter = 0;

        while (condition){
            lift = lift + stepUp - stepDown;

            counter++;

            if (lift > floor) condition = false;

        }
        System.out.println("NumberOfLifts = " + counter);


    }
}
