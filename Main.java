public class Main {
    public static void showFamily(String name,Human mother,Human father
            ,Human child,Pet pet) {
        System.out.println("\n" + name + "\nMother: " + mother + "\nFather: " + father
        + "\nChild: " + child + "\nPet: " + pet + "\n");
    }

    public static void main(String[] args) {

        Human mother1 = new Human("Aysun","Aliyeva"
                ,1978,82,null,null,null,new String[7][2]);
        Human father1 = new Human("Ali","Aliyev",1975);
        Pet pet1 = new Pet("dog","toplan",2,66,new String[1]);
        Human child1 = new Human("Elnur","Aliyev",2010
                ,76,pet1,mother1,father1,new String[7][2]);

        Human mother2 = new Human();
        Human father2 = new Human("Vaqif","Mammadov",1990,null,null);
        Pet pet2 = new Pet();
        Human child2 = new Human("Vusal","Mammadov"
                ,2012,60,pet2,mother2,father2,new String[7][2]);

        Human mother3 = new Human();
        Human father3 = new Human();
        Pet pet3 = new Pet("cat","mestan");
        Human child3 = new Human("Resad","Hasanov",2011,60
                ,pet3,mother3,father3,new String[7][3]);

        showFamily("Family 1",mother1,father1,child1,pet1);
        showFamily("Family 2",mother2,father2,child2,pet2);
        showFamily("Family 3",mother3,father3,child3,pet3);


        System.out.println("Pet 1");
        pet1.eat();
        pet1.respond();
        pet1.foul();


    }
}