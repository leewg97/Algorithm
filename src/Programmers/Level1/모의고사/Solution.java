package Programmers.Level1.모의고사;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    static final int[] FIRST = {1, 2, 3, 4, 5};
    static final int[] SECOND = {2, 1, 2, 3, 2, 4, 2, 5};
    static final int[] THIRD = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int[] arr = new int[4];

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            if (FIRST[i % FIRST.length] == answer) arr[1]++;
            if (SECOND[i % SECOND.length] == answer) arr[2]++;
            if (THIRD[i % THIRD.length] == answer) arr[3]++;
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 1; i <= 3; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        List<Integer> results = new ArrayList<>();
        results.add(maxIndex);

        for (int i = 1; i <= 3; i++) {
            if (maxIndex == i) continue;
            if (arr[i] == arr[maxIndex]) results.add(i);
        }

        Collections.sort(results);
        return results.stream().mapToInt(value -> value).toArray();
    }
}
