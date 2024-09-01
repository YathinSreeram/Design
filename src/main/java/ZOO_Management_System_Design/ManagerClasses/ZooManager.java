package ZOO_Management_System_Design.ManagerClasses;

import ZOO_Management_System_Design.Animals.Animal;
import ZOO_Management_System_Design.Enclosure;
import ZOO_Management_System_Design.Zoo;

public class ZooManager {

    Zoo zoo;

    public ZooManager(Zoo zoo) {
        this.zoo = zoo;
    }

    public void addEnclosure(Enclosure e)
    {
        zoo.enclosures.add(e);
    }

    public void removeEnclosure(Enclosure e)
    {
        zoo.enclosures.remove(e);
    }

    public void addAnimalToZoo(Animal animal)
    {
        EnclosureManager enclosureManager = new EnclosureManager(zoo.enclosures);
        enclosureManager.addAnimalToEnclosure(animal);
    }

    public void removeAnimalFromZoo(Animal animal)
    {

        EnclosureManager enclosureManager = new EnclosureManager(zoo.enclosures);
        enclosureManager.removeAnimalFromEnclosure(animal);

    }

    public void showZooInfo() {
        System.out.println("Zoo has the following enclosures:");
        for (Enclosure enclosure : zoo.enclosures) {
            System.out.println(" - " + enclosure.getId());
            System.out.println(" - " + enclosure.getAnimal().toString());
        }
    }



}
