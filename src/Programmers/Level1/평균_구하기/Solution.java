package Programmers.Level1.평균_구하기;

import java.util.Arrays;

public class Solution {
    public double solution1(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }

    public double solution2(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
