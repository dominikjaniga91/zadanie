package shapes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dominik_Janiga
 */
enum ShapeFactory {

    KWADRAT(sides -> new Square("KWADRAT", sides[0])),
    KOLO(sides -> new Circle("KOLO", sides[0])),
    PROSTOKAT(sides -> new Rectangle("PROSTOKAT", sides[0], sides[1]));

    private final ShapeCreator<Integer, Shape> function;

    ShapeFactory(ShapeCreator<Integer, Shape> function) {
        this.function = function;
    }

    static List<Shape> createShapes(List<String[]> shapesWithSides) {

        List<Shape> shapes = new ArrayList<>();

        for (String[] shapeData : shapesWithSides) {
            String shapeName = shapeData[0];
            Integer[] sides = getSides(shapeData);

            Shape shape = createShape(shapeName, sides);
            shapes.add(shape);
        }

        return shapes;
    }

    private static Integer[] getSides(String... stringSides) {
        String s = Arrays.deepToString(stringSides);
        System.out.println(s);
        return Arrays.stream(stringSides)
                .skip(1)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
    }

    private static Shape createShape(String shapeName, Integer... sides) {
        ShapeFactory shapeFactory = Arrays.stream(values())
                .filter(shape -> shape.toString().equals(shapeName))
                .findFirst()
                .orElseThrow(() -> new InvalidShapeException("Shape does not exist"));
        return shapeFactory.function.createShape(sides);
    }

    private interface ShapeCreator<T,V> {
        V createShape(T... t);
    }
}
