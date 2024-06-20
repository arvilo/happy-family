package az.edu.turing.happyfamily;

public class Main {
    public static void showFamily(String name, Human mother, Human father
            , Human child, Pet pet) {
        System.out.println("\n" + name + "\nMother: " + mother + "\nFather: " + father
                + "\nChild: " + child + "\nPet: " + pet + "\n");
    }

    public static void main(String[] args) {
        String[] task1 = {"Bazar e","ssss"};
        String[] task2 = {"Bazar","ssdsddssss"};
        String[][] tasks = {task1,task2};

        Human human =  new Human();
        human.setSchedule(tasks);

        System.out.println(human);
    }
}