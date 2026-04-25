package main.java;

import java.util.List;
import java.util.ArrayList;

class MusicPlayer {

    private List<Song> currentPlaylist;
    private int currentSongIndex;
    private final PlaylistLoader playlistLoader;

    public MusicPlayer(PlaylistLoader loader) {
        this.playlistLoader = loader;
        this.currentPlaylist = new ArrayList<>();
        this.currentSongIndex = -1;
    }

    public void loadPlaylist(String playlistName) {
        this.currentPlaylist = playlistLoader.load(playlistName);
        this.currentSongIndex = 0;
    }

    public void play() {
        if (currentPlaylist == null) { // 1 Punkt
            System.out.println("No playlist loaded."); // 1 Punkt
            return; // 1 Punkt
        }

        if (currentPlaylist.isEmpty()) {
            System.out.println("Playlist is empty. Nothing to play.");
            return;
        }

        Song currentSong = currentPlaylist.get(currentSongIndex);

        if (currentSong == null) { // 1 Punkt
            System.out.println("Skipping missing song"); // 1 Punkt
            next(); // 1 Punkt
            return; // 1 Punkt
        }

        System.out.println("Now playing: " + currentSong.title());
    }

    public void next() {
        if (currentPlaylist.isEmpty()) {
            System.out.println("Playlist is empty. Cannot skip forward.");
            return;
        }
        currentSongIndex++;
        if (currentSongIndex >= currentPlaylist.size()) {
            currentSongIndex = 0;
        }
        play();
    }

    public String getCurrentSongTitle() {
        return currentPlaylist.get(currentSongIndex).title();
    }
}

class PlaylistLoader {

    public List<Song> load(String playlistName) {
        if (playlistName.equals("Rock")) {
            List<Song> playlist = new ArrayList<>();
            playlist.add(new Song("Bohemian Rhapsody"));
            playlist.add(new Song("Highway to Hell"));
            return playlist;
        } else if (playlistName.equals("Pop")) {
            List<Song> playlist = new ArrayList<>();
            playlist.add(new Song("Drag Path"));
            playlist.add(null);
            playlist.add(new Song("Cruel Summer"));
            return playlist;
        }
        return null;
    }

}

record Song(String title) {
}

public class MusicApp {

    public static void main(String[] args) {
        PlaylistLoader loader = new PlaylistLoader();
        MusicPlayer player = new MusicPlayer(loader);

        player.loadPlaylist("Klassik");
        player.play();

        player.loadPlaylist("Pop");
        player.play();
        player.next();
        System.out.printf("---\nMy favourite song: %s", player.getCurrentSongTitle());
    }

}

// Gesamtpunktzahl: 7 Punkte