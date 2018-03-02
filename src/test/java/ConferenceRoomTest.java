import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Guest guest;
    ConferenceRoom confRoom;

    @Before
    public void setUp() throws Exception {
        confRoom = new ConferenceRoom(3, 1, "Siberia", 150.00);
        guest = new Guest("Olaf");
    }

    @Test
    public void hasNoGuests() {
        assertEquals(0, confRoom.getGuests().size());
    }

    @Test
    public void canAddGuests() {
        confRoom.addGuest(guest);
        assertEquals(1, confRoom.getGuests().size());
    }

    @Test
    public void canReachCapacity() {
        confRoom.addGuest(guest);
        Guest guest2 = new Guest("Barry");
        Guest guest3 = new Guest("Gandalf");
        Guest guest4 = new Guest("Stinky");
        confRoom.addGuest(guest2);
        confRoom.addGuest(guest3);
        confRoom.addGuest(guest4);
        assertEquals(3, confRoom.getGuests().size());
    }

    @Test
    public void canGetGuests(){
        confRoom.addGuest(guest);
//        definitely getting Guest objects
        assert(confRoom.getGuests().get(0) instanceof Guest);
    }
}
