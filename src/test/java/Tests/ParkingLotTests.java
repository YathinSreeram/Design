package Tests;
import Parking_Lot_System_Design.Level;
import Parking_Lot_System_Design.ManagerClasses.ParkingLotManager;
import Parking_Lot_System_Design.ParkingLot;
import Parking_Lot_System_Design.ParkingSlot;
import Parking_Lot_System_Design.Vehicles.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ParkingLotTests {

    public Vehicle vehicle1;
    public Vehicle vehicle2;
    public Vehicle vehicle3;

    Level l1;
    Level l2;

    public ParkingLot pl;

    public ParkingLotManager parkingLotManager;

    @BeforeEach
    public void setUp()
    {
        vehicle1 = new Car("AP21NK2729");
        vehicle2 = new Truck("TS21NK1314");
        vehicle3 = new MotorCycle("KA21NK5120");

        l1 = new Level(1,15);
        pl = new ParkingLot();

        parkingLotManager = new ParkingLotManager(pl);
    }

    @Test
    public void addLevelTest()
    {
        assertEquals(1, parkingLotManager.addLevel(l1).levels.size());
    }

    @Test
    public void parkandUnparkVehicleTest()
    {
        pl.levels.add(l1);
        assertTrue(parkingLotManager.parkVehicle(vehicle1));
        assertTrue(parkingLotManager.unParkVehicle(vehicle1));
    }
}
