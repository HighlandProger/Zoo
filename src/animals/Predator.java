package animals;

import food.Food;
import food.Meat;

public abstract class Predator extends Animal {

    public Predator(){}

    public Predator(String name, int fullness) {
        super(name, fullness);
    }

    protected boolean checkFood(Food food) {
        if (!(food instanceof Meat)) {
            System.out.println("The food is not suitable for this animal.");
            return false;
        }
        else return true;
    }
}

