import attractions.*;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    Attraction attraction;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    Stall stall;
    CandyflossStall candyFloss;
    IceCreamStall IceCream;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;


    private ArrayList<IReviewed> reviewed;
    ThemePark themePark;


//    public ThemePark(ArrayList<IReviewed> reviewed) {
//        this.reviewed = reviewed;
//    }

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewedStuff = new ArrayList<>();
//        for (Attraction attraction : attractions){
//        }
        reviewedStuff.addAll(this.attractions);
        reviewedStuff.addAll(this.stalls);
        return reviewedStuff;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addAttraction(attraction);
    }

    public HashMap<String, Integer> allReviews(){
        HashMap<String, Integer> reviews = new HashMap<>();
        for (IReviewed reviewed : getAllReviewed()){
            reviews.put(reviewed.getName(), reviewed.getRating());
        }
        return reviews;
    }


    public  ArrayList<IReviewed> gettAllAllowedFor(Visitor visitor){
        ArrayList<IReviewed> alloweed = new ArrayList<>();
        for(IReviewed reviewed : getAllReviewed()){
             if (reviewed instanceof ISecurity){
                 if(((ISecurity)reviewed).isAllowedTo(visitor)){
                     alloweed.add(reviewed);
                 }
                 else {alloweed.add(reviewed);
             }
                 return alloweed;
        }

    }



    public ArrayList<IReviewed> getReviewed(){
        ArrayList<IReviewed> reviewedsCopied = new ArrayList<>();
        reviewedsCopied = this.reviewed;
        return reviewedsCopied;
    }

    public int reviewedCount(){
        return this.reviewed.size();
    }

//    public

//    ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.

}
