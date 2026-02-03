package sef.module06.activity;

public class Airplane extends Transport{

    private int passengerCapacity;
    public Airplane(String id, int maxSpeed, int passengerCapacity) {
        super(id, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String getType() {
        return "Airplane";
    }
    @Override
    public void move(){
        System.out.println("Airplane (" + getId() + ") flying on sky "
                + getMaxSpeed() + " km/h and passenger capacity " + passengerCapacity);

    }
}
