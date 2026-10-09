package TournamentLeaderboard;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class TournamentLeaderboard {

    public static void main(String[] args) {

        // Create HashMap to store player names and scores
        Map<String, Integer> leaderboard = new HashMap<>();

        // Add players and scores
        leaderboard.put("Rahul", 85);
        leaderboard.put("Priya", 95);
        leaderboard.put("Arjun", 72);
        leaderboard.put("Sneha", 95);
        leaderboard.put("Kiran", 88);

        // Display all players and scores
        System.out.println("Tournament Leaderboard");
        System.out.println();

        for (Map.Entry<String, Integer> entry : leaderboard.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Find highest score using Collections.max()
        int highestScore = Collections.max(leaderboard.values());

        System.out.println();
        System.out.println("Highest Score:");
        System.out.println(highestScore);

        // Remove Arjun
        leaderboard.remove("Arjun");

        // Display updated leaderboard
        System.out.println();
        System.out.println("After Removing Arjun:");
        System.out.println();

        for (Map.Entry<String, Integer> entry : leaderboard.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}