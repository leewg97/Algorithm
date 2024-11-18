package Programmers.Level2.카펫;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int carpet = brown + yellow;

        // yellow가 존재하기 위해서는 가로와 세로의 길이가 3이상이여야 한다.
        for (int i = 3; i <= carpet; i++) {
            int row = carpet / i; // 가로 | i = 세로

            // 가로의 갯수가 3 이하라면 다음 인덱스
            if (row < 3) continue;

            // "가로는 세로의 길이보다 크거나 같다" 조건
            if ((row >= i) && ((row - 2) * (i - 2) == yellow)) {
                answer[0] = row;
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
