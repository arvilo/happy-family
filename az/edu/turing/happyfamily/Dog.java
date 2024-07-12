package az.edu.turing.happyfamily;

public class Dog
        extends Pet {

    public Dog(String nickname,
               int age,
               int trickLevel,
               String[] habits) {
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
        System.out.println("Hey there, everyone! I'm " +
                getNickname() +
                ", your friendly neighborhood dog.");
    }

    @Override
    public void foul() {
        System.out.println("Uh-oh! Better hide this bone fast!");
    }
}
