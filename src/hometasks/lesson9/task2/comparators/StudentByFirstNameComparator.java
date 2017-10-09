package hometasks.lesson9.task2.comparators;

import hometasks.lesson9.task2.Student;

import java.util.Comparator;

public class StudentByFirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getFirstName().equals(second.getFirstName())) {
            return new StudentBySecondNameComparator().compare(first, second);
        }
        return first.getFirstName().compareTo(second.getFirstName());
    }
}
