package hometasks.lesson10.task2;


public class Kia extends Car {


    public Kia(String model, String bodyType, int year) {
        super("kia", model, bodyType, year);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel()+ " " + getBodyType() + " " + getYear();
    }
}
