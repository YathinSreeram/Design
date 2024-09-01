package Parking_Lot_System_Design;

import Parking_Lot_System_Design.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {


    public List<Level> levels;

    public ParkingLot()
    {
        levels = new ArrayList<>();
    }

//    public void addLevel(Level level)
//    {
//        levels.add(level);
//    }
//
//    public boolean parkVehicle(Vehicle vehicle)
//    {
//        for (Level level : levels)
//        {
//            if (level.parkVehicle(vehicle)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean unParkVehicle(Vehicle vehicle)
//    {
//        for (Level level : levels)
//        {
//            if(level.unParkVehicle(vehicle))
//            {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void displayFilledSlots()
//    {
//        System.out.println("List of Filled slots :");
//        for(Level l : levels)
//        {
//            for(ParkingSlot ps : l.list_of_slots_in_level)
//            {
//                if(ps.parkedVehicle != null){
//                    System.out.println("Level "+l.level_no + " , " + "Slot "+ps.slot_no + " : " + ps.parkedVehicle.getLicensePlate());
//                }
//            }
//        }
//    }
//
//    public void displayAvailableSlots()
//    {
//        System.out.println("List of Available slots :");
//        for (Level l : levels)
//        {
//            for(ParkingSlot ps : l.list_of_slots_in_level)
//            {
//                if(ps.parkedVehicle == null){
//                    System.out.println("Level "+l.level_no + " , " + "Slot "+ps.slot_no);
//                }
//            }
//
//        }
//    }


}
