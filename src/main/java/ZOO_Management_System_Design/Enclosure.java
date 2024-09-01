package ZOO_Management_System_Design;
import ZOO_Management_System_Design.Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private int id;
    private Animal animal;

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

