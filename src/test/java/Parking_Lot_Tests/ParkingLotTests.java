package Parking_Lot_Tests;

import Parking_Lot_System_Design.Level;
import Parking_Lot_System_Design.ParkingLot;
import Parking_Lot_System_Design.Vehicles.Car;
import Parking_Lot_System_Design.Vehicles.Vehicle;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ParkingLotTests {

    public ParkingLot pl;

    Level l1;
    Level l2;

    @BeforeEach
    public void setUp()
    {
        System.out.println("QQQ");
        pl = new ParkingLot();
        l1 = new Level(1, 15);
        l2 = new Level(2, 30);
        pl.addLevel(l1);
        pl.addLevel(l2);
    }

    @Test
    public void testParkVehicle()
    {
        pl = new ParkingLot();
        l1 = new Level(1, 15);
        l2 = new Level(2, 30);
        pl.addLevel(l1);
        pl.addLevel(l2);
        Vehicle car = new Car("AP21NK2729");

        pl.parkVehicle(car);
        assertTrue(pl.parkVehicle(car));
    }

    @Test
    public void testUnparkVehicle()
    {
        pl = new ParkingLot();
        l1 = new Level(1, 15);
        l2 = new Level(2, 30);
        pl.addLevel(l1);
        pl.addLevel(l2);
        Vehicle car = new Car("AP21NK2729");

        pl.parkVehicle(car);
        assertTrue(pl.unParkVehicle(car));
    }
}
