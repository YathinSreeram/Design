package Television_Design_System.Televisions;

import Television_Design_System.Channels.Channel;

import java.util.ArrayList;
import java.util.List;

public abstract class Television {
    public String name;
    public String brand;
    public List<Channel> channelList;
    public TelevisionStatus televisionStatus;

    public Television(String brand, String name) {
        this.brand = brand;
        this.name = name;
        channelList = new ArrayList<>();
        televisionStatus = TelevisionStatus.OFF;
    }

}
