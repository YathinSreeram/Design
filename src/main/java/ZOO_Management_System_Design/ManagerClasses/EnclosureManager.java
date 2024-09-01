package ZOO_Management_System_Design.ManagerClasses;

import ZOO_Management_System_Design.Animals.Animal;
import ZOO_Management_System_Design.Enclosure;
import java.util.ArrayList;
import java.util.List;


public class EnclosureManager {
    private List<Enclosure> enclosures ;

    public EnclosureManager(List<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }

    public void addAnimalToEnclosure(Animal animal)
    {
        for (Enclosure enclosure : enclosures)
        {
            if(enclosure.getAnimal() == null)
            {
                enclosure.setAnimal(animal);
            }
        }
    }

    public void removeAnimalFromEnclosure(Animal animal)
    {
        for (Enclosure enclosure : enclosures)
        {
            if(enclosure.getAnimal() == animal)
            {
                enclosure.setAnimal(null);
            }
        }
    }

    public int noOfEnclosuresOccupied()
    {
        int count = 0;
        for(Enclosure enclosure : enclosures)
        {
            if(enclosure.getAnimal() != null)
            {
                count++;
            }
        }
        return count;
    }
}
