import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp() throws Exception {
        guest = new Guest("Jim", 12.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Jim", guest.getName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(12.00, guest.getBudget(), 0.01);
    }
}

