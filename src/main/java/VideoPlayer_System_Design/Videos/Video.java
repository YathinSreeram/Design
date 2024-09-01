package VideoPlayer_System_Design.Videos;

public abstract class Video {

    public String videoName;
    public String videoDescription;
    public double videoSizeInGB;
    public VideoStatus videoStatus;
    public boolean isDownloaded;

    public Video(String videoName, String videoDescription, double videoSizeInGB) {
        this.videoName = videoName;
        this.videoDescription = videoDescription;
        this.videoSizeInGB = videoSizeInGB;
        this.videoStatus = VideoStatus.UNSELECTED;
        this.isDownloaded = false;
    }
}
