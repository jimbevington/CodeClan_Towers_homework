import java.util.ArrayList;

public class Room {

    int capacity;
    int number;
    ArrayList<Guest> guests;

    public Room(int capacity, int number) {
        this.capacity = capacity;
        this.number = number;
        this.guests = new ArrayList<>();
    }

    public int getNumber() {
        return this.number;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
//        only add guest if capacity not reached
        if (this.guests.size() < this.capacity) {
            this.guests.add(guest);
        }
    }

}
