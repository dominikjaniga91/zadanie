package shapes;

/**
 * @author Dominik_Janiga
 */
class Square implements Shape {

    private int side;

    Square(int side) {
        this.side = side;
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
