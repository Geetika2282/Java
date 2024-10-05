package TweetStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Sample tweets
        List<Tweet> tweets = Arrays.asList(
                new Tweet("Weather update", new Date(1, "October", 2024), 15000, Set.of("#weatherupdate", "#punerains")),
                new Tweet("Flood Alert", new Date(25, "September", 2024), 8000, Set.of("#sports", "#football")),
                new Tweet("Food Festival", new Date(2, "October", 2024), 12000, Set.of("#foodfestival", "#pune")),
                new Tweet("Tech Conference", new Date(15, "August", 2024), 5000, Set.of("#techconference", "#ai")),
                new Tweet("Flood Alert", new Date(3, "October", 2024), 25000, Set.of("#punerains", "#flood"))
        );

//  List all tweets that are posted in current month
        System.out.println("Tweets in current month: ");
        String currectMonth = "August";
        tweets.stream()
                .filter(t->t.getDateOfPost().getMonth().equalsIgnoreCase(currectMonth)).forEach(System.out::println);

        System.out.println("-------------Hashtags-------------");

//  List all the tweets for hashtag '#punerains'
        String hashtag = "#punerains";
        tweets.stream()
                .filter(t->t.getHashtags()
                        .contains(hashtag))
                        .forEach(System.out::println);

//  Count the tweets by subject
        System.out.println("-------------Tweet count-------------");
        Map<String, Long> tweetCountBySubject = tweets.stream()
                .collect(Collectors.groupingBy(Tweet::getSubject, Collectors.counting()));

        tweetCountBySubject.forEach((subject, count)->{
            System.out.println("Subject: " + subject + ", Count: "+count);
        });

//  List the tweets that got more than 10k views
        System.out.println("------------Views > 10000------------");
        tweets.stream()
                .filter(t->t.getNumberOfViews() > 10000)
                .forEach(System.out::println);

//  List the top 5 trending tweets
        System.out.println("------------Top 5 trending news------------");
        List<Tweet> top5Trending = tweets.stream()
                .sorted(Comparator.comparingLong(Tweet::getNumberOfViews).reversed())
                .limit(5)
                .collect(Collectors.toList());


        top5Trending.forEach(t-> System.out.println(t));
    }
}
