package sef.module06.activity;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Polymorphism: Transport reference
        List<Transport> transports = new ArrayList<>();

        transports.add(new Car("C01", 180, "Petrol"));
        transports.add(new Train("T01", 300, true));
        transports.add(new Car("C02", 200, "Electric"));
        transports.add(new Airplane("UL121",820,280));

        // Runtime polymorphism
        for (Transport t : transports) {

            t.showInfo(); // final method
            t.move();     // overridden method

            // Safe down-casting (BONUS)
            if (t instanceof Car) {
                ((Car) t).honk();
            } else if (t instanceof Train) {
                ((Train) t).ringBell();
            }

            System.out.println("-----");
        }
    }
}
