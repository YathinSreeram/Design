package Parking_Lot_System_Design;

import Parking_Lot_System_Design.Vehicles.*;

public class Demo {

    public static void main(String[] args) {

        ParkingLot pl = new ParkingLot();

        pl.addLevel(new Level(1, 15));
        pl.addLevel(new Level(2,30));

        Vehicle car1 = new Car("AP212729");
        Vehicle car2 = new Car("AP3125234");
        Vehicle truck1 = new Truck("TS526713");
        Vehicle mb = new MotorCycle("AP21NK2729");

        pl.parkVehicle(car1);
        pl.parkVehicle(car2);
        pl.parkVehicle(truck1);
        pl.parkVehicle(mb);

        pl.displayFilledSlots();

        pl.unParkVehicle(truck1);

        pl.displayAvailableSlots();

    }
}
