package hometasks.lesson3.task1;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ValuesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int result;
        int ammount = 0;
        int i = 0;

        while (getResultOfDivision(number, i) != 0) {
            result = getResultOfDivision(number, i) % 10;
            ammount += result;
            i++;
        }
        System.out.println("Ammount of the value is " + ammount);
    }

    public static int getResultOfDivision(int number, int i) {
        return (int) (number / Math.pow(10, i));
    }

}


