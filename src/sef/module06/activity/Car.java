package sef.module06.activity;

public class Car extends Transport {

    private String fuelType; // additional field

    public Car(String id, int maxSpeed, String fuelType) {
        super(id, maxSpeed); // call parent constructor
        this.fuelType = fuelType;
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public void move() {
        System.out.println(
                "Car (" + getId() + ") drives on roads at "
                        + getMaxSpeed() + " km/h using " + fuelType
        );
    }

    // Subclass-specific method
    public void honk() {
        System.out.println("Car honks: Beep Beep!");
    }
}
