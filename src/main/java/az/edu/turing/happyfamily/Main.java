package az.edu.turing.happyfamily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void showFamily(String name, Human mother, Human father
            , Human child, Pet pet) {
        System.out.println("\n" + name + "\nMother: " + mother + "\nFather: " + father
                + "\nChild: " + child + "\nPet: " + pet + "\n");
    }

    public static void main(String[] args) {

        HashMap<DayOfWeek, String> fatherSchedule = new HashMap<>();
        fatherSchedule.put(DayOfWeek.MONDAY, "Wake up, breakfast, and morning routine");
        fatherSchedule.put(DayOfWeek.TUESDAY, "Lunch break");
        fatherSchedule.put(DayOfWeek.WEDNESDAY, "Exercise");
        fatherSchedule.put(DayOfWeek.THURSDAY, "Work");
        fatherSchedule.put(DayOfWeek.FRIDAY, "Wind down and prepare for bed");
        fatherSchedule.put(DayOfWeek.SATURDAY, "Strength Training");
        fatherSchedule.put(DayOfWeek.SUNDAY, "Yoga/Pilates");

        Man father = new Man("Javid",
                "Aliyev",
                1992,
                94,
                fatherSchedule);

        HashMap<DayOfWeek, String> motherSchedule = new HashMap<>();
        motherSchedule.put(DayOfWeek.MONDAY, "Lunch break");
        motherSchedule.put(DayOfWeek.TUESDAY, "Exercise");
        motherSchedule.put(DayOfWeek.WEDNESDAY, "Lunch break");
        motherSchedule.put(DayOfWeek.THURSDAY, "Work");
        motherSchedule.put(DayOfWeek.FRIDAY, "Study");
        motherSchedule.put(DayOfWeek.SATURDAY, "Strength Training");
        motherSchedule.put(DayOfWeek.SUNDAY, "Yoga/Pilates");

        Woman mother = new Woman("Bahar",
                "Aliyeva",
                1995,
                90,
                motherSchedule);

        Family family = new Family(mother, father);

        HashMap<DayOfWeek, String> child1Schedule = new HashMap<>();
        child1Schedule.put(DayOfWeek.WEDNESDAY, "Study");

        Human child1 = new Human("Vusal",
                "Aliyev",
                2016,
                56,
                child1Schedule);

        HashMap<DayOfWeek, String> child2Schedule = new HashMap<>();
        child2Schedule.put(DayOfWeek.THURSDAY, "Dinner");

        Human child2 = new Human("Vugar",
                "Aliyev",
                2017,
                52,
                child2Schedule);

        HashMap<DayOfWeek, String> child3Schedule = new HashMap<>();
        child3Schedule.put(DayOfWeek.SUNDAY, "Work");


        Human child3 = new Woman("Vusala",
                "Aliyeva",
                2017,
                52,
                child3Schedule);

        System.out.println(family);
        System.out.println("\nAdding child1...");
        family.addChild(child1);
        System.out.println(family);
        System.out.println("\nAdding child2...");
        family.addChild(child2);
        System.out.println(family);
        System.out.println("\nAdding child3...");
        family.addChild(child3);
        System.out.println(family);

        HashSet<String> petHabits = new HashSet<>();
        petHabits.add("human biting");
        petHabits.add("sleeping");

        Pet pet = new DomesticCat("Kotlet",
                0,
                2,
                petHabits);

        System.out.println("\nSetting pet");
        HashSet<Pet> pets = family.getPet();
        pets.add(pet);
        family.setPet(pets);
        System.out.println(family);
    }
}