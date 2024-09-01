package Tests;

import Television_Design_System.*;
import Television_Design_System.Channels.Channel;
import Television_Design_System.Channels.ETV;
import Television_Design_System.Channels.MaaTV;
import Television_Design_System.Televisions.Sony;
import Television_Design_System.Televisions.Television;
import Television_Design_System.Televisions.TelevisionStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTests {

    public Television sony;
    public Channel maaTv;
    public Channel eTV;

    public TelevisionManager televisionManager;

    @BeforeEach
    public void SetUp()
    {

        sony = new Sony("Sony", "Sony Bravia");
        maaTv = new MaaTV("Maa Tv", 101);
        eTV = new ETV("ETV", 102);
        televisionManager = new TelevisionManager(sony);

    }

    @Test
    public void addChannelTest()
    {
        assertEquals(1, televisionManager.addChannel(maaTv).channelList.size());
    }

    @Test
    public void removeChannelTest()
    {
        televisionManager.television.channelList.add(maaTv);
        assertEquals(0, televisionManager.removeChannel(maaTv).channelList.size());

    }

    @Test
    public void switchOnTVTest()
    {
        assertEquals(TelevisionStatus.ON, televisionManager.switchOnTV().televisionStatus);
    }

    @Test
    public void switchOffTVTest()
    {
        assertEquals(TelevisionStatus.OFF, televisionManager.switchOffTV().televisionStatus);
    }
}
