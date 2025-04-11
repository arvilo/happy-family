package az.edu.turing.happyfamily.service;

import az.edu.turing.happyfamily.Family;
import az.edu.turing.happyfamily.Human;
import az.edu.turing.happyfamily.Man;
import az.edu.turing.happyfamily.Pet;
import az.edu.turing.happyfamily.Woman;
import az.edu.turing.happyfamily.dao.FamilyDao;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FamilyService {

    private final FamilyDao familyDao;

    public FamilyService(FamilyDao dao) {
        this.familyDao = dao;
    }

    public List<Family> getAllFamilies() {

        return familyDao.getAllFamilies();
    }

    private void displayFamilies(List<Family> families) {
        System.out.print(
                IntStream
                        .range(0, families.size())
                        .mapToObj(index -> String.format(
                                        "Family %d\n%s",
                                        index + 1,
                                        families.get(index).toString()
                                )
                        )
                        .collect(Collectors.joining("\n"))
        );
    }

    public void displayAllFamilies() {
        displayFamilies(getAllFamilies());
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        List<Family> families = getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() > count)
                .collect(Collectors.toList());
        displayFamilies(families);

        return families;
    }

    public List<Family> getFamiliesLessThan(int count) {

        return getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() < count)
                .collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int count) {

        return (int) getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() == count)
                .count();
    }

    public void createNewFamily(Woman mother, Man father) {
        familyDao.saveFamily(new Family(mother, father));
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String gender) {
        Human newChild;
        if (gender.equals("masculine")) {
            newChild = new Man(
                    "Nijat",
                    family.getFather().getSurname(),
                    Year.now().getValue()
            );
        } else if (gender.equals("feminine")) {
            newChild = new Woman(
                    "Nazrin",
                    family.getFather().getSurname(),
                    Year.now().getValue()
            );
        } else {
            throw new RuntimeException(
                    "gender can be masculine or feminine"
            );
        }
        newChild.setFamily(family);
        family.getChildren().add(newChild);

        return family;
    }

    public Family adoptChild(Family family, Human child) {
        child.setFamily(family);
        family.getChildren().add(child);

        return family;
    }

    public void deleteAllChildrenOlderThen(Family family, int age) {
        List<Human> children = family.getChildren();
        IntStream
                .range(0, children.size())
                .filter(index ->
                        Year.now().getValue() - children.get(index).getYear() > age
                )
                .forEach(children::remove);
    }

    public int count() {

        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {

        return familyDao.getFamilyByIndex(index);
    }

    public List<Pet> getPets(Family family) {

        return new ArrayList<>(family.getPet());
    }

    public void addPet(int familyIndex, Pet pet) {
        familyDao
                .getFamilyByIndex(familyIndex)
                .getPet()
                .add(pet);
    }
}
