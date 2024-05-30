public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name,String surname,int year,int iq,Pet pet,Human mother,
                 Human father,String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name,String surname,int year,Human father,Human mother) {
        this(name,surname,year,80,null,mother,father,null);
    }

    public Human(String name,String surname,int year) {
        this(name,surname,year,null,null);
    }

    public Human() {
        this("","",1990);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {

        String motherName,motherSurname,fatherName,fatherSurname;

        if (mother == null) {
            motherName = "";
            motherSurname = "";
        }
        else {
            motherName = mother.getName();
            motherSurname = mother.getSurname();
        }

        if (father == null) {
            fatherName = "";
            fatherSurname = "";
        }
        else {
            fatherName = father.getName();
            fatherSurname = father.getSurname();
        }

        return "Human{name='" + name + "', surname='" + surname
                +"', year=" + year +", iq=" + iq +", mother="
                + motherName + " " + motherSurname
                + ", father=" + fatherName + " " + fatherSurname
                + ", pet=" + pet + "}";
    }

}
