package Hotel_Room_Booking_System_Design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {

    public String hotelName;
    public List<Room> bookingsList;
    public List<Room> availableList;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        bookingsList = new ArrayList<>();
        availableList = new ArrayList<>();
    }
}
