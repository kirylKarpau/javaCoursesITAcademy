package hometasks.lesson5.Strings.task2;


public class FromArabicToRoman {

    public static void main(String[] args) {
        String string = "3999";
        System.out.println("The initial value is: " + string);
        String result;
        int stringToInt = Integer.parseInt(string);

        int countM = stringToInt / 1000;
        int remainderOfM = stringToInt % 1000;

        int countD = remainderOfM / 500;
        int remainderOfD = remainderOfM % 500;

        int countC = remainderOfD / 100;
        int remainderOfC = remainderOfD % 100;

        int countL = remainderOfC / 50;
        int remainderOfL = remainderOfC % 50;

        int countX = remainderOfL / 10;
        int countI = remainderOfL % 10;

        result = addMToString(countM)
                + addDToString(countD, remainderOfM)
                + addCToString(countC, remainderOfM)
                + addLToString(countL, remainderOfC)
                + addXToString(countX, remainderOfC)
                + addIToString(countI);

        System.out.println("The result of transformation to : " + result);
    }

    private static String addMToString(int value) {
        String result = "";
        if (value < 4) {
            for (int i = 0; i < value; i++) {
                result += "M";
            }
        } else {
            return "The value is greater than 3999 and cannot be converted in arabic symbols";
        }
        return result;
    }

    private static String addDToString(int value, int remainderOfM) {
        String result = "";
        if (remainderOfM > 899) {
            return "CM";
        } else if (value < 2) {
            for (int i = 0; i < value; i++) {
                result += "D";
            }
        }
        return result;
    }

    private static String addCToString(int value, int remainderOfM) {
        String result = "";
        if (value == 4 && remainderOfM < 899) {
            result = "CD";
        } else if (value < 4) {
            for (int i = 0; i < value; i++) {
                result += "C";
            }
        }
        return result;
    }

    private static String addLToString(int value, int remainderOfC) {
        String result = "";
        if (remainderOfC > 89) {
            return "XC";
        } else if (value < 2) {
            for (int i = 0; i < value; i++) {
                result += "L";
            }
        }
        return result;
    }

    private static String addXToString(int value, int remainderOfC) {
        String result = "";
        if (value == 4 && remainderOfC < 89) {
            result = "XL";
        } else if (value < 4) {
            for (int i = 0; i < value; i++) {
                result += "X";
            }
        }
        return result;
    }

    private static String addIToString(int value) {
        String[] arrayOfValues = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arrayOfValues[value];
    }
}