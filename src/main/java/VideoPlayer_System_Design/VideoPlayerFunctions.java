package VideoPlayer_System_Design;

import VideoPlayer_System_Design.Videos.Video;

import java.util.List;

public interface VideoPlayerFunctions {

    List<Video> addVideoToVideoPlayer(Video video);
    List<Video> addVideoToWatchLater(Video video);
    Video playVideo(Video video);
    Video pauseVideo(Video video);
    List<Video> downloadVideo(Video video);
    List<Video> removeDownloads(Video video);

}
