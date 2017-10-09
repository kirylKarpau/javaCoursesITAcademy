package hometasks.lesson9.task2;


import hometasks.lesson9.task2.comparators.StudentByAgeComparator;
import hometasks.lesson9.task2.comparators.StudentByAverageMarkComparator;
import hometasks.lesson9.task2.comparators.StudentByFirstNameComparator;
import hometasks.lesson9.task2.comparators.StudentBySecondNameComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                Arrays.asList(new Student("Ivan", "Petrov", 25, 6.8),
                        new Student("Artur", "Sidorov", 32, 7.4),
                        new Student("Fedor", "Sidorov", 38, 4.0),
                        new Student("Karl", "Sidorov", 44, 9),
                        new Student("Karl", "Ivanov", 36, 8.5),
                        new Student("Peter", "Ivanov", 36, 4.2),
                        new Student("Vadim", "Antoshkin", 20, 9.2)));

        Student studentWithMaxAverageMark = maxAverageMark(students);
        System.out.println("Student " +
                studentWithMaxAverageMark.getFirstName() + " " +
                studentWithMaxAverageMark.getSecondName() + " has the max average mark = " +
                studentWithMaxAverageMark.getAverageScore());

        students.sort(new StudentByFirstNameComparator());
        System.out.println("\nSORT BY FIRST NAME");
        students.forEach(System.out::println);

        students.sort(new StudentBySecondNameComparator());
        System.out.println("\n\nSORT BY SECOND NAME");
        students.forEach(System.out::println);

        students.sort(new StudentByAgeComparator());
        System.out.println("\n\nSORT BY AGE");
        students.forEach(System.out::println);

        students.sort(new StudentByAverageMarkComparator());
        System.out.println("\n\nSORT BY AVERAGE MARK");
        students.forEach(System.out::println);

        maxAverageMark(students);
    }

    private static Student maxAverageMark(List<Student> students) {
        Student studentWithMaxAverageMark = students.get(0);
        for (Student student : students) {
            if (studentWithMaxAverageMark.getAverageScore() < student.getAverageScore()) {
                studentWithMaxAverageMark = student;
            }
        }
        return studentWithMaxAverageMark;
    }
}
