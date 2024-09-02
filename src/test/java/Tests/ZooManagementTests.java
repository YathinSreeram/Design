package Tests;

import ZOO_Management_System_Design.Animals.Animal;
import ZOO_Management_System_Design.Animals.Lion;
import ZOO_Management_System_Design.Animals.Tiger;
import ZOO_Management_System_Design.Enclosure;
import ZOO_Management_System_Design.ZOOManager;
import ZOO_Management_System_Design.Zoo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZooManagementTests {

    public Zoo zoo;
    public ZOOManager zooManager;
    public Animal animal1;
    public Animal animal2;
    public Enclosure enclosure1;
    public Enclosure enclosure2;

    @BeforeEach
    public void setUp()
    {
        zoo = new Zoo();
        animal1 = new Lion("Lion", "Asian Lion", 14);
        animal2 = new Tiger("Tiger", "Bengal Tiger", 10);

        enclosure1 = new Enclosure(1);
        enclosure2 = new Enclosure(2);
        zooManager = new ZOOManager(zoo);
    }

    @Test
    public void addAndRemoveEnclosureTest()
    {
        zoo.enclosures.add(enclosure1);
        assertEquals(2, zooManager.addEnclosure(enclosure2).size());
        assertEquals(1, zooManager.removeEnclosure(enclosure2).size());
    }

    @Test
    public void addAndRemoveAnimalTest()
    {
        zoo.enclosures.add(enclosure1);
        zoo.enclosures.add(enclosure2);
        assertTrue(zooManager.addAnimalToZoo(animal2));
        assertTrue(zooManager.removeAnimalFromZoo(animal2));
    }
}
