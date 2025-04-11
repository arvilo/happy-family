package az.edu.turing.happyfamily;

import java.util.HashMap;
import java.util.HashSet;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static void showFamily(
            String name,
            Human mother,
            Human father,
            Human child,
            Pet pet
    ) {
        System.out.printf(
                "%n%s%nMother: %s%nFather: %s%nChild: %s%nPet: %s%n",
                name,
                mother.toString(),
                father.toString(),
                child.toString(),
                pet.toString()
        );
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















 class FileReader {

    public static void readJavaFilesInFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles((dir, name) -> name.endsWith(".java"));

        if (listOfFiles != null && listOfFiles.length > 0) {
            for (File file : listOfFiles) {
                try {
                    System.out.println("Reading file: " + file.getName());
                    Files.lines(Paths.get(file.getAbsolutePath())).forEach(System.out::println);
                    System.out.println("\n-----------------------------\n");
                } catch (IOException e) {
                    System.err.println("Error reading file " + file.getName() + ": " + e.getMessage());
                }
            }
        } else {
            System.out.println("No .java files found in the directory.");
        }
    }

    public static void main(String[] args) {
        // Verilən folder yolunu buraya əlavə edin

        String folderPath = "src/main/java/az/edu/turing/happyfamily/controller";
        readJavaFilesInFolder(folderPath);
    }
 }