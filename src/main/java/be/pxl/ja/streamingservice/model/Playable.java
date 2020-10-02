package be.pxl.ja.streamingservice.model;

public interface Playable {
    String getPlayingTime();
    void play();
    void pause();
}
