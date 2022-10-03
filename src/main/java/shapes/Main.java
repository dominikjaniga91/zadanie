package shapes;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dominik_Janiga
 */
class Main {
    public static void main(String[] args) throws IOException {

        List<String[]> shapesData = new ShapeReader().readFileContentAsList("src/main/resources/shapes.txt");
        List<Shape> shapes = ShapeFactory.createShapes(shapesData);

        countNumberOfShapes(shapes);
        computeCalculatedShapes(shapes);
    }

    private static void computeCalculatedShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            String name = shape.getName();
            double area = shape.computeArea();
            double circuit = shape.computeCircuit();

            System.out.printf("%s has area %.2f and circuit %.2f%n", name, area, circuit);
        }
    }

    private static void countNumberOfShapes(List<Shape> shapes) {

        Map<String, Long> shapesOccurrence = shapes.stream()
                .collect(Collectors.groupingBy(
                        Shape::getName,
                        Collectors.counting()));
        System.out.println(shapesOccurrence);
    }
}
