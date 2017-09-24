package hometasks.lesson2.task3;


import java.util.Scanner;

public class RootsOfEquation {
    public static void main(String[] args) {

        int discriminantSign = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value: ");
        double a = scanner.nextDouble();

        System.out.println("Enter second value: ");
        double b = scanner.nextDouble();

        System.out.println("Enter third value: ");
        double c = scanner.nextDouble();


        if (isZero(a, b, c)) {
            double x = countRoot(a, b, c, discriminantSign);
            System.out.println("There is only one root\n x = " + x);
        } else if (isPositive(a, b, c)) {
            double x1 = countRoot(a, b, c, -discriminantSign);
            double x2 = countRoot(a, b, c, discriminantSign);
            System.out.printf("There are two roots\n x1 = %f\n x2 = %f", x1, x2);
        } else {

            System.out.println("There are no real roots");

        }
    }

    public static boolean isZero(double a, double b, double c) {
        return countDiscriminant(a, b, c) == 0;

    }

    public static double countDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;

    }

    public static double countRoot(double a, double b, double c, int descriminantSign) {
        return (-1 * b + descriminantSign * Math.sqrt(countDiscriminant(a, b, c))) / (2 * a);

    }

    public static boolean isPositive(double a, double b, double c) {
        return countDiscriminant(a, b, c) > 0;

    }

}



