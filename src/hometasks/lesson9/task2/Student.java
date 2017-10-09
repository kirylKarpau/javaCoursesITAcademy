package hometasks.lesson9.task2;


public class Student {
    private String firstName;
    private String secondName;
    private int age;
    private double averageScore;

    Student(String firstName, String secondName, int age, double averageScore) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return getFirstName() +
                " " + getSecondName() +
                " " + getAge() +
                " " + getAverageScore();
    }
}
