package hometasks.lesson6.OOP.task1;


public class Rectangle {
    private Point pointLeftTop;
    private Point pointRightBottom;

    public Rectangle(Point pointLeftTop, Point pointRightBottom){
        this.pointLeftTop = pointLeftTop;
        this.pointRightBottom = pointRightBottom;
    }

    private int countLength(){
        return Math.abs(pointLeftTop.getX() - pointRightBottom.getX());
    }

    private int countWidth(){
        return Math.abs(pointLeftTop.getY() - pointRightBottom.getY());
    }

    public void countSquare(){
        System.out.println("Rectangle square is:" + countWidth() * countLength());
    }

    public void countDiagonal (){
        System.out.println("Rectangle diagonal is: " + Math.sqrt(countLength()*countLength() + countWidth() * countWidth()));
    }
}
