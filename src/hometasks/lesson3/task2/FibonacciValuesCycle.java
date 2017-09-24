package hometasks.lesson3.task2;

import java.util.Scanner;

public class FibonacciValuesCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value");
        int number = scanner.nextInt();

        int firstValue = 0;
        int secondValue = 1;
        System.out.print("The result is :\n" + firstValue + " " + secondValue);

        int result;

        for (int i = 0; ; i++) {
            result = firstValue + secondValue;
            if (result >= number) {
                return;
            }
            System.out.print(" " + result);
            firstValue = secondValue;
            secondValue = result;

        }

    }
}
