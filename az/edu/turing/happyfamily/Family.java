package az.edu.turing.happyfamily;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Family(Human mother, Human father) {
        if (mother != null && father != null) {
            this.mother = mother;
            this.father = father;
            children = new Human[0];
        } else System.out.println("Mother or father can't be null");
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        Human[] children = new Human[this.children.length + 1];
        for (int i = 0;i < this.children.length;i++)
            children[i] = this.children[i];
        children[children.length - 1] = child;
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index > children.length - 1) {

            return false;
        }
        else {
            Human[] children = new Human[this.children.length - 1];
            int j = 0;

            for (int i = 0; i < this.children.length;i++) {
                if (i != index) {
                    children[j++] = this.children[i];
                }
            }

            this.children = children;

            return true;
        }
    }

    private String getChildrenInfo() {
        StringBuilder text = new StringBuilder();
        text.append("\n");
        for (Human child: children) {
            text.append(String.format("%s\n",child.getFullName()));
        }
        return text.toString();
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        return String.format("Mother: %s\nFather: %s\nChildren:%sPet: %s",
                mother.getFullName(),father.getFamily()
                ,getChildrenInfo(),pet.getNickname());
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
}
