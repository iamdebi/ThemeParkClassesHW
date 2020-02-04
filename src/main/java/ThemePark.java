import attractions.*;
import behaviours.IReviewed;
import stalls.*;

import java.util.ArrayList;

public class ThemePark {
    Attraction attraction;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    private ArrayList<Attraction> attractions;

    Stall stall;
    CandyflossStall candyFloss;
    IceCreamStall IceCream;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;
    private ArrayList<Stall> stalls;

    private ArrayList<IReviewed> reviewed;
    ThemePark themePark;


    public ThemePark(ArrayList<IReviewed> reviewed) {
        this.reviewed = reviewed;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.reviewed;
    }

    public

//    ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.

}
