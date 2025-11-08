package Adapter;

public class AdvancedPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    @Override
    public void playAVI(String fileName) {
        System.out.println("Playing AVI file: " + fileName);
    }
}
