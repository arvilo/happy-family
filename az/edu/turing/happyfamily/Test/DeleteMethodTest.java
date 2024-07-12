package az.edu.turing.happyfamily.Test;

import az.edu.turing.happyfamily.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteMethodTest {

    Family family;

    @BeforeEach
    public void setUp() {
        Man father = new Man("Javid",
                "Aliyev",
                1992,
                94,
                null);

        Woman mother = new Woman("Bahar",
                "Aliyeva",
                1995,
                90,
                null);


        Human child1 = new Human("Vusal",
                "Aliyev",
                2016,
                56,
                null);

        Human child2 = new Human("Vugar",
                "Aliyev",
                2017,
                52,
                null);

        Human child3 = new Human("Vusala",
                "Aliyeva",
                2017,
                52,
                null);

        family = new Family(mother, father);
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
    }

    @Test
    public void testDeleteMethod() {
        System.out.println(family.getChildren());
        assertFalse(family.deleteChild(10),
                family.getChildren().toString());
        System.out.println(family.getChildren());
    }
}
