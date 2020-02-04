package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(16, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }

    @Test
    public void guestIsAllowed() {
        boolean result = park.isAllowedTo(visitor1);
        assertEquals(true, result);
    }

    @Test
    public void guestIsNotAllowed() {
        boolean result = park.isAllowedTo(visitor2);
        assertEquals(false, result);
    }
}
