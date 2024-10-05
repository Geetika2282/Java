package TweetStream;

import java.util.Set;

public class Tweet {
    private String subject;
    private Date dateOfPost;  // Custom Date class from TweetStream package
    private int numberOfViews;
    private Set<String> hashtags;

    // Constructor that initializes all fields
    public Tweet(String subject, Date dateOfPost, int numberOfViews, Set<String> hashtags) {
        this.subject = subject;
        this.dateOfPost = dateOfPost;
        this.numberOfViews = numberOfViews;
        this.hashtags = hashtags;
    }

    // Another constructor if needed
    public Tweet(String subject, Date dateOfPost) {
        this.subject = subject;
        this.dateOfPost = dateOfPost;
        this.numberOfViews = 0;  // Default number of views
        this.hashtags = Set.of(); // Default empty set of hashtags
    }

    // Getters
    public String getSubject() { return subject; }
    public Date getDateOfPost() { return dateOfPost; }
    public int getNumberOfViews() { return numberOfViews; }
    public Set<String> getHashtags() { return hashtags; }

    // Overriding toString to print the tweet details
    @Override
    public String toString() {
        return "Tweet{" +
                "subject='" + subject + '\'' +
                ", dateOfPost=" + dateOfPost +
                ", numberOfViews=" + numberOfViews +
                ", hashtags=" + hashtags +
                '}';
    }
}
