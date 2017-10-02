package hometasks.lesson4.Arrays.task3;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] firstArray = new int[] {1,  2,  3,  4,  5,  6,  7,  8,  9,  10};
        int[] secondArray = new int[]{12, 16, 17, 18, 20, 24, 28, 29, 30};

        mergeArrays(firstArray, secondArray);
    }

    private static void mergeArrays(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        int count = 0;
        if (firstArray.length <= secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                thirdArray[count] = secondArray[i];
                count++;
                thirdArray[count] = firstArray[i];
                count++;
            }
            for (int j = firstArray.length; j < secondArray.length; j++) {
                thirdArray[count] = secondArray[j];
                count++;
            }
        } else {
            for (int i = 0; i < secondArray.length; i++) {
                thirdArray[count] = firstArray[i];
                count++;
                thirdArray[count] = secondArray[i];
                count++;
            }
            for (int j = secondArray.length; j < firstArray.length; j++) {
                thirdArray[count] = firstArray[j];
                count++;
            }
        }
        System.out.println(Arrays.toString(thirdArray));
    }
}