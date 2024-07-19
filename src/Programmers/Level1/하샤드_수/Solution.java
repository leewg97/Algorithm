package Programmers.Level1.하샤드_수;

public class Solution {
    public boolean solution(int x) {
        String[] split = String.valueOf(x).split("");

        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }

        return x % sum == 0;
    }
}
