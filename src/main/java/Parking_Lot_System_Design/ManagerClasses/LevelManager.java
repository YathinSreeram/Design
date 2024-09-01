package Parking_Lot_System_Design.ManagerClasses;

import Parking_Lot_System_Design.Level;
import Parking_Lot_System_Design.ParkingSlot;
import Parking_Lot_System_Design.Vehicles.Vehicle;
import Parking_Lot_System_Design.Vehicles.VehicleType;

public class LevelManager {

    public Level level;

    public LevelManager(Level l)
    {
        this.level = l;
        this.assignSlots();
    }

    public void assignSlots()
    {
        int a = VehicleType.values().length;
        int b = level.total_slots_in_level/a;
        int m = 0;
        int n = b;
        for(int i = 1; i <= a; i++)
        {
            for(int j = m; j < n; j++)
            {
                level.list_of_slots_in_level.add( new ParkingSlot(j,VehicleType.values()[i-1]) );
            }
            m = n;
            n = n + b;
        }
    }

    public boolean parkVehicle(Vehicle vehicle)
    {
        System.out.println(level.list_of_slots_in_level);
        for(ParkingSlot ps : level.list_of_slots_in_level)
        {

            ParkingSlotManager parkingSlotManager = new ParkingSlotManager(ps);
            if(parkingSlotManager.isSlotAvailable() && parkingSlotManager.parkVehicle(vehicle))
            {
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle)
    {
        for(ParkingSlot ps : level.list_of_slots_in_level)
        {
            ParkingSlotManager parkingSlotManager = new ParkingSlotManager(ps);
            if(ps.parkedVehicle == vehicle && parkingSlotManager.unParkVehicle(vehicle))
            {
                return true;
            }
        }
        return false;
    }
}
