package Inventory_Management_System_Design;

public class Group {

    String groupName;
    int noOfProductsInGroup;

    public Group(String groupName) {
        this.groupName = groupName;
        this.noOfProductsInGroup = 0;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", noOfProductsInGroup=" + noOfProductsInGroup +
                '}';
    }
}
