package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Park extends Attraction implements ISecurity {

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
