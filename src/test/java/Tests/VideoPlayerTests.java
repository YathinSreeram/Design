package Tests;

import VideoPlayer_System_Design.*;
import VideoPlayer_System_Design.VideoPlayer.MXPlayer;
import VideoPlayer_System_Design.VideoPlayer.VideoPlayer;
import VideoPlayer_System_Design.Videos.Documentary;
import VideoPlayer_System_Design.Videos.Movie;
import VideoPlayer_System_Design.Videos.Video;
import VideoPlayer_System_Design.Videos.VideoStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoPlayerTests {

    public VideoPlayer mxplayer;
    public   VideoPlayerManager videoPlayerManager;

    public Video movie1;
    public   Video movie2;
    public   Video documentary1;
    public   Video documentary2;


    @BeforeEach
    public void setUp()
    {
        mxplayer = new MXPlayer("MX Player");
        videoPlayerManager = new VideoPlayerManager(mxplayer);

        movie1 = new Movie("Inception", "A mind-bending thriller about dream invasion.", 2.5);
        movie2 = new Movie("The Matrix", "A hacker discovers the reality is a simulation.", 2.0);
        documentary1 = new Documentary("Planet Earth", "A documentary about wildlife across the globe.", 1.8);
        documentary2 = new Documentary("Cosmos", "Exploring the universe and the human quest for knowledge.", 2.2);

    }

    @Test
    public void addVideoTest()
    {
        assertEquals(1, videoPlayerManager.addVideoToVideoPlayer(movie1).size());
    }

    @Test
    public void addVideoToWatchLaterTest()
    {
        mxplayer.videos.add(movie1);
        assertEquals(1, videoPlayerManager.addVideoToWatchLater(movie1).size());
    }

    @Test
    public void playVideoTest()
    {
        mxplayer.videos.add(movie1);
        assertEquals(VideoStatus.PLAYING, videoPlayerManager.playVideo(movie1).videoStatus);
    }

    @Test
    public void pauseVideoTest()
    {
        mxplayer.videos.add(movie1);
        videoPlayerManager.playVideo(movie1);
        assertEquals(VideoStatus.PAUSED, videoPlayerManager.pauseVideo(movie1).videoStatus);
    }

    @Test
    public void downloadVideoTest()
    {
        mxplayer.videos.add(movie1);
        assertEquals(1, videoPlayerManager.downloadVideo(movie1).size());
    }

    @Test
    public void removeDownloadsTest()
    {
        mxplayer.videos.add(movie1);
        videoPlayerManager.downloadVideo(movie1);
        assertEquals(0, videoPlayerManager.removeDownloads(movie1).size());
    }
}
