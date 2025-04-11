package az.edu.turing.happyfamily;

import java.util.HashMap;

public final class Woman
        extends Human {

    public Woman(
            String name,
            String surname,
            int year,
            int iq,
            HashMap<DayOfWeek, String> schedule
    ) {
        super(name, surname, year, iq, schedule);
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman() {
    }

    public void greetPet() {
        System.out.println("Hello, my sweet little buddy! How have you been?");
    }

    public void makeup() {
        System.out.println("Make up");
    }
}
