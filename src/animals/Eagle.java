package animals;

import actions.Fly;

public class Eagle extends Predator implements Fly {

    public Eagle(String name, int fullness) {
        super(name, fullness);
    }

    public Eagle(){
        super();
    }

    @Override
    public void fly() {
        System.out.println("The Eagle is flying.");
    }
}
