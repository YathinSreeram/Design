package Parking_Lot_System_Design;
import Parking_Lot_System_Design.Vehicles.Vehicle;
import Parking_Lot_System_Design.Vehicles.VehicleType;
import java.util.ArrayList;
import java.util.List;

public class Level {

    public int level_no;
    public int total_slots_in_level;

    public List<ParkingSlot> list_of_slots_in_level;

    public Level(int level_no, int total_slots_in_level)
    {
        this.level_no = level_no;
        this.total_slots_in_level = total_slots_in_level;
        list_of_slots_in_level = new ArrayList<>(total_slots_in_level);
    }

}
