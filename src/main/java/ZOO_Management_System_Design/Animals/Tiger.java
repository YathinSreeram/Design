package ZOO_Management_System_Design.Animals;

public class Tiger extends Animal {

    public Tiger(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("TIGER ROARS");
    }
}