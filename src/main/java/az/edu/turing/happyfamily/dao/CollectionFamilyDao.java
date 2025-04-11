package az.edu.turing.happyfamily.dao;

import az.edu.turing.happyfamily.Family;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CollectionFamilyDao
        implements FamilyDao {

    private final static List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {

        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index >= 0 && index < families.size()) {

            return families.get(index);
        } else {

            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index >= 0 && index < families.size()) {
            families.remove(index);

            return true;
        } else {

            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {

        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        IntStream
                .range(0, families.size())
                .filter(index -> families.get(index).equals(family))
                .mapToObj(families::get)
                .findFirst()
                .ifPresentOrElse(
                        familyFromList -> {
                            familyFromList.setMother(family.getMother());
                            familyFromList.setFather(family.getFather());
                            familyFromList.setPet(family.getPet());
                            familyFromList.setChildren(family.getChildren());
                        },
                        () -> families.add(family)
                );
    }
}
