package hometasks.lesson7.Inheritance.task1.triangles;

import hometasks.lesson7.Inheritance.task1.Figure;

public class IsoscelesTriangle extends Figure implements Triangle {
    private int isoscelesSide;
    private int base;
    private int sideQuantity = 3;

    private static final double SQUARE_FACTOR = 0.5;
    private static final double HEIGHT_FACTOR = 4;


    public IsoscelesTriangle(int isoscelesSide, int base) {
        this.isoscelesSide = isoscelesSide;
        this.base = base;
        super.setSideQuantity(sideQuantity);
    }

    @Override
    public double countSquare() {
        return SQUARE_FACTOR * base * countHeightForBase();
    }

    @Override
    public double countHeightForBase() {
        return Math.sqrt(Math.pow(isoscelesSide, 2) - Math.pow(base, 2) / HEIGHT_FACTOR);
    }

    @Override
    public String toString() {
        return "\nISOSCELES TRIANGLE\n" +
                "Square: " + countSquare() +
                "\nHeightToBaseSide: " + countHeightForBase();

    }
}
