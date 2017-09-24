package hometasks.lesson2.task1;


import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day: ");
        int day = scanner.nextInt();

        System.out.println("Enter the month: ");
        int month = scanner.nextInt();

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        if (isIncorrectDayEntered(day)) {
            System.out.println("Incorrect day was entered.");
            return;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    month++;

                }
                System.out.println(getCountedDate(day, month, year));
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    day++;
                } else if (day == 31) {
                    System.out.println("Incorrect day was entered");
                    return;
                } else {
                    day = 1;
                    month++;

                }
                System.out.println(getCountedDate(day, month, year));
                break;
            case 12:
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    month = 1;
                    year++;
                }
                System.out.println(getCountedDate(day, month, year));
                break;
            case 2:
                if (year % 4 == 0 && day == 29) {
                    day = 1;
                    month++;
                } else if (year % 4 != 0 && day == 28) {
                    day = 1;
                    month++;
                } else if (day > 29 || (year % 4 != 0 && day == 29)) {
                    System.out.println("Incorrect day for February was entered.");
                    return;
                } else {
                    day++;
                }
                System.out.println(getCountedDate(day, month, year));
                break;
            default:
                System.out.println("Incorrect month was entered.");
                return;

        }

        /*if (month < 12) {
            System.out.println(getCountedDate(day, month, year));
        } else {
            month = 1;
            year++;
            System.out.println(getCountedDate(day, month, year));

        }*/

    }

    public static String getCountedDate(int day, int month, int year) {

        return "Counted date is :" + addZeroInBegin(day) + "." + addZeroInBegin(month) + "." + addZeroInBeginOfYear(year);
    }

    public static boolean isIncorrectDayEntered(int day) {
        return day < 0 && day > 31;
    }


    public static String addZeroInBegin(int value) {
        if (value < 10) {
            return "0" + value;
        } else return "" + value;
    }

    public static String addZeroInBeginOfYear(int value) {
        if (value < 10) {
            return "000" + value;
        } else if (value < 100) {
            return "00" + value;
        } else if (value < 1000) {
            return "0" + value;
        }
        return "" + value;
    }
}



/*
* 1) Incorrect value : 0, -10
* 2) Out of the range : month range 1-12; day range :1-31; year range : 1 2017
* 3) Incorrect 31 day for 4,6,9,11 month; 30 and 31 for 2 month
*
*
*
* */