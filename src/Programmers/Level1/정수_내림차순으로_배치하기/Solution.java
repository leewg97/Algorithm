package Programmers.Level1.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public long solution(long n) {
        List<String> list = Arrays.asList(String.valueOf(n).split(""));

        list.sort(Comparator.reverseOrder());

        String join = String.join("", list);
        return Long.parseLong(join);
    }

}
