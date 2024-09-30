package Programmers.Level2.다음_큰_숫자;

public class Solution {
    public int solution(int n) {
        int binaryCount = Integer.bitCount(n);

        int var = n + 1;
        while (true) {
            if (binaryCount == Integer.bitCount(var)) break;
            var++;
        }
        return var;
    }
}
