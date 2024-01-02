package lesson18.shape;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculatorArea() {
        return sideA * sideB;
    }

    @Override
    double calculatorPerimeter() {
        return 2 * (sideA + sideB);
    }
}
