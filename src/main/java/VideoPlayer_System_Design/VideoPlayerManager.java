package VideoPlayer_System_Design;

import VideoPlayer_System_Design.VideoPlayer.VideoPlayer;
import VideoPlayer_System_Design.Videos.Video;
import VideoPlayer_System_Design.Videos.VideoStatus;

import java.util.List;

public class VideoPlayerManager implements VideoPlayerFunctions{

    public VideoPlayer videoPlayer;

    public VideoPlayerManager(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }


    @Override
    public List<Video> addVideoToVideoPlayer(Video video) {
        videoPlayer.videos.add(video);
        return videoPlayer.videos;
    }

    @Override
    public List<Video> addVideoToWatchLater(Video video) {
        if(videoPlayer.videos.contains(video))
        {
            if(!videoPlayer.watchLater.contains(video))
            {
                videoPlayer.watchLater.add(video);
            }
            else {
                System.out.println("Video already exists");
            }
        }
        else {
            System.out.println("No such video found");
        }
        return videoPlayer.watchLater;
    }

    @Override
    public Video playVideo(Video video) {
        if(videoPlayer.videos.contains(video))
        {
            video.videoStatus = VideoStatus.PLAYING;
            System.out.println("Playing Video" + video);
            return video;
        }
        else
        {
            System.out.println("No such video found");
            return null;
        }
    }

    @Override
    public Video pauseVideo(Video video) {
        if(videoPlayer.videos.contains(video) && video.videoStatus == VideoStatus.PLAYING)
        {
            video.videoStatus = VideoStatus.PAUSED;
            System.out.println("Playing Video" + video);
            return video;
        }
        else
        {
            System.out.println("No such video found");
            return null;
        }
    }


    @Override
    public List<Video> downloadVideo(Video video) {
        if(videoPlayer.videos.contains(video))
        {
            if(!videoPlayer.downloads.contains(video))
            {
                videoPlayer.downloads.add(video);
                video.isDownloaded = true;
            }
            else {
                System.out.println("Video is already downloaded");
            }
        }
        else {
            System.out.println("No such video found");
        }
        return videoPlayer.downloads;
    }

    @Override
    public List<Video> removeDownloads(Video video) {

        if(videoPlayer.videos.contains(video))
        {
            if(videoPlayer.downloads.contains(video))
            {
                videoPlayer.downloads.remove(video);
                video.isDownloaded = false;
            }
            else {
                System.out.println("Video is already downloaded");
            }
        }
        else {
            System.out.println("No such video found");}
        return videoPlayer.downloads;

    }
}
