package ZOO_Management_System_Design.Animals;

public abstract class Animal {
    public String name;
    public String species;
    public int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void makeSound();
}
