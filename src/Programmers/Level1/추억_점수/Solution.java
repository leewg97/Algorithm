package Programmers.Level1.추억_점수;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> memoryMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            memoryMap.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (memoryMap.containsKey(photo[i][j])) {
                     score += memoryMap.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }

        return answer;
    }
}
