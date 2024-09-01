package ZOO_Management_System_Design.Animals;

import ZOO_Management_System_Design.FeedSchedule;

public class Tiger extends Animal {

    public Tiger(String name, String species, int age, String diet, FeedSchedule feedSchedule) {
        super(name, species, age, diet, feedSchedule);
    }

    @Override
    public void makeSound() {
        System.out.println("TIGER ROARS");
    }
}