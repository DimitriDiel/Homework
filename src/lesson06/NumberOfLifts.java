package lesson06;

public class NumberOfLifts {

    public void numberOfLifts(int floor, int stepUp, int stepDown){
        int lift1 = stepUp + stepDown;
        int lift2 = lift1 + stepUp - stepDown;
        int lift3 = lift2 + stepUp - stepDown;
        int lift4 = lift3 + stepUp - stepDown;
        int lift5 = lift4 + stepUp - stepDown;

        if (lift1 > floor) {
            System.out.println("Один подьём");
        }else if (lift2 > floor){
            System.out.println("Два подьёма");
        }else if (lift3 > floor) {
            System.out.println("Три подьёма");
        }else if (lift4 > floor) {
            System.out.println("Четыре подьёма");
        }else if (lift5 > floor) {
                System.out.println("Пять подьёмов");
            }
    }
}
