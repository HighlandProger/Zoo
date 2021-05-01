package animals;

import actions.Swim;
import food.Food;

public class Fish extends Herbivore implements Swim {


    public Fish(String name, int fullness) {
        super(name, fullness);
    }

    public Fish(){
        super();
    }

    @Override
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}
