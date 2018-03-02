import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;


    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void checkIn(Guest guest, int roomNumber) {
        for (Room room : rooms) {
            if (roomNumber == room.getNumber()){
                room.addGuest(guest);
            }
        }
    }


    public ArrayList<Guest> listGuests(int roomNumber) {
        for (Room room : rooms) {
            if (roomNumber == room.getNumber()){
                return room.getGuests();
            }
        }
        return null;
    }
}
