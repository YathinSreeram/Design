package ZOO_Management_System_Design;
import ZOO_Management_System_Design.Animals.Animal;
import java.util.List;

public class ZOOManager {

    public Zoo zoo;

    public ZOOManager(Zoo zoo)
    {
        this.zoo = zoo;
    }

    public List<Enclosure> addEnclosure(Enclosure enclosure)
    {
        zoo.enclosures.add(enclosure);
        return zoo.enclosures;
    }

    public List<Enclosure> removeEnclosure(Enclosure enclosure)
    {
        zoo.enclosures.remove(enclosure);
        return zoo.enclosures;
    }

    public boolean addAnimalToZoo(Animal animal)
    {
        for(Enclosure enclosure : this.zoo.enclosures)
        {
            if(enclosure.getAnimal() == null)
            {
                enclosure.setAnimal(animal);
                return true;
            }
        }
        return false;
    }

    public boolean removeAnimalFromZoo(Animal animal)
    {
        for(Enclosure enclosure : this.zoo.enclosures)
        {
            if(enclosure.getAnimal() == animal)
            {
                enclosure.setAnimal(null);
                return true;

            }
        }
        return false;
    }
}
