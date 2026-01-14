public class PetManager {
    private int petCont;
    private Pet[] pets;

    public PetManager(int numbersOfPets) {

        this.pets = new Pet[numbersOfPets];

    }

    public boolean addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                petCont++;
                return true;
            }

        }
        return false;
    }

    public boolean removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)) {
                // corre a la izq los elementos posteriores al eliminado

                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                }

                pets[pets.length - 1] = null;
                petCont--;

                return true;
            }
        }

        return false;
    }

    public Pet[] getPets() {
        Pet[] pets = new Pet[this.petCont];

        for (int i = 0; i < this.petCont; i++) {
            pets[i] = this.pets[i];
        }

        return pets;
    }

    public boolean updatePet(Pet pet, int indice) {

        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equals(pets[indice]) && pets[i] != null) {
                pets[i] = pet;
                return true;

            }
        }
        return false;

    }

}
