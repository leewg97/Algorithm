package Programmers.Level1.음양_더하기;

public class Solution {
    public int solution(int[] absoluter, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absoluter.length; i++) {
            if (signs[i]) answer += absoluter[i];
            else answer -= absoluter[i];
        }

        return answer;
    }
}
