package hometasks.lesson7.Inheritance.task1.tetragon;

import hometasks.lesson7.Inheritance.task1.Figure;

public class Square extends Figure implements Tetragon {
    private int side;
    private int sideQuantity = 4;

    private static final double SQUARE_FACTOR = Math.sqrt(2);

    public Square(int side) {
        this.side = side;
        super.setSideQuantity(sideQuantity);
    }

    @Override
    public double countSquare() {
        return side * side;
    }

    @Override
    public double countDiagonal() {
        return countSquare() * SQUARE_FACTOR;
    }

    public double countPerimeter() {
        return side * getSideQuantity();
    }

    @Override
    public String toString() {
        return "\nSQUARE\n" +
                "Square: " + countSquare() +
                "\nPerimeter: " + countPerimeter() +
                "\nDiagonal: " + countDiagonal();
    }
}
