package hometasks.lesson7.Inheritance.task1.tetragon;

import hometasks.lesson7.Inheritance.task1.Figure;

public class Rectangle extends Figure implements Tetragon {
    private int firstSide;
    private int secondSide;
    private int sideQuantity = 4;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.setSideQuantity(sideQuantity);
    }

    @Override
    public double countSquare() {
        return firstSide * secondSide;
    }

    public double countDiagonal() {
        return Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
    }

    @Override
    public String toString() {
        return "\nRECTANGLE \n" +
                "Square: " + countSquare() +
                "\nDiagonal: " + countDiagonal();
    }
}
