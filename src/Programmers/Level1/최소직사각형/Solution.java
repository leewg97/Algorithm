package Programmers.Level1.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {
        // 긴 쪽은 가로로, 짧은 쪽은 세로로
        int width = 0 ; // 가로
        int length = 0; // 세로
        for (int[] value : sizes) {
            if (value[0] > value[1]) {
                width = Math.max(width, value[0]);
                length = Math.max(length, value[1]);
            } else {
                width = Math.max(width, value[1]);
                length = Math.max(length, value[0]);
            }
        }
        return width * length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }
}
