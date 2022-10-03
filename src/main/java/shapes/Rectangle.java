package shapes;

/**
 * @author Dominik_Janiga
 */
class Rectangle implements Shape {

    private final String name;
    private final int sideA;
    private final int sideB;

    Rectangle(String name, int sideA, int sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double computeArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public double computeCircuit() {
        return 2 * this.sideA + 2 * this.sideB;
    }
}
