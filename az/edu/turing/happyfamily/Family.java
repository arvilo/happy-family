package az.edu.turing.happyfamily;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Family {

    private Woman mother;
    private Man father;
    private ArrayList<Human> children;
    private HashSet<Pet> pets;


    public Family(Woman mother, Man father) {
        if (mother != null && father != null) {
            this.mother = mother;
            this.father = father;
            children = new ArrayList<>();
            pets = new HashSet<>();
        } else System.out.println("Mother or father can't be null");
    }

    public Woman getMother() {
        return mother;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
    }

    public Man getFather() {
        return father;
    }

    public void setFather(Man father) {
        this.father = father;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public HashSet<Pet> getPet() {
        return pets;
    }

    public void setPet(HashSet<Pet> pets) {
        this.pets = pets;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index > children.size() - 1) {

            return false;
        } else {
            children.remove(index);

            return true;
        }
    }

    private String getChildrenInfo() {
        StringBuilder text = new StringBuilder();
        text.append("\n");
        for (Human child : children) {
            text.append(String.format("%s\n", child.getFullName()));
        }
        return text.toString();
    }

    public int countFamily() {
        return 2 + children.size();
    }

    @Override
    public String toString() {
        return String.format("Mother: %s\nFather: %s\nChildren:%sPets: %s",
                mother.getFullName(), father.getFullName()
                , getChildrenInfo(), pets.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }

        if (o == null || getClass() != o.getClass()) {

            return false;
        }

        Family family = (Family) o;

        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println(this + "\nObject is removing");
        super.finalize();
    }
}
