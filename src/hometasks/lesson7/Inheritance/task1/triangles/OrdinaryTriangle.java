package hometasks.lesson7.Inheritance.task1.triangles;

import hometasks.lesson7.Inheritance.task1.Figure;

public class OrdinaryTriangle extends Figure implements Triangle {
    private int a;
    private int b;
    private int base;
    private int sideQuantity = 3;

    private static final double SQUARE_FACTOR = 0.5;
    private static final double HEIGHT_FACTOR = 2;

    public OrdinaryTriangle(int a, int b, int base) {
        this.a = a;
        this.b = b;
        this.base = base;
        super.setSideQuantity(sideQuantity);
    }

    @Override
    public double countSquare() {
        return (a + b + base) * SQUARE_FACTOR;
    }

    @Override
    public double countHeightForBase() {
        return HEIGHT_FACTOR * countSquare() / base;
    }

    public double countHeightForASide() {
        return HEIGHT_FACTOR * countSquare() / a;
    }

    public double countHeightForBSide() {
        return HEIGHT_FACTOR * countSquare() / b;
    }

    @Override
    public String toString() {
        return "\nORDINARY TRIANGLE \n" +
                "Square: " + countSquare() +
                "\nHeight to base side: " + countHeightForBase() +
                "\nHeight to A side: " + countHeightForASide() +
                "\nHeight to B side: " + countHeightForBSide();


    }
}
