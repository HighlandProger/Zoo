import actions.Voice;
import animals.Animal;
import animals.Lion;
import animals.Predator;
import food.Food;

public class Worker {

    private final int powerToGetVoice = 20;

    public void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public void getVoice(Voice voiceAnimal){
        Animal animal = (Animal) voiceAnimal;
        if (animal.getFullness()<powerToGetVoice) {
            System.out.println("No power to get voice, please feed the animal.");
        }
        else {
            System.out.println("This animal says: " + voiceAnimal.voice());
            animal.setFullness(animal.getFullness()-powerToGetVoice);
        }
    }
}
