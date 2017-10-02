package hometasks.lesson6.OOP.task1;


public class Runner {
    public static void main(String[] args) {
        Point pointOne = new Point(2, 3);
        Point pointTwo = new Point(6,1);

        pointOne.distance(pointTwo);

        Rectangle rectangle= new Rectangle(pointOne, pointTwo);
        rectangle.countSquare();
        rectangle.countDiagonal();
    }
}