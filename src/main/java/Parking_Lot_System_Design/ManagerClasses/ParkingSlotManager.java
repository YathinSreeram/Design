package Parking_Lot_System_Design.ManagerClasses;

import Parking_Lot_System_Design.ParkingSlot;
import Parking_Lot_System_Design.Vehicles.Vehicle;

public class ParkingSlotManager {

    public ParkingSlot ps;

    public ParkingSlotManager(ParkingSlot ps) {
        this.ps = ps;
    }

    public boolean isSlotAvailable()
    {
        return ps.parkedVehicle == null;
    }

    public boolean parkVehicle(Vehicle vehicle)
    {
        if(vehicle.getType() == ps.vehicleType)
        {
            ps.parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle)
    {
        ps.parkedVehicle = null;
        return true;
    }
}
