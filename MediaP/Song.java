package MediaP;

// Class representing a song, extending the Media abstract class
public class Song extends Media {
    private int srno; // Serial number of the song
    private String title; // Title of the song

    // Constructor to initialize the serial number and title
    public Song(int srno, String title) {
        this.srno = srno;
        this.title = title;
    }

    // Override toString method to provide a string representation of the Song object
    @Override
    public String toString() {
        return "Song [srno=" + srno + ", title=" + title + "]";
    }

    // Implement the play method for the Song class
    @Override
    public void play() {
        System.out.println("Playing a song: " + title);
    }
}
