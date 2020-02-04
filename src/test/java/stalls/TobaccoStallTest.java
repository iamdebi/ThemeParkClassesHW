package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;


    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void guestIsAllowed() {
        Visitor visitor = new Visitor(18, 1.2, 40.0);
        boolean result = tobaccoStall.isAllowedTo(visitor);
        assertEquals(true, result);
    }

    @Test
    public void guestIsNotAllowed() {
        Visitor visitor = new Visitor(14, 1.2, 40.0);
        boolean result = tobaccoStall.isAllowedTo(visitor);
        assertEquals(false, result);
    }

    @Test
    public void canGetRating(){
        assertEquals(4, tobaccoStall.getRating());
    }


}
