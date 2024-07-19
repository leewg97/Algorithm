package Programmers.Level1.문자열_내_p와_y의_개수;

public class Solution {
    boolean solution(String s) {
        if (s == null || s.isEmpty()) return true;

        String[] splitedString = s.toUpperCase().split("");

        int pCount = 0, yCount = 0;
        for (String string : splitedString) {
            if (string.equals("P")) pCount++;
            if (string.equals("Y")) yCount++;
        }

        return pCount == yCount;
    }
}
