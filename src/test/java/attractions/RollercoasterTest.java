package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void guestIsAllowed() {
        Visitor visitor = new Visitor(18, 1.5, 40.0);
        boolean result = rollerCoaster.isAllowedTo(visitor);
        assertEquals(true, result);
    }

    @Test
    public void guestIsNotAllowed() {
        Visitor visitor = new Visitor(11, 1.2, 40.0);
        boolean result = rollerCoaster.isAllowedTo(visitor);
        assertEquals(false, result);
    }

    @Test
    public void guestIsNotAllowedMeets1() {
        Visitor visitor = new Visitor(11, 1.6, 40.0);
        boolean result = rollerCoaster.isAllowedTo(visitor);
        assertEquals(false, result);
    }

    @Test
    public void canGetDefaultprice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.00);
    }

    @Test
    public void canGetDoublePrice(){
        Visitor visitor = new Visitor(18, 2.5, 40.0);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.00);
    }
}
