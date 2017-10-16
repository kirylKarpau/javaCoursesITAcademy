package hometasks.lesson12.task2;


import java.io.*;
import java.util.*;

public class SortNumbersFromFileByASC {
    private static final File FILE_DIRECTORY = new File("src" + File.separator + "hometasks" + File.separator + "lesson12" + File.separator + "task2");
    private static final Integer QUANTITY_OF_NUMBERS_IN_FILE = 20;
    private static final Integer MAX_VALUE = 56789;
    private static final Integer QUANTITY_OF_ADDITIONS = 3;

    public static void main(String[] args) {
        Set<Integer> sortedValues = new TreeSet<>();
        writeInTheFile();

        System.out.println("\nList of values that was written in the file: ");
        readFromFile();

        addValuesFromFileToSet(sortedValues);
        writeInTheFile(sortedValues);
    }

    private static void writeInTheFile() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(new File(FILE_DIRECTORY, "digit.txt")), "UTF8"))) {

            for (int i = 0; i < QUANTITY_OF_NUMBERS_IN_FILE; i++) {
                int counter = generateRandomValue(QUANTITY_OF_ADDITIONS);
                int resultValue = 0;
                for (int j = 0; j < counter; j++) {
                    resultValue += generateRandomValue();
                }
                bw.append(" ");
                bw.write(String.valueOf(resultValue));
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() {
        File file = new File(FILE_DIRECTORY, "digit.txt");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNext()) {
                Integer currentValue = Integer.parseInt(scanner.next());
                System.out.println(currentValue);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Set<Integer> addValuesFromFileToSet(Set<Integer> set) {
        File file = new File(FILE_DIRECTORY, "digit.txt");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNext()) {
                Integer currentValue = Integer.parseInt(scanner.next());
                set.add(currentValue);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return set;
    }

    private static Integer generateRandomValue() {
        return new Random().nextInt(MAX_VALUE);
    }

    private static Integer generateRandomValue(int n) {
        return new Random().nextInt(n) + 1;
    }

    private static void writeInTheFile(Set<Integer> sortedValues) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(new File(FILE_DIRECTORY, "digit.txt")), "UTF8"))) {
            for (Integer value : sortedValues) {
                bw.append("\n");
                bw.write(String.valueOf(value));
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
