package Programmers.Level1.나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) if(i % divisor == 0) list.add(i);
        if (list.isEmpty()) return new int[]{-1};
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
