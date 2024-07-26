package Programmers.Level1.제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        list.remove(Collections.min(list));

        return list.stream().mapToInt(i -> i).toArray();
    }
}
