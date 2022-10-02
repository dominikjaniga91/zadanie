package shapes;

/**
 * @author Dominik_Janiga
 */
class Rectangle implements Shape {

    private final int sideA;
    private final int sideB;

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
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
