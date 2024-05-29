public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species,String nickname,int age,int trickLevel,String[] habits) {
//        bu hissədə validasiya olmalıdır? tutaq ki, trickLeveldə həqiqətən də
//        0-dan 100-ə kimi tam ədəd mənimsədilib mi?
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species,String nickname) {
        this(species,nickname,0,0,null);
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

    @Override
    public String toString() {
//        bunun daha qısa yolu var mı? 41-49 sətrləri
        StringBuilder habits = new StringBuilder();
        habits.append("[");
        boolean comma = false;
        for(String i: this.habits) {
            if (comma) habits.append(",");
            habits.append(i);
            comma = true;
        }
        habits.append("]");

        return "dog{nickname='"+ nickname +"', age=" + age +
                ", trickLevel=" + trickLevel + ", habits=" + habits + "}";
    }
}
