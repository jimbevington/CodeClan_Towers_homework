import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;


//  NOT SURE WHETHER TO GO THIS WAY,
//    or have internal ArrayLists of Bedrooms, Conference Rooms and Dining Rooms to individually loop through.
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

    public void checkInBedroom(Guest guest, int roomNumber, int nights) {
        for (Room room : rooms) {
//            choose room based on its number and it being a Bedroom
            if (roomNumber == room.getNumber() && room instanceof Bedroom) {
//                update the Days Booked param
                ((Bedroom) room).setDaysBooked(nights);
//                add the Guest to the Room
                room.addGuest(guest);
//                dock the Guests budget based on Price
                guest.dockBudget(((Bedroom) room).getPrice());
            }
        }
    }

//    potentially superfluous as a single guest probably wouldn't be checked into a Conference room.
//    a single Guest certainly wouldn't be charged for it.
    public void checkInConference(Guest guest, int roomNumber) {
        for (Room room : rooms) {
//            choose room based on its number and it being a ConferenceRoom
            if (roomNumber == room.getNumber() && room instanceof ConferenceRoom) {
//                add the Guest to the Room
                room.addGuest(guest);
//                dock the Guests budget based on Price
                guest.dockBudget(((ConferenceRoom) room).getPrice());
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

    public Room findGuestsRoom(Guest guest) {
        for (Room room : rooms) {
//            if the Guest is in a room, return the Room
            if (room.getGuests().contains(guest)) {
                return room;
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

//    for testing
    public Bedroom getBedroom(int roomNumber) {
        for (Room room : rooms) {
            if (roomNumber == room.getNumber() && room instanceof Bedroom) {
                return (Bedroom) room;
            }
        }
        return null;
    }

}
