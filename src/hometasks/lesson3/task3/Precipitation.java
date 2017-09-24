package hometasks.lesson3.task3;


import java.util.Scanner;

public class Precipitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the days: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Invalid value of days was entered.");
            return;
        }

        int daysQuantity = number;
        int value = 0;
        double rainfallAmount = 0;
        double averageRainFall = 0;

        while (number > 0) {
            System.out.println("ENTER THE RAINFALL VALUE and please note that " + number + "  enters will be required");
            value = scanner.nextInt();
            if (value < 0) {
                System.out.println("Incorrect rainfall value was entered");
                return;
            }
            rainfallAmount += value;
            number--;

        }
        averageRainFall = rainfallAmount / daysQuantity;

        System.out.println("The number of days is " + daysQuantity);
        System.out.println("The amount of rainfalls is " + rainfallAmount);
        System.out.println("The average value of rainfalls is " + averageRainFall);
    }
}
