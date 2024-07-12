package az.edu.turing.happyfamily;

import java.util.HashSet;

public class RoboCat
        extends Pet {

    public RoboCat(String nickname,
                   int age,
                   int trickLevel,
                   HashSet<String> habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat() {
        super();
    }

    @Override
    public void respond() {
        System.out.println("I am " +
                getNickname() +
                ", the robotic cat. I excel in problem-solving " +
                "and assisting my friends with any task.");
    }
}
