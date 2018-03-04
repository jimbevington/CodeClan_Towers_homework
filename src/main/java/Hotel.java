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

    public ArrayList<Room> emptyBedrooms() {
        ArrayList<Room> empties = new ArrayList<>();
        for (Room room : rooms) {
//            check if room is a Bedroom and has no guests
            if (room instanceof Bedroom && room.getGuests().size() == 0){
                empties.add(room);
            }
        }
        return empties;
    }
}
