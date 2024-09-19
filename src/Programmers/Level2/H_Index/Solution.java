package Programmers.Level2.H_Index;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        for (int i = 0; i < n; i++) if (citations[i] >= n - i) return n - i;

        return 0;
    }
}
