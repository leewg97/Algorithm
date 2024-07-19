package Programmers.Level1.Running_Race;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> playerMap = new HashMap<>();
        HashMap<Integer, String> rankMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for (String calling : callings) {
            int currentRank = playerMap.get(calling);
            String player = rankMap.get(currentRank);
            String forePlayer = rankMap.get(currentRank - 1);

            playerMap.put(player, currentRank - 1);
            playerMap.put(forePlayer, currentRank);

            rankMap.put(currentRank - 1, player);
            rankMap.put(currentRank, forePlayer);
        }

        for (int i = 0; i < players.length; i++) {
            answer[i] = rankMap.get(i);
        }

        return answer;
    }
}
