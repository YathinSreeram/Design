package Parking_Lot_System_Design;

import Parking_Lot_System_Design.Vehicles.Vehicle;
import Parking_Lot_System_Design.Vehicles.VehicleType;

public class ParkingSlot {

    int slot_no;
    VehicleType vehicleType;
    Vehicle parkedVehicle;

    ParkingSlot(int slot_no, VehicleType vehicleType)
    {
        this.slot_no = slot_no;
        this.vehicleType  = vehicleType;
    }

    public boolean isSlotAvailable()
    {
        return parkedVehicle == null;
    }

    public boolean parkVehicle(Vehicle vehicle)
    {
        if(vehicle.getType() == vehicleType)
        {
            this.parkedVehicle = vehicle;
            return true;
        }
        return false;
    }


    public boolean unParkVehicle(Vehicle vehicle)
    {
        this.parkedVehicle = null;
        return true;
    }

    public int getLevel_no() {
        return slot_no;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle getVehicle() {
        return parkedVehicle;
    }
}
