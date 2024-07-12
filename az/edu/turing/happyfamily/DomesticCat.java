package az.edu.turing.happyfamily;

public class DomesticCat
        extends Pet {

    public DomesticCat(String nickname,
                       int age,
                       int trickLevel,
                       String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat() {
        super();
    }

    @Override
    public void respond() {
        System.out.println("I am Cat. My name is " + getNickname() + ".");
    }

    @Override
    public void foul() {
        System.out.println("Oops! Time to bury this mess.");
    }
}
