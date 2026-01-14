public class Person {
    private String name;
    private int age;
    private Pet[] pets;
    private PetManager petManager;

    public Person(String name, int age, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;

    } 

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public boolean addPet(Pet pet) {
        return petManager.addPet(pet);

    }

}
