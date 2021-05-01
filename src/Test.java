import actions.Swim;
import animals.Animal;
import animals.Duck;
import animals.Fish;
import animals.Lion;
import food.Grass;
import food.Meat;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Meat meat = new Meat(35);
        Grass grass = new Grass(27);

        Lion lion = new Lion("Jack", 50);
        Duck duck = new Duck("Duffy", 21);

        Worker worker = new Worker();

        worker.getVoice(duck);

        worker.getVoice(lion);
        worker.getVoice(lion);
        worker.getVoice(lion);

        worker.feed(lion, grass);
        worker.feed(lion, meat);



        List<Swim> list = Pond.getListOfAnimals();
        list.stream().forEach(e -> e.swim());
    }
}
