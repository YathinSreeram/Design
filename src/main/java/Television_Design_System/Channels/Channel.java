package Television_Design_System.Channels;

public abstract class Channel {

    public String channelName;
    public int channelNo;

    public Channel(String channelName, int channelNo) {
        this.channelName = channelName;
        this.channelNo = channelNo;
    }
}
