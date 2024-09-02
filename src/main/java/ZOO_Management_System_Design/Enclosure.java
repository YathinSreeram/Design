package ZOO_Management_System_Design;
import ZOO_Management_System_Design.Animals.Animal;


public class Enclosure {
    public int id;
    public Animal animal;

    public Enclosure(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

