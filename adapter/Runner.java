package Adapter;

public class Runner {
    public static void main(String[] args) {
        OldMediaPlayer oldPlayer = new AudioPlayer();
        OldMediaPlayer adaptedPlayer = new MediaPlayerAdapter();

        System.out.println("Using old player:");
        oldPlayer.playMP3("song.mp3");

        System.out.println("\nUsing adapted player:");
        adaptedPlayer.playMP3("video.mp4");
        adaptedPlayer.playMP3("movie.avi");
        adaptedPlayer.playMP3("audio.wav");
    }
}
