package hometasks.lesson7.Inheritance.task1;


import hometasks.lesson7.Inheritance.task1.tetragon.Rectangle;
import hometasks.lesson7.Inheritance.task1.tetragon.Square;
import hometasks.lesson7.Inheritance.task1.triangles.EquilateralTriangle;
import hometasks.lesson7.Inheritance.task1.triangles.IsoscelesTriangle;
import hometasks.lesson7.Inheritance.task1.triangles.OrdinaryTriangle;
import hometasks.lesson7.Inheritance.task1.triangles.right.RightIsoscelesTriangle;
import hometasks.lesson7.Inheritance.task1.triangles.right.RightTriangle;

import static hometasks.lesson7.Inheritance.task1.ShapeUtils.isFigureRectangle;
import static hometasks.lesson7.Inheritance.task1.ShapeUtils.isFigureTriangle;

public class BuildFigures {
    public static void main(String[] args) {
        Figure ordinaryTriangle = new OrdinaryTriangle(3, 5, 8);
        System.out.println(ordinaryTriangle);

        Figure isoscelesTriangle = new IsoscelesTriangle(4, 7);
        System.out.println(isoscelesTriangle);

        Figure equilateralTriangle = new EquilateralTriangle(5);
        System.out.println(equilateralTriangle);

        Figure rightIsoscelesTriangle = new RightIsoscelesTriangle(10);
        System.out.println(rightIsoscelesTriangle);

        Figure rightTriangle = new RightTriangle(3, 4);
        System.out.println(rightTriangle);

        System.out.println("Result of square comparation 'ordinary triangle' and 'isosceles triangle': " + ordinaryTriangle.compareFigureSquares(isoscelesTriangle));

        Figure square = new Square(5);
        System.out.println(square);

        System.out.println("Result of square comparation 'square' and 'equilateral triangle': " + square.compareFigureSquares(equilateralTriangle));

        Figure rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);

        System.out.println("Square " + checkIfFigureTriangle(square));
        System.out.println("Square " + checkIfFigureRectangle(square));
    }

    private static String checkIfFigureTriangle(Figure figure) {
        return isFigureTriangle(figure) ? " is triangle" : " is not triangle";
    }

    private static String checkIfFigureRectangle(Figure figure) {
        return isFigureRectangle(figure) ? " is rectangle" : " is not rectangle";
    }
}

