import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest{

    Guest guest;
    Bedroom bedroom;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom(2, 56, RoomType.DOUBLE, 19.99);
        guest = new Guest("Leatherface");
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasNoGuests() {
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void canAddGuests() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canReachCapacity() {
        bedroom.addGuest(guest);
        Guest guest2 = new Guest("Silvio");
        Guest guest3 = new Guest("Matteo");
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.getGuests().size());
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.getGuests().size());
    }

    @Test
    public void canGetGuests(){
        bedroom.addGuest(guest);
//        definitely getting Guest objects
        assert(bedroom.getGuests().get(0) instanceof Guest);
    }
}
