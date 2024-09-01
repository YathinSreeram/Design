package ZOO_Management_System_Design;

public class FeedSchedule {
    private String time;
    private String foodType;

    public FeedSchedule(String time, String foodType) {
        this.time = time;
        this.foodType = foodType;
    }

    public String getTime() {
        return time;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getFeedingDetails() {
        return "Feed at " + time + " with " + foodType;
    }
}

