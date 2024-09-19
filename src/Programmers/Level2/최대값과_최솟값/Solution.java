package Programmers.Level2.최대값과_최솟값;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String solution(String str) {
        String[] split = str.split(" ");

        List<Integer> list = new ArrayList<>();
        for (String s : split) list.add(Integer.parseInt(s));

        Collections.sort(list);

        return list.get(0) + " " + list.get(list.size() - 1);
    }
}
