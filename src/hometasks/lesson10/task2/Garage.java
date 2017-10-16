package hometasks.lesson10.task2;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Garage {
    public static void main(String[] args) {
        Map<Car, Integer> garage = new HashMap<>();
        Car renoSandero = new Renault("sandero", "hatchback", 2014);
        Car renoDuster = new Renault("duster", "hatchback", 2014);
        Car renoSandero2 = new Renault("sandero", "hatchback", 2014);
        Car volksPolo = new Volkswagen("polo", "sedan", 2017);
        Car kiaRio = new Kia("rio", "sedan", 2010);
        Car ladaXRay = new Lada("XRay", "crossover", 2017);

        parkingInGarage(renoSandero, garage);
        parkingInGarage(renoDuster, garage);
        parkingInGarage(renoSandero2, garage);
        parkingInGarage(volksPolo, garage);

        System.out.println("----  The list of cars in the garage  ----");
        printMap(garage);
        System.out.println();

        System.out.println("----  The result of removing car that doesn't exist in the garage  ----");
        removeCarFromGarage(kiaRio, garage);
        System.out.println();

        System.out.println("----  Quantity of the specific model that exist in the garage  ----");
        System.out.println("MODEL: " + renoSandero + ". QUANTITY: " + returnTheQuantityOfSpecificCar(renoSandero, garage));
        System.out.println();

        System.out.println("----  Quantity of the specific model that not exist in the garage  ----");
        System.out.println("MODEL: " + kiaRio + ". QUANTITY: " + returnTheQuantityOfSpecificCar(kiaRio, garage));
    }

    private static Map<Car, Integer> parkingInGarage(Car car, Map<Car, Integer> garage) {
        for (Car key : garage.keySet()) {
            if (key.equals(car)) {
                Integer quantity = garage.get(key);
                quantity++;
                garage.put(car, quantity);
                return garage;
            }
        }
        garage.put(car, 1);
        return garage;
    }

    private static Map<Car, Integer> removeCarFromGarage(Car car, Map<Car, Integer> garage) {
        for (Car key : garage.keySet()) {
            if (key.equals(car)) {
                Integer quantity = garage.get(key);
                if (quantity > 1) {
                    quantity--;
                    garage.put(car, quantity);
                    return garage;
                } else {
                    garage.remove(key);
                    return garage;
                }
            }
        }
        System.out.println("The car doesn't exist in the garage! MODEL: " + car);
        return garage;
    }

    private static Integer returnTheQuantityOfSpecificCar(Car car, Map<Car, Integer> garage) {
        for (Car key : garage.keySet()) {
            if (key.equals(car)) {
                Integer quantity = garage.get(key);
                if (quantity > 1) {
                    return quantity;
                }
            }
        }
        return 0;
    }

    private static void printMap(Map<Car, Integer> map) {
        for (Entry<Car, Integer> entry : map.entrySet())
            System.out.println("MODEL: " + entry.getKey() + ". QUANTITY: " + entry.getValue());
    }

}