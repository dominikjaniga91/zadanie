package shapes;

import java.io.IOException;
import java.util.List;

/**
 * @author Dominik_Janiga
 */
class Main {
    public static void main(String[] args) throws IOException {

        List<String[]> shapesData = new ShapeReader().readFileContentAsList("src/main/resources/shapes.txt");
        List<Shape> shapes = ShapeFactory.createShapes(shapesData);

        printCalculatedShapes(shapes);
    }

    private static void printCalculatedShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            String shapeName = shape.getClass().getSimpleName();
            double shapeArea = shape.computeArea();
            double shapeCircuit = shape.computeCircuit();

            System.out.printf("%s has area %.2f and circuit %.2f%n", shapeName, shapeArea, shapeCircuit);
        }
    }
}
