package hometasks.lesson10.task2;


public class Renault extends Car {


    public Renault(String model, String bodyType, int year) {
        super("renault", model, bodyType, year);
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
