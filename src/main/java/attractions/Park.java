package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Park extends Attraction implements ISecurity, IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15){
            return true;
        }
        return false;
    }
}
