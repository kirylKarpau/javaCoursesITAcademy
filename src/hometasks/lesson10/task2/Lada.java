package hometasks.lesson10.task2;


public class Lada extends Car {

    public Lada(String model, String bodyType, int year) {
        super("lada", model, bodyType, year);
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
        return getBrand() + " " + getModel()+ " " + getBodyType() + " " + getYear() ;
    }
}
