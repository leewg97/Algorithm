package Programmers.Level1.문자열_다루기_기본;

public class Solution {
    public boolean solution(String s) {
        try {
            Integer.parseInt(s);
            return (s.length() == 4 || s.length() == 6);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
