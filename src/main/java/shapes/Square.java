package shapes;

/**
 * @author Dominik_Janiga
 */
class Square implements Shape {

    private final int side;
    private final String name;

    Square(String name, int side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double computeArea() {
        return this.side * this.side;
    }

    @Override
    public double computeCircuit() {
        return 4 * this.side;
    }
}
