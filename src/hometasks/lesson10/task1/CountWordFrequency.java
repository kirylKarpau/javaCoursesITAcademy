package hometasks.lesson10.task1;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountWordFrequency {

    public static void main(String[] args) {

        Map<String, Integer> resultWords = new HashMap<>();
        String englishText = "There are many big and small libraries everywhere in our country. They have millions of books in different languages. You can find there the oldest and the newest books.\n" +
                "Every school has a library. Pupils come to the library to take books on different subjects.\n" +
                "The school library where Olga studies is good. It is a large clean room. There are four big windows in it. The walls are light blue. There are a lot of shelves full of books. You can find books on literature, physics, history, chemistry, geography, biology and other subjects. There are books in English, too.\n" +
                "On the walls you can see pictures of some great writers and poets.\n" +
                "On the table near the window you can always see beautiful spring and autumn flowers.\n" +
                "Oleg likes to go to the library. He can always find there something new, something he needs.";

        gatherWordFromChars(englishText, resultWords);

        printMap(resultWords);
    }

    private static void gatherWordFromChars(String englishText, Map<String, Integer> resultCountWordsInText) {
        String currentWord = "";
        for (int i = 0; i < englishText.length(); i++) {
            char charOfText = englishText.charAt(i);
            if (charOfText != ' ' && charOfText != '\n') {
                if (charOfText != ',' && charOfText != '.') {
                    currentWord = currentWord.concat(String.valueOf(charOfText));
                }
            } else {
                addWordToMap(currentWord, resultCountWordsInText);
                currentWord = "";
            }
            if (i == englishText.length() - 1) {
                addWordToMap(currentWord, resultCountWordsInText);
            }
        }
    }

    private static Map<String, Integer> addWordToMap(String word, Map<String, Integer> mapWithWords) {
        for (String key : mapWithWords.keySet()) {
            if (key.equals(word)) {
                Integer quantity = mapWithWords.get(key);
                quantity++;
                mapWithWords.put(key, quantity);
                return mapWithWords;
            }
        }
        mapWithWords.put(word, 1);
        return mapWithWords;
    }

    private static void printMap(Map<String, Integer> map) {
        for (Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
