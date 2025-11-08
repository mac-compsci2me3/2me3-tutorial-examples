package Adapter;

public class MediaPlayerAdapter implements OldMediaPlayer {
    private AdvancedMediaPlayer advancedPlayer;

    public MediaPlayerAdapter() {
        advancedPlayer = new AdvancedPlayer();
    }

    @Override
    public void playMP3(String fileName) {
        if (fileName.endsWith(".mp4")) {
            advancedPlayer.playMP4(fileName);
        } else if (fileName.endsWith(".avi")) {
            advancedPlayer.playAVI(fileName);
        } else {
            System.out.println("Invalid format. Cannot play " + fileName);
        }
    }
}
