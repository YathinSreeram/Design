package Hotel_Room_Booking_System_Design;

public abstract class Room {

    String roomType;
    public double price;
    public boolean isBooked;
    int roomNo;

    public Room(String roomType, double price, int roomNo) {
        this.roomType = roomType;
        this.price = price;
        this.isBooked = false;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", price=" + price +
                ", isBooked=" + isBooked +
                ", roomNo=" + roomNo +
                '}';
    }
}
