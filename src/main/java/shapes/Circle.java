package shapes;

/**
 * @author Dominik_Janiga
 */
class Circle implements Shape {

    private final int radius;

    Circle(int radius) {
        this.radius = radius;
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
