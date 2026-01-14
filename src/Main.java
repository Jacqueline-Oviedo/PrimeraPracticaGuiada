public class Main {

    public static void main(String[] args) {
        /*
         * int[] numbers = { 10, 20, 30, 40, 50 };
         * 
         * String[] fruits = new String[3];
         * 
         * System.out.println(numbers[2]);
         * System.out.println(fruits[2]);
         */

        /*
         * for (Pet pet : p.getPets()) {
         * 
         * System.out.println(pet.getPetName());
         * }
         */

        /*
         * Prueba
         * for (int i = 0; i <= p.getPets().length; i++) {
         * System.err.println(p.getPets()[i].getPetName());
         * 
         * }
         */
        Person p = new Person("Juan", 10, new PetManager(2));

        // agregar
        Pet pet1 = new Pet("Goldie", "Fish");
        Pet p2 = new Pet("Perrito", "Golden");

        if (p.addPet(pet1)) {
            IOManager.printMessage("Pet add susccesfully");
            IOManager.printMessage(pet1.getPetName());
        } else {
            IOManager.printMessage("Fail to add pet");
        }

        // Actualizar
        if (p.updatePet(p2, 0)) {
            IOManager.printMessage("Pet changed");

        } else {
            IOManager.printMessage("Error");
        }

        // consultar
        if (p.getPets().length == 0) {
            IOManager.printMessage("No pets found");

        } else {
            for (Pet pet : p.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        // Eliminar

        if (p.removePet(p2)) {
            IOManager.printMessage("Pet remove succsesfully");

        } else {
            IOManager.printMessage("Fail to remove pet");
        }

    }
}