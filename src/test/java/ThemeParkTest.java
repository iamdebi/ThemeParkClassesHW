import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    CandyflossStall candyFloss;
    IceCreamStall iceCream;
    ArrayList <IReviewed> reviewed;


    @Before
    public void before(){
        reviewed = new ArrayList<IReviewed>();
        rollerCoaster = new RollerCoaster("Big Dipper", 7);
        reviewed.add(rollerCoaster);
        dodgems = new Dodgems("Racer Car", 6);
        reviewed.add(dodgems);
        candyFloss = new CandyflossStall("candy", "Karen", ParkingSpot.A1, 5);
        reviewed.add(candyFloss);
        iceCream = new IceCreamStall("ice", "Sally", ParkingSpot.B1, 4);
        reviewed.add(iceCream);

//        themePark = new ThemePark(reviewed);
    }

    @Test
    public void canCountReviewed(){
        assertEquals(4, themePark.reviewedCount());
    }

    @Test
    public void canGetReviewed(){
        assertEquals(rollerCoaster, reviewed.get(0));
        assertEquals(4, themePark.reviewedCount());
    }


}
