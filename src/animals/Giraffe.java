package animals;

import actions.Run;
import food.Food;

public class Giraffe extends Herbivore implements Run {

    public Giraffe(String name, int fullness) {
        super(name, fullness);
    }

    public Giraffe(){
        super();
    }

    @Override
    public void run() {
        System.out.println("The giraffe is running.");
    }
}
