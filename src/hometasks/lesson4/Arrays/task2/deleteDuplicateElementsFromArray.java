package hometasks.lesson4.Arrays.task2;


import java.util.Arrays;

public class deleteDuplicateElementsFromArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 2, 2, 20, 50, 4, 2, 3, 3, 3, 234, 4, 4, 4, 5, 5, 5, 5, 5, 20, 30, 50, 234, 45, 2};
        System.out.println("Initial array is: \n" + Arrays.toString(array) + "\n");
        int temp;
        int countDuplicateElements = 0;

        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (temp == array[j]) {
                    countDuplicateElements++;
                    break;
                }
            }
        }

        int[] arrayOfUniquesElements = new int[array.length - countDuplicateElements];
        int count = 0;

        for (int elements : array) {
            if (!containsElement(arrayOfUniquesElements, elements)) {
                arrayOfUniquesElements[count] = elements;
                count++;
            }
        }
        System.out.println("Array of unique elements is: \n" + Arrays.toString(arrayOfUniquesElements));
    }

    private static boolean containsElement(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
