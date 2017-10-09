package hometasks.lesson9.task2.comparators;

import hometasks.lesson9.task2.Student;

import java.util.Comparator;

public class StudentBySecondNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getSecondName().equals(second.getSecondName())) {
            return new StudentByFirstNameComparator().compare(first, second);
        } else {
            return first.getSecondName().compareTo(second.getSecondName());
        }
    }
}


