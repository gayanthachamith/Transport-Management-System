package sef.module06.activity;

public class Train extends Transport {

    private boolean hasBell; // additional field

    public Train(String id, int maxSpeed, boolean hasBell) {
        super(id, maxSpeed);
        this.hasBell = hasBell;
    }

    @Override
    public String getType() {
        return "Train";
    }

    @Override
    public void move() {
        System.out.println(
                "Train (" + getId() + ") runs on tracks at "
                        + getMaxSpeed() + " km/h"
        );
    }

    // Subclass-specific method
    public void ringBell() {
        if (hasBell) {
            System.out.println("Train rings: Ding Ding!");
        }
    }
}
