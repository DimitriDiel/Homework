package lesson18.shape;

public class Square extends Shape{

    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    double calculatorArea() {
        return sideA * sideA;
    }

    @Override
    double calculatorPerimeter() {
        return 4 * sideA;
    }
}
