package hometasks.lesson6.OOP.task1;


public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public void distance (Point pointTwo) {
        int currentX = Math.abs(this.x -pointTwo.getX());
        int currentY = Math.abs(this.y - pointTwo.getY());
        System.out.println("The distance to the point: x=" + currentX + ", y=" + currentY);
    }
}