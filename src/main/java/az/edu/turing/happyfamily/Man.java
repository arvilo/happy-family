package az.edu.turing.happyfamily;

import java.util.HashMap;

public final class Man
        extends Human {

    public Man(String name, String surname, int year, int iq, HashMap<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man() {
    }

    public void greetPet() {
        System.out.println("Hey there, champ! Ready for some fun today?");
    }

    public void repairCar() {
        System.out.println("I am repairing car");
    }
}
