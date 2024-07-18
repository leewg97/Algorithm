package Programmers.Level1.Most_Received_Gift;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        int length = friends.length;
        for (int i = 0; i < length; i++) map.put(friends[i], i);

        int[] index = new int[length];
        int[][] record = new int[length][length];

        for (String gift : gifts) {
            String[] part = gift.split(" ");
            String giver = part[0];
            String receiver = part[1];

            index[map.get(giver)]++;
            index[map.get(receiver)]--;
            record[map.get(giver)][map.get(receiver)]++;
        }

        int answer = 0;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (i == j) continue;
                if (record[i][j] > record[j][i]) count++;
                else if (record[i][j] == record[j][i] && index[i] > index[j]) count++;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }
}
