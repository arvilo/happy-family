package az.edu.turing.happyfamily;

import java.util.Arrays;

public class Human {
    // remove irrelevant designers and methods
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family; // hem family-de human tipinde deyisen var hem de human-da family tipinde deyisen bu problem olmaz?

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year) {
        this(name, surname, year, 80, null);
    }

    public Human() {
        this("", "", 1990);
    }

    public String getFullName() {
        return String.format("%s %s", name, surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1850) this.year = year;
        else System.out.println("Invalid year");
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if (iq >= 0 && iq <= 100) this.iq = iq;
        else System.out.println("iq should be in the range of 0-100");
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    private String showSchedule() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0;i < schedule.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(Arrays.toString(schedule[i]));
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}"
                , name, surname, year,iq, Arrays.toString(schedule));
    }
}
