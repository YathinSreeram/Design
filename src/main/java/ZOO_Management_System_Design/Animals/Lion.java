package ZOO_Management_System_Design.Animals;

public class Lion extends Animal {

    public Lion(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("LION ROARS!!");
    }
}
