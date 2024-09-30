package MediaP;

import java.util.ArrayList;
import java.util.List;

// Class to handle media playback
public class MediaPlayer {
    // Method to play a list of media items
    public void playMyList(List<? extends Media> medialist) {
        /*
         * When wildcard is used, the collection can't be modified (e.g., adding or removing elements).
         */

        // Iterate over the medialist and call play method for each media item
        for (Media m : medialist) {
            m.play(); // Call the play method of each media item
        }
    }

    // Main method to test the MediaPlayer functionality
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer(); // Create an instance of MediaPlayer
        List<Song> songs = new ArrayList<>(); // Create a list to hold Song objects

        // Add Song objects to the list
        songs.add(new Song(32, "Redecorate"));
        songs.add(new Song(44, "Demons"));
        songs.add(new Song(1, "People watching"));

        // Play the list of songs
        player.playMyList(songs);

        
    }
}
