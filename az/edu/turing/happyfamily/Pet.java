package az.edu.turing.happyfamily;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species,String nickname,int age,int trickLevel,String[] habits) {
//        bu hissədə validasiya olmalıdır? tutaq ki, trickLeveldə həqiqətən də
//        0-dan 100-ə kimi tam ədəd mənimsədilib mi?
//        konstruktor da setter istifadə etmək düzgündür?
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species,String nickname) {
        this(species,nickname,0,0,new String[0]);
    }

    public Pet() {
        this("","");
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - " + nickname +". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("age can't be less than zero");
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel >= 0 && trickLevel <= 100) this.trickLevel = trickLevel;
        else System.out.println("tricklevel should be in the range of 0-100");
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",
                species,nickname,age,trickLevel,Arrays.toString(habits));
    }
}
