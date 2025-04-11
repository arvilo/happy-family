package az.edu.turing.happyfamily.controller;

import az.edu.turing.happyfamily.Family;
import az.edu.turing.happyfamily.Human;
import az.edu.turing.happyfamily.Man;
import az.edu.turing.happyfamily.Pet;
import az.edu.turing.happyfamily.Woman;
import az.edu.turing.happyfamily.service.FamilyService;

import java.util.List;

public class FamilyController {

    private final FamilyService familyService;

    public FamilyController(FamilyService service) {
        this.familyService = service;
    }

    public List<Family> getAllFamilies() {

        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count) {

        return familyService.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan(int count) {

        return familyService.getFamiliesLessThan(count);
    }

    public int countFamiliesWithMemberNumber(int count) {

        return familyService.countFamiliesWithMemberNumber(count);
    }

    public void createNewFamily(Woman mother, Man father) {
        familyService.createNewFamily(mother, father);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String gender) {

        return familyService.bornChild(family, gender);
    }

    public Family adoptChild(Family family, Human child) {

        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(Family family, int age) {
        familyService.deleteAllChildrenOlderThen(family, age);
    }

    public int count() {

        return familyService.count();
    }

    public Family getFamilyById(int index) {

        return familyService.getFamilyById(index);
    }

    public List<Pet> getPets(Family family) {

        return familyService.getPets(family);
    }

    public void addPet(int familyIndex, Pet pet) {
        familyService.addPet(familyIndex, pet);
    }
}
