package ZOO_Management_System_Design.Animals;
import ZOO_Management_System_Design.FeedSchedule;

public abstract class Animal {
    private String name;
    private String species;
    private int age;
    private String diet;
    private FeedSchedule feedSchedule;

    public Animal(String name, String species, int age, String diet, FeedSchedule feedSchedule) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.diet = diet;
        this.feedSchedule = feedSchedule;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getDiet() {
        return diet;
    }

    public FeedSchedule getFeedSchedule() {
        return feedSchedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", diet='" + diet + '\'' +
                ", feedSchedule=" + feedSchedule +
                '}';
    }

    public void setFeedSchedule(FeedSchedule feedSchedule) {
        this.feedSchedule = feedSchedule;
    }

    public abstract void makeSound();
}






