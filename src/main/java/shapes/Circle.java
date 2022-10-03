package shapes;

/**
 * @author Dominik_Janiga
 */
class Circle implements Shape {

    private final String name;
    private final int radius;

    Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double computeArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double computeCircuit() {
        return Math.round(2 * Math.PI * this.radius);
    }
}
