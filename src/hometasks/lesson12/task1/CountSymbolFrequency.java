package hometasks.lesson12.task1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbolFrequency {
    private static final File FILE_DIRECTORY = new File("src" + File.separator + "hometasks" + File.separator + "lesson12" + File.separator + "task1");
    private static final String ALL_PUNCTUATION_SYMBOLS = "!.,?-:;";

    public static void main(String[] args) {
        Map<Character, Integer> resultOfCountLetters = new TreeMap<>();

        File file = new File(FILE_DIRECTORY, "poem.txt");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNext()) {
                String currentWord = scanner.next();
                countCharsInWord(currentWord, resultOfCountLetters);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        printMap(resultOfCountLetters);
    }

    private static void countCharsInWord(String word, Map<Character, Integer> resultMapWithAlphabet) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.toLowerCase().charAt(i);
            addCharToMap(currentChar, resultMapWithAlphabet);
        }
    }

    private static Map<Character, Integer> addCharToMap(Character symbol, Map<Character, Integer> resultMapWithAlphabet) {
        if (!isCharPunctuationSymbol(symbol)) {
            for (Character key : resultMapWithAlphabet.keySet()) {
                if (key.equals(symbol)) {
                    Integer quantity = resultMapWithAlphabet.get(key);
                    quantity++;
                    resultMapWithAlphabet.put(key, quantity);
                    return resultMapWithAlphabet;
                }
            }
            resultMapWithAlphabet.put(symbol, 1);
        }
        return resultMapWithAlphabet;
    }

    private static boolean isCharPunctuationSymbol(Character symbol) {
        return ALL_PUNCTUATION_SYMBOLS.indexOf(symbol) > -1;
    }

    private static void printMap(Map<Character, Integer> map) {
        for (Entry<Character, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }

}
