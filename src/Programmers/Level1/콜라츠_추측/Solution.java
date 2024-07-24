package Programmers.Level1.콜라츠_추측;

class Solution {
    public int solution(long num) {
        int count = 0;

        while (num != 1) {
            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            count++;

            if (count >= 500) {
                count = -1;
                break;
            }
        }

        return count;
    }
}
