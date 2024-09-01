package Tests;

import ZOO_Management_System_Design.Animals.Animal;
import ZOO_Management_System_Design.Animals.Lion;
import ZOO_Management_System_Design.Animals.Tiger;
import ZOO_Management_System_Design.Enclosure;
import ZOO_Management_System_Design.FeedSchedule;
import ZOO_Management_System_Design.ManagerClasses.EnclosureManager;
import ZOO_Management_System_Design.ManagerClasses.ZooManager;
import ZOO_Management_System_Design.Zoo;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ZooManagementTest {

    private ZooManager zooManager;
    private EnclosureManager enclosureManager;

    Zoo zoo;
    Animal lion;
    Animal tiger;

    @BeforeEach
    public void setUp() {

        zoo = new Zoo();
        zooManager = new ZooManager(zoo);
        enclosureManager = new EnclosureManager(zoo.enclosures);

    }

    @Test
    public void testAddAndRemoveAnimal() {
        Zoo zoo = new Zoo();
        zooManager = new ZooManager(zoo);
        enclosureManager = new EnclosureManager(zoo.enclosures);

        Enclosure enclosure1 = new Enclosure(1);
        Enclosure enclosure2 = new Enclosure(2);
        List<Enclosure> lst = new ArrayList<>();
        lst.add(enclosure1);
        lst.add(enclosure2);
        zoo.setEnclosures(lst);
        zooManager.addEnclosure(enclosure1);
        zooManager.addEnclosure(enclosure2);

        FeedSchedule tigerFeedSchedule = new FeedSchedule("10:00 AM", "Chicken");
        FeedSchedule lionFeedSchedule = new FeedSchedule("08:00 AM", "Meat");
        // Create animals
        lion = new Lion("Simba", "Asiatic lion" ,5, "Carnivore", lionFeedSchedule);
        tiger = new Tiger("Sheru", "Bengal Tiger",3, "Carnivore", tigerFeedSchedule);

        // Test addAnimal
        zooManager.addAnimalToZoo(lion);

        assertEquals(1, enclosureManager.noOfEnclosuresOccupied());

    }

//    @Test
//    public void testListAllAnimals() {
//        // Create animals
//        FeedSchedule lionFeedSchedule = new FeedSchedule("08:00 AM", "Meat");
//        // Create animals
//        Lion lion = new Lion("Simba", "Asiatic lion" ,5, "Carnivore", lionFeedSchedule);
//
//        // Add animal
//
//    }
//
//    @Test
//    public void testAddAndRemoveEnclosure() {
//        // Create enclosures
//        Enclosure lionEnclosure = new Enclosure(1);
//        Enclosure tigerEnclosure = new Enclosure(2);
//
//        // Test addEnclosure
//
//
//    }
//
//    @Test
//    public void testListAllEnclosures() {
//        // Create enclosures
//        Enclosure lionEnclosure = new Enclosure("Lion's Den", "Savannah");
//
//
//    }


}