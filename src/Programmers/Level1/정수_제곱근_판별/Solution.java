package Programmers.Level1.정수_제곱근_판별;

public class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 != 0) return -1;
        return (long) Math.pow(sqrt + 1, 2);
    }
}
