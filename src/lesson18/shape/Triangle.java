package lesson18.shape;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculatorArea() {
        double pp = (sideA + sideB + sideC) / 2;
        return Math.sqrt(pp * (pp - sideA) * (pp - sideB) * (pp - sideC));
    }

    @Override
    double calculatorPerimeter() {
        return sideA + sideB + sideC;
    }
}
