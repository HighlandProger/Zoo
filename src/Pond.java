import actions.Swim;
import animals.Animal;
import animals.Duck;
import animals.Fish;
import animals.Shark;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    public static List<Swim> getListOfAnimals(){
        List<Swim> list = new ArrayList<>();
        list.add(new Duck());
        list.add(new Duck());
        list.add(new Fish());
        list.add(new Fish());
        list.add(new Fish());
        list.add(new Shark());

        return list;
    }
}
