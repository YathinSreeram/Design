package Parking_Lot_System_Design;

import Parking_Lot_System_Design.Vehicles.Vehicle;
import Parking_Lot_System_Design.Vehicles.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {

    int level_no;
    int total_slots_in_level;

    List<ParkingSlot> list_of_slots_in_level;

    public Level(int level_no, int total_slots_in_level)
    {
        this.level_no = level_no;
        this.total_slots_in_level = total_slots_in_level;
        list_of_slots_in_level = new ArrayList<>(total_slots_in_level);

        int a = VehicleType.values().length;
        int b = total_slots_in_level/a;

        int m = 0;
        int n = b;
        for(int i = 1; i <= a; i++)
        {
            for(int j = m; j < n; j++)
            {
                list_of_slots_in_level.add(new ParkingSlot(j,VehicleType.values()[i-1]));
            }
            m = n;
            n = n + b;
        }
    }

    public boolean parkVehicle(Vehicle vehicle)
    {
        for(ParkingSlot ps : list_of_slots_in_level)
        {
            if(ps.isSlotAvailable() && ps.parkVehicle(vehicle))
            {
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle)
    {
        for(ParkingSlot ps : list_of_slots_in_level)
        {
            if(ps.parkedVehicle == vehicle && ps.unParkVehicle(vehicle))
            {
                return true;
            }
        }
        return false;
    }

}
