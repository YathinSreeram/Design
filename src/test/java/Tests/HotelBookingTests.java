package Tests;


import Hotel_Room_Booking_System_Design.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelBookingTests {

    public Room deluxe1;
    public Room deluxe2;
    public Room deluxe3;

    public Room elite1;
    public Room elite2;
    public Room elite3;

    public Room prime1;
    public Room prime2;
    public Room prime3;



    public Hotel hotel;
    public HotelManager hotelManager;


    @BeforeEach
    public void setUp()
    {
        deluxe1 = new Deluxe("DELUXE", 1500.0d,101);
        deluxe2 = new Deluxe("DELUXE", 1500.0d,102);
        deluxe3 = new Deluxe("DELUXE", 1500.0d,103);
        elite1 = new Elite("ELITE", 2000.0d, 201);
        elite2 = new Elite("ELITE", 2000.0d, 202);
        elite3 = new Elite("ELITE", 2000.0d, 203);
        prime1 = new Prime("PRIME", 3000.0d, 301);
        prime2 = new Prime("PRIME", 3000.0d, 302);
        prime3 = new Prime("PRIME", 3000.0d, 303);

        hotel = new Hotel("Taj Shine");
        hotelManager= new HotelManager(hotel);

    }

    @Test
    public void addRoomTest()
    {
        hotelManager.addRoom(deluxe1);
        hotelManager.addRoom(elite1);
        assertEquals(2, hotel.availableList.size());
    }

    @Test
    public void addBookingTest()
    {
        hotelManager.addRoom(deluxe1);
        hotelManager.addBooking(deluxe1);
        assertEquals(1, hotel.bookingsList.size());
    }

    @Test
    public void removeBookingTest()
    {
        hotel.bookingsList.add(elite1);
        hotel.bookingsList.add(prime1);
        assertEquals(1, hotelManager.removeBooking(prime1).size());
    }

    @Test
    public void getAllAvilableRoomsTest()
    {
        hotel.availableList.add(elite1);
        hotel.availableList.add(elite2);
        hotel.availableList.add(elite3);

        hotelManager.addBooking(elite2);
        assertEquals(2, hotelManager.getAllAvilableRooms().size());
    }

}
