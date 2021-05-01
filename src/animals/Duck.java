package animals;

import actions.Fly;
import actions.Swim;
import actions.Voice;
import food.Food;

public class Duck extends Herbivore implements Fly, Swim, Voice {

    public Duck(String name, int fullness) {
        super(name, fullness);
    }

    public Duck(){
        super();
    }
    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }

    @Override
    public String voice() {
        return "Quack-quack!";
    }
}
