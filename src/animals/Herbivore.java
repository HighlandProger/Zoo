package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int fullness) {
        super(name, fullness);
    }

    public Herbivore(){}

    protected boolean checkFood(Food food) {
        if (!(food instanceof Grass)) {
            System.out.println("The food is not suitable for this animal.");
            return false;
        }
        else return true;
    }
}
