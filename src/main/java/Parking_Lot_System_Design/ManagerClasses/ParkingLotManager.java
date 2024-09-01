package Parking_Lot_System_Design.ManagerClasses;

import Parking_Lot_System_Design.Level;
import Parking_Lot_System_Design.ParkingLot;
import Parking_Lot_System_Design.ParkingSlot;
import Parking_Lot_System_Design.Vehicles.Vehicle;

public class ParkingLotManager {

    public ParkingLot pl;

    public ParkingLotManager(ParkingLot pl) {
        this.pl = pl;
    }

    public ParkingLot addLevel(Level level)
    {
        pl.levels.add(level);
        LevelManager levelManager = new LevelManager(level);
        levelManager.assignSlots();
        return pl;
    }

    public boolean parkVehicle(Vehicle vehicle)
    {
        for (Level level : pl.levels)
        {
            LevelManager levelManager = new LevelManager(level);
            if (levelManager.parkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle)
    {
        for (Level level : pl.levels)
        {
            LevelManager levelManager = new LevelManager(level);
            if(levelManager.unParkVehicle(vehicle))
            {
                return true;
            }
        }
        return false;
    }

    public void displayFilledSlots()
    {
        System.out.println("List of Filled slots :");
        for(Level l : pl.levels)
        {
            for(ParkingSlot ps : l.list_of_slots_in_level)
            {
                if(ps.parkedVehicle != null){
                    System.out.println("Level "+l.level_no + " , " + "Slot "+ps.slot_no + " : " + ps.parkedVehicle.getLicensePlate());
                }
            }
        }
    }

    public void displayAvailableSlots()
    {
        System.out.println("List of Available slots :");
        for (Level l : pl.levels)
        {
            for(ParkingSlot ps : l.list_of_slots_in_level)
            {
                if(ps.parkedVehicle == null){
                    System.out.println("Level "+l.level_no + " , " + "Slot "+ps.slot_no);
                }
            }
        }
    }

}
