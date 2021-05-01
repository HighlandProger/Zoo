package animals;

import food.Food;

public abstract class Animal {

    private String name;
    private int fullness;
    private final String getClassAndName (){
        return this.getClass().getCanonicalName().substring(8) + " " + this.getName();
    }

    public Animal(){}

    public Animal (String name, int fullness){
        this.name = name;
        if (fullness<=0 || fullness>100)
            throw new IllegalArgumentException();
        this.fullness = fullness;
    }

    public String getName() {
        return name;
    }

    public int getFullness() {
        return this.fullness;
    }

    public void setFullness(int fullness) {
        if(fullness>100) {
            System.out.println(getClassAndName() + " is fed up");
            fullness = 100;
        }
        this.fullness = fullness;
    }


    protected abstract boolean checkFood(Food food);

    public void eat(Food food){
        if (checkFood(food)) {
            System.out.println(getClassAndName() + " eats meat.");
            setFullness(getFullness() + food.getCalories());
        }
    }

    protected String getErrorVoiceMessage(){
        System.out.println("No power to getVoice, please feed the animal. Suka!");
        return "Feed me!";
    }

}
