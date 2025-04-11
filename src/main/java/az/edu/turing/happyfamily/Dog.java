package az.edu.turing.happyfamily;

import java.util.HashSet;

public class Dog
        extends Pet {

    public Dog(
            String nickname,
            int age,
            int trickLevel,
            HashSet<String> habits
    ) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOG);
    }

    public Dog(String nickname) {
        super(nickname);
    }

    public Dog() {
        super();
    }

    @Override
    public void respond() {
        System.out.printf(
                "Hey there, everyone! I'm %s, your friendly neighborhood dog.%n",
                getNickname()
        );
    }

    @Override
    public void foul() {
        System.out.println("Uh-oh! Better hide this bone fast!");
    }
}
