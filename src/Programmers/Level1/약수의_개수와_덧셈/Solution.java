package Programmers.Level1.약수의_개수와_덧셈;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) list.add(j);
            }
            if (list.size() % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
}
