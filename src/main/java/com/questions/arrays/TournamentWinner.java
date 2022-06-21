package com.questions.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {
    public static String usingHashTable(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> scoreBoard = new HashMap<>(); // time: O(n) ; space: O(n)
        String winnigTeam = "";
        int winnigPoints = 0;

        for (int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);

            String winner = results.get(i) == 1 ? homeTeam : awayTeam;
            scoreBoard.put(winner, scoreBoard.getOrDefault(winner, 0) + 1);

            if (winnigPoints < scoreBoard.get(winner)) {
                winnigTeam = winner;
                winnigPoints = scoreBoard.get(winner);
            }
        }

        return winnigTeam;
    }
}
