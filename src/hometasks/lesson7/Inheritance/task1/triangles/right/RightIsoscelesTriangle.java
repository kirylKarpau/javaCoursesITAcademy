package hometasks.lesson7.Inheritance.task1.triangles.right;


import hometasks.lesson7.Inheritance.task1.Figure;
import hometasks.lesson7.Inheritance.task1.triangles.Triangle;

public class RightIsoscelesTriangle extends Figure implements Triangle {
    private int side;
    private int sideQuantity = 3;

    private static final double SQUARE_FACTOR = 0.5;

    public RightIsoscelesTriangle(int side){
        this.side = side;
        super.setSideQuantity(sideQuantity);
    }

    public int getSide() {
        return side;
    }

    @Override
    public double countSquare() {
        return SQUARE_FACTOR * Math.pow(side, 2);
    }

    @Override
    public double countHeightForBase() {
        return Math.pow(side, 2) / countHypotenuse();
    }

    public double countHypotenuse(){
        return Math.sqrt(Math.pow(side, 2) + Math.pow(side, 2));
    }

    @Override
    public String toString() {
        return "\nRIGHT ISOSCELES TRIANGLE\n" +
                "Square: " + countSquare() +
                "\nHypotenuse: " + countHypotenuse() +
                "\nHeight to base side: " + countHeightForBase();
    }
}
