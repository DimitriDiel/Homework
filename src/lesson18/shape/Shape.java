package lesson18.shape;

abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    abstract double calculatorArea();

    abstract double calculatorPerimeter();

}
