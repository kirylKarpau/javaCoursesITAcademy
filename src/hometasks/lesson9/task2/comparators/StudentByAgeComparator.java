package hometasks.lesson9.task2.comparators;

import hometasks.lesson9.task2.Student;

import java.util.Comparator;

public class StudentByAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return new Integer(first.getAge()).compareTo(second.getAge());
    }
}
