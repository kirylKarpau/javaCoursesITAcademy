package hometasks.lesson9.task1;

import java.util.*;

public class MarkLength4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer", "java"));
        System.out.println("List before actions: " + list);

        markLength4(list);
        System.out.println("List after actions: " + list);
    }

    public static List<String> markLength4(List<String> list) {
        String addElement = "****";
        int counter = 0;

        List<String> copyList = new ArrayList<>();
        copyList.addAll(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                copyList.add(i + counter, addElement);
                counter++;
            }
        }
        list.clear();
        list.addAll(copyList);
        return list;
    }
}
