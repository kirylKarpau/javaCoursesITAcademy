package hometasks.lesson10.task2;


public abstract class Car {
    private String model;
    private String brand;
    private int year;
    private String bodyType;


    public Car(String brand, String model, String bodyType, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (this.year != car.year) return false;
        if (this.model != null ? !this.model.equals(car.model) : car.model != null) return false;
        if (this.brand != null ? !this.brand.equals(car.brand) : car.brand != null) return false;
        return this.bodyType != null ? this.bodyType.equals(car.bodyType) : car.bodyType == null;
    }

    @Override
    public int hashCode() {
        int result = this.model != null ? this.model.hashCode() : 0;
        result = 31 * result + (this.brand != null ? this.brand.hashCode() : 0);
        result = 31 * result + this.year;
        result = 31 * result + (this.bodyType != null ? this.bodyType.hashCode() : 0);
        return result;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getBodyType() {
        return bodyType;
    }




}
