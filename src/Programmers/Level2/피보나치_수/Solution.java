package Programmers.Level2.피보나치_수;

public class Solution {
    public int solution(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1])% 1234567;
        }

        return (int) arr[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(100);
    }
}
