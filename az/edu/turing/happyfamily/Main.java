package az.edu.turing.happyfamily;

import az.edu.turing.happyfamily.Test.DeleteMethodTest;

public class Main {
    public static void showFamily(String name, Human mother, Human father
            , Human child, Pet pet) {
        System.out.println("\n" + name + "\nMother: " + mother + "\nFather: " + father
                + "\nChild: " + child + "\nPet: " + pet + "\n");
    }

    public static void main(String[] args) {

        String[][] fatherSchedule = new String[10][2];
        fatherSchedule[0][0] = DayOfWeek.MONDAY.name();
        fatherSchedule[0][1] = "Wake up, breakfast, and morning routine";

        fatherSchedule[1][0] = DayOfWeek.MONDAY.name();
        fatherSchedule[1][1] = "Study";

        fatherSchedule[2][0] = DayOfWeek.TUESDAY.name();
        fatherSchedule[2][1] = "Lunch break";

        fatherSchedule[3][0] = DayOfWeek.WEDNESDAY.name();
        fatherSchedule[3][1] = "Exercise";

        fatherSchedule[4][0] = DayOfWeek.WEDNESDAY.name();
        fatherSchedule[4][1] = "Dinner";

        fatherSchedule[5][0] = DayOfWeek.THURSDAY.name();
        fatherSchedule[5][1] = "Personal projects/Leisure activities";

        fatherSchedule[6][0] = DayOfWeek.FRIDAY.name();
        fatherSchedule[6][1] = "Wind down and prepare for bed";

        fatherSchedule[7][0] = DayOfWeek.SATURDAY.name();
        fatherSchedule[7][1] = "Strength Training";

        fatherSchedule[8][0] = DayOfWeek.SUNDAY.name();
        fatherSchedule[8][1] = "Yoga/Pilates";

        fatherSchedule[9][0] = DayOfWeek.WEDNESDAY.name();
        fatherSchedule[9][1] = "Work";

        Human father = new Human("Javid",
                "Aliyev",
                1992,
                94,
                fatherSchedule);

        String[][] motherSchedule = new String[10][2];
        motherSchedule[0][0] = DayOfWeek.MONDAY.name();
        motherSchedule[0][1] = "Lunch break";

        motherSchedule[1][0] = DayOfWeek.MONDAY.name();
        motherSchedule[1][1] = "Exercise";

        motherSchedule[2][0] = DayOfWeek.TUESDAY.name();
        motherSchedule[2][1] = "Lunch break";

        motherSchedule[3][0] = DayOfWeek.WEDNESDAY.name();
        motherSchedule[3][1] = "Study";

        motherSchedule[4][0] = DayOfWeek.WEDNESDAY.name();
        motherSchedule[4][1] = "Personal projects/Leisure activities";

        motherSchedule[5][0] = DayOfWeek.THURSDAY.name();
        motherSchedule[5][1] = "Dinner";

        motherSchedule[6][0] = DayOfWeek.FRIDAY.name();
        motherSchedule[6][1] = "Strength Training";

        motherSchedule[7][0] = DayOfWeek.SATURDAY.name();
        motherSchedule[7][1] = "Wind down and prepare for bed";

        motherSchedule[8][0] = DayOfWeek.SUNDAY.name();
        motherSchedule[8][1] = "Wake up, breakfast, and morning routine";

        motherSchedule[9][0] = DayOfWeek.WEDNESDAY.name();
        motherSchedule[9][1] = "Yoga";

        Human mother = new Human("Bahar",
                "Aliyeva",
                1995,
                90,
                motherSchedule);

        Family family = new Family(mother, father);

        String[][] child1Schedule = new String[1][2];

        child1Schedule[0][0] = DayOfWeek.WEDNESDAY.name();
        child1Schedule[0][1] = "Study";

        Human child1 = new Human("Vusal",
                "Aliyev",
                2016,
                56,
                child1Schedule);

        String[][] child2Schedule = new String[1][2];

        child2Schedule[0][0] = DayOfWeek.THURSDAY.name();
        child2Schedule[0][1] = "Dinner";

        Human child2 = new Human("Vugar",
                "Aliyev",
                2017,
                52,
                child2Schedule);

        String[][] child3Schedule = new String[1][2];

        child3Schedule[0][0] = DayOfWeek.SUNDAY.name();
        child3Schedule[0][1] = "Work";

        Human child3 = new Human("Vusala",
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

        String[] petHabits = new String[2];
        petHabits[0] = "human biting";
        petHabits[1] = "sleeping";

        Pet pet = new Pet(Species.CAT,
                "Kotlet",
                0,
                2,
                petHabits);

        System.out.println("\nSetting pet");
        family.setPet(pet);
        System.out.println(family);



    }
}