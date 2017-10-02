package hometasks.lesson2.task2;


import java.util.Scanner;

public class HousesBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write next 6 values(a,b,c,d,e,f) via space and press Enter");
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = scanner.nextInt();
        }

        int a = array[0];
        int b = array[1];
        int c = array[2];
        int d = array[3];
        int e = array[4];
        int f = array[5];

        if (a < 1 || b < 1 || c < 1 || d < 1 || e < 1 || f < 1) {
            System.out.println("Incorrect value was entered");
        } else if ((isLess(a, b, e) && isLess(b, d, f))
                || (isLess(a, c, f) && isLess(b, d, e))
                || (isLess(a, d, e) && isLess(b, c, f))
                || (isLess(a, d, f) && isLess(b, c, e))) {
            System.out.println("Two houses can be build on the plot");

        } else {
            System.out.println("Houses cannot be built on the plot");
        }
    }

    private static boolean isLess(int firstHouseSize, int secondHouseSize, int plotSize) {
        return firstHouseSize + secondHouseSize <= plotSize;
    }

}