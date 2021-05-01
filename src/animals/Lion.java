package animals;

import actions.Run;
import actions.Voice;
import food.Food;

import java.util.List;


public class Lion extends Predator implements Run, Voice {

    public Lion(String name, int fullness) {
        super(name, fullness);
    }

    public Lion() {
        super();
    }

    @Override
    public void run() {
        System.out.println("The lion is running.");
    }

    @Override
    public String voice() {
        return "Roar!";
    }
}


