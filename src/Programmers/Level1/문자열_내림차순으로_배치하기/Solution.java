package Programmers.Level1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split, Comparator.reverseOrder());
        return String.join("", split);
    }
}
