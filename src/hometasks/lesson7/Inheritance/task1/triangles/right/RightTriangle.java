package hometasks.lesson7.Inheritance.task1.triangles.right;


public class RightTriangle extends RightIsoscelesTriangle {
    private int adjacentSide;
    private int sideQuantity = 3;

    private static final double SQUARE_FACTOR = 0.5;

    public RightTriangle(int side, int adjacentSide) {
        super(side);
        super.setSideQuantity(sideQuantity);
        this.adjacentSide = adjacentSide;
    }

    @Override
    public double countSquare() {
        return SQUARE_FACTOR * adjacentSide * getSide();
    }

    @Override
    public double countHeightForBase() {
        return adjacentSide * getSide() / countHypotenuse();
    }

    @Override
    public double countHypotenuse() {
        return Math.sqrt(Math.pow(adjacentSide, 2) + Math.pow(getSide(), 2));
    }

    @Override
    public String toString() {
        return "\nRIGHT TRIANGLE\n" +
                "Square: " + countSquare() +
                "\nHypotenuse: " + countHypotenuse() +
                "\nHeight to the base side: " + countHeightForBase();
    }
}
