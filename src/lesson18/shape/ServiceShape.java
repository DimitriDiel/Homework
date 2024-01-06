package lesson18.shape;

public class ServiceShape {

    Shape [] shapes;

    public Shape [] newShapeArray () {
        return shapes = new Shape[(int) (Math.random() * (20 - 10 + 1) + 10)];
    }

    public void fillShapes (Shape[] shapes){

        for (int i = 0; i < shapes.length; i++) {

            if ((int) (Math.random() * (4 - 1 + 1) + 1) == 1){
                shapes[i] = new Circle("circle" + i, (int) (Math.random() * (15 - 5 + 1)) + 5);
            }
            else if ((int) (Math.random() * (4 - 1 + 1) + 1) == 2){
                shapes[i] = new Rectangle("rectangle" + i, (int) (Math.random() * (15 - 5 + 1)) + 5, (int) (Math.random() * (15 - 5 + 1)) + 5);
            }
            else if ((int) (Math.random() * (4 - 1 + 1) + 1) == 3){
                shapes[i] = new Square("square" + i, (int) (Math.random() * (15 - 5 + 1)) + 5);
            }
            else {shapes[i] = new Triangle("triangle" + i, (int) (Math.random() * (15 - 5 + 1)) + 5, (int) (Math.random() * (15 - 5 + 1)) + 5, (int) (Math.random() * (15 - 5 + 1)) + 5);
            }
        }
    }
}
