package hometasks.lesson7.Inheritance.task1;


public abstract class Figure {
    private int sideQuantity;

    public abstract double countSquare();

    public int getSideQuantity() {
        return sideQuantity;
    }

    public void setSideQuantity(int sideQuantity) {
        this.sideQuantity = sideQuantity;
    }

    public String compareFigureSquares(Figure figure) {
        return figure.countSquare() == countSquare() ? "Squares are equal" : "Squares are not equal";

    }
}
