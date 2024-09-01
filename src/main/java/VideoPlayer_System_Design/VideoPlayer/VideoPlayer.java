package VideoPlayer_System_Design.VideoPlayer;

import VideoPlayer_System_Design.Videos.Video;

import java.util.ArrayList;
import java.util.List;

public abstract class VideoPlayer {

    public String platformName;
    public List<Video> videos;
    public List<Video> downloads;
    public List<Video> watchLater;

    public VideoPlayer(String platformName) {
        this.platformName = platformName;
        this.videos = new ArrayList<>();
        this.downloads = new ArrayList<>();
        this.watchLater = new ArrayList<>();
    }
}
