package Adapter;

public class AudioPlayer implements OldMediaPlayer {
    @Override
    public void playMP3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}
