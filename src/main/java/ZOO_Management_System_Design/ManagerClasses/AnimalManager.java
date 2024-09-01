//package ZOO_Management_System_Design.ManagerClasses;
//
//import ZOO_Management_System_Design.Animals.Animal;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AnimalManager {
//    private List<Animal> animals;
//
//    public AnimalManager() {
//        this.animals = new ArrayList<>();
//    }
//
//    public void addAnimal(Animal animal) {
//        animals.add(animal);
//        System.out.println("Animal added: " + animal.getName());
//    }
//
//    public void removeAnimal(Animal animal) {
//        animals.remove(animal);
//        System.out.println("Animal removed: " + animal.getName());
//    }
//
//    public void listAllAnimals() {
//        System.out.println("Listing all animals in the zoo:");
//        for (Animal animal : animals) {
//            System.out.println(animal);
//        }
//    }
//
//    public List<Animal> getAnimals() {
//        return animals;
//    }
//}
