package hometasks.lesson4.Arrays.task4;


import java.util.Arrays;

public class FromTwoToOneDimensionalArray {
    public static void main(String[] args) {
        int[][] multi = new int[3][];
        multi[0] = new int[]{1};
        multi[1] = new int[]{2, 3};
        multi[2] = new int[]{4, 5, 6};

        System.out.println("Initial array is: \n" + Arrays.deepToString(multi) + "\n");

        linearized(multi);
    }

    private static void linearized(int[][] multi) {
        int arrayLength = 0;
        int arrayElementNumber = 0;
        for (int[] element : multi) {
            arrayLength += element.length;
        }

        int[] array = new int[arrayLength];

        for (int[] elements : multi) {
            for (int element : elements) {
                array[arrayElementNumber] = element;
                arrayElementNumber++;
            }
        }

        System.out.println("Result array is: \n" + Arrays.toString(array));
    }
}