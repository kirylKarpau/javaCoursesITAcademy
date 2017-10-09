package hometasks.lesson7.Inheritance.task1;


public class ShapeUtils {

    public static boolean isFigureTriangle(Figure figure) {
        return figure.getSideQuantity() == 3;
    }

    public static boolean isFigureRectangle(Figure figure) {
        return figure.getSideQuantity() == 4;
    }
}
