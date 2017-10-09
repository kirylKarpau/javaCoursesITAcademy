package hometasks.lesson7.Inheritance.task1.triangles;


import hometasks.lesson7.Inheritance.task1.Figure;

public class EquilateralTriangle extends Figure implements Triangle {
    private int side;
    private int sideQuantity = 3;

    private static final double HEIGHT_FACTOR = Math.sqrt(3)/2;
    private static final double SQUARE_FACTOR = 0.5;

    public EquilateralTriangle(int side){
        this.side = side;
        super.setSideQuantity(sideQuantity);
    }

    @Override
    public double countSquare() {
        return side * countHeightForBase() * SQUARE_FACTOR;
    }

    @Override
    public double countHeightForBase() {
        return side * HEIGHT_FACTOR;
    }

    @Override
    public String toString() {
        return "\nEQUILATERAL TRIANGLE\n" +
                "Square: " + countSquare() +
                "\nHeight to base side: " + countHeightForBase();

    }
}
