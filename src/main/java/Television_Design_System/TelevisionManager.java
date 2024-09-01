package Television_Design_System;

import Television_Design_System.Channels.Channel;
import Television_Design_System.Televisions.Television;
import Television_Design_System.Televisions.TelevisionStatus;

public class TelevisionManager {
    public Television television;

    public TelevisionManager(Television television) {
        this.television = television;
    }

    public Television addChannel(Channel channel)
    {
        television.channelList.add(channel);
        return television;
    }

    public Television removeChannel(Channel channel)
    {
        television.channelList.remove(channel);
        return television;
    }

    public Television switchOnTV()
    {
        if(television.televisionStatus== TelevisionStatus.OFF)
        {
            television.televisionStatus = TelevisionStatus.ON;
        }
        else {
            System.out.println("ALREADY ON");
        }
        return television;
    }

    public Television switchOffTV()
    {
        if(television.televisionStatus== TelevisionStatus.ON)
        {
            television.televisionStatus = TelevisionStatus.OFF;
        }
        else {
            System.out.println("ALREADY OFF");
        }
        return television;
    }
}
