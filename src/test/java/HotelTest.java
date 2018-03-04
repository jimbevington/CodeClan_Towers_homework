import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    private DiningRoom dining1;
    private DiningRoom dining2;

    private ConferenceRoom conf1;
    private ConferenceRoom conf2;

    private Hotel hotel;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    private ArrayList<Room> rooms;

    @Before
    public void setUp() throws Exception {

        rooms = new ArrayList<>();

        bedroom1 = new Bedroom(2, 1, RoomType.TWIN, 34.77);
        rooms.add(bedroom1);
        bedroom2 = new Bedroom(4, 2, RoomType.FAMILY, 145.67);
        rooms.add(bedroom2);
        bedroom3 = new Bedroom(1, 3, RoomType.SINGLE, 12.0);
        rooms.add(bedroom3);
        dining1 = new DiningRoom(45, 4);
        rooms.add(dining1);
        dining2 = new DiningRoom(20, 5);
        rooms.add(dining2);
        conf1 = new ConferenceRoom(10, 6, "War", 150.0);
        rooms.add(conf1);
        conf2 = new ConferenceRoom(6, 7, "Peace", 45.0);
        rooms.add(conf2);

        guest1 = new Guest("Wallace");
        guest2 = new Guest("Gromit");
        guest3 = new Guest("Wendolene");
        guest4 = new Guest("Shaun");
        guest5 = new Guest("Stalin");

        hotel = new Hotel(rooms);
    }

    @Test
    public void canCheckInGuests() {
        hotel.checkIn(guest1, 1);
        assertEquals(1, rooms.get(0).getGuests().size());
    }

    @Test
    public void canListGuests(){
        hotel.checkIn(guest1, 4);
        hotel.checkIn(guest2, 4);
        hotel.checkIn(guest3, 4);
        hotel.checkIn(guest4, 5);
        hotel.checkIn(guest5, 5);
        assertEquals(3, hotel.listGuests(4).size());
        assertEquals(2, hotel.listGuests(5).size());
        assertTrue(hotel.listGuests(4).contains(guest2));
        assertTrue(hotel.listGuests(5).contains(guest5));
    }

    @Test
    public void canListEmptyBedrooms__all(){
        assertEquals(3, hotel.emptyBedrooms().size());
    }

    @Test
    public void canListEmptyBedrooms_one() {
        hotel.checkIn(guest1, 1);
        hotel.checkIn(guest2, 2);
//        check only 1 vacant bedroom
        assertEquals(1, hotel.emptyBedrooms().size());
//        check the vacant room no. is 3
        assertEquals(3, hotel.emptyBedrooms().get(0).getNumber());
    }

    @Test
    public void canCheckInBedroom__bedroom() {
        hotel.checkInBedroom(guest1, 1, 1);
        assertEquals(1, rooms.get(0).getGuests().size());
        assertTrue(rooms.get(0).getGuests().get(0) instanceof Guest);
    }

    //    @Test
//    public void canUpdateDaysBooked() {
//        hotel.checkIn(guest1, 1, 2);
//        assertEquals(2, hotel.getRoom(1).getDaysBooked());
//    }
}
