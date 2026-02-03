package sef.module06.activity;

public abstract class Transport {

    // Encapsulation: private fields
    private String id;
    private int maxSpeed;

    // Constructor
    public Transport(String id, int maxSpeed) {
        this.id = id;
        this.maxSpeed = maxSpeed;
    }

    // Getters (controlled access)
    public String getId() {
        return id;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // final method (BONUS)
    public final void showInfo() {
        System.out.println("ID: " + id + ", Max Speed: " + maxSpeed + " km/h");
    }

    // abstract method (BONUS)
    public abstract String getType();

    // Method to be overridden
    public void move() {
        System.out.println("Transport is moving");
    }
}
