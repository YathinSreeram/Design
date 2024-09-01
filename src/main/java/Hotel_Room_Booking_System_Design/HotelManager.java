package Hotel_Room_Booking_System_Design;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelManager {
    public Hotel hotel;

    public HotelManager(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Room> addRoom(Room room)
    {
        hotel.availableList.add(room);
        return hotel.availableList;
    }

    public List<Room> addBooking(Room room)
    {
        if(hotel.availableList.contains(room))
        {
            hotel.bookingsList.add(room);
            room.isBooked=true;
            hotel.availableList.remove(room);
        }
        return hotel.bookingsList;
    }

    public List<Room> removeBooking(Room room)
    {
        if(hotel.bookingsList.contains(room))
        {
            hotel.bookingsList.remove(room);
            room.isBooked = false;
            hotel.availableList.add(room);
        }
        return hotel.bookingsList;
    }

    public List<Room> getAllAvilableRooms()
    {
        return hotel.availableList;
    }

}
