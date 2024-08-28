package Programmers.Level1.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int sum = 0;
        for (int j : d) {
            if (sum + j <= budget) {
                sum += j;
                answer++;
            }
        }

        return answer;
    }

}
