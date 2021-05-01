package animals;

import actions.Swim;
import food.Food;
import food.Meat;

public class Shark extends Predator implements Swim {

    public Shark(String name, int fullness) {
        super(name, fullness);
    }

    public Shark(){
        super();
    }

    public void eat(Food food){
        if (checkFood(food))
            System.out.println("Shark eats meat.");
    }

    @Override
    public void swim() {
        System.out.println("The shark is swimming.");
    }
}
