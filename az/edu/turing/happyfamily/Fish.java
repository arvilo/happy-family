package az.edu.turing.happyfamily;

public class Fish
        extends Pet {

    public Fish(String nickname,
                int age,
                int trickLevel,
                String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.FISH);
    }

    public Fish(String nickname) {
        super(nickname);
    }

    public Fish() {
        super();
    }

    @Override
    public void respond() {
        System.out.println("I am not Fish. I live in aquarium.");
    }

    @Override
    public void foul() {
        System.out.println("Oh no! I need to swim away quickly!");
    }
}
