package Programmers.Level1.x만큼_간격이_있는_n개의_숫자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public long[] solution(int x, int n) {
        List<Long> answer = new ArrayList<>();

        if (x >= 0) {
            for (long i = x; i <= (long) x * n; i = i + x) {
                answer.add(i);
                if (answer.size() == n) break;
            }
        } else {
            for (long i = x; i >= (long) x * n; i = i + x) {
                answer.add(i);
                if (answer.size() == n) break;
            }
        }

        return answer.stream().mapToLong(Long::valueOf).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] result = solution.solution(-4, 2);
        System.out.println(Arrays.toString(result));
    }
}
