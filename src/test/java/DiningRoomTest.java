import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    Guest guest;
    DiningRoom diningRoom;

    @Before
    public void setUp() throws Exception {
        guest = new Guest("Alfred", 156.00);
        diningRoom = new DiningRoom(2, 1);
    }

    @Test
    public void hasNoGuests() {
        assertEquals(0, diningRoom.getGuests().size());
    }

    @Test
    public void canAddGuests() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuests().size());
    }

    @Test
    public void canReachCapacity() {
        diningRoom.addGuest(guest);
        Guest guest2 = new Guest("Jean-Claude", 678.00);
        Guest guest3 = new Guest("Theresa", 100.00);
        diningRoom.addGuest(guest2);
        diningRoom.addGuest(guest3);
        assertEquals(2, diningRoom.getGuests().size());
    }

    @Test
    public void canGetGuests(){
        diningRoom.addGuest(guest);
//        definitely getting Guest objects
        assert(diningRoom.getGuests().get(0) instanceof Guest);
    }
}
