package hometasks.lesson4.Arrays.task1;


import java.util.Arrays;
import java.util.Scanner;

public class shiftElementsToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int lastElement;
        int currentIteration = 0;

        System.out.println("Enter the number of iterations: ");
        int totalNumberOfIterations = scanner.nextInt();

        System.out.println("The initial array is:\n" + Arrays.toString(array));

        while (currentIteration < totalNumberOfIterations) {
            currentIteration++;
            lastElement = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastElement;
        }
        System.out.println("The array after shift is:\n" + Arrays.toString(array));
    }
}
