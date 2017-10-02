package hometasks.lesson3.task1;


import java.util.Scanner;

public class ValuesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int result;
        int amount = 0;
        int i = 0;

        while (getResultOfDivision(number, i) != 0) {
            result = getResultOfDivision(number, i) % 10;
            amount += result;
            i++;
        }
        System.out.println("Amount of the value is " + amount);
    }

    private static int getResultOfDivision(int number, int i) {
        return (int) (number / Math.pow(10, i));
    }
}