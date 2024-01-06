package lesson18.shape;

import java.util.Arrays;

public class ShapeDemo {
    public static void main(String[] args) {

        ServiceShape serviceShape = new ServiceShape();

        System.out.println(Arrays.toString(serviceShape.newShapeArray()));

        serviceShape.fillShapes(serviceShape.shapes);


        for (int i = 0; i < serviceShape.shapes.length; i++) {
            System.out.println(serviceShape.shapes[i]);
            System.out.println("Площадь фигуры = " + serviceShape.shapes[i].calculatorArea());
            System.out.println("Периметр фигуры = " + serviceShape.shapes[i].calculatorPerimeter());
            System.out.println();

        }

        double allAreas = 0;

        for (int i = 0; i < serviceShape.shapes.length; i++) {
            allAreas = allAreas + serviceShape.shapes[i].calculatorArea();
        }

        System.out.println("Сумма площадей всех фигур = " + allAreas);

    }
}
