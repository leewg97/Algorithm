package Programmers.Level1.부족한_금액_계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i= 1 ; i <= count; i++) {
            answer += (long) price * i;
        }

        long total = money - answer;
        return total > 0 ? 0 : Math.abs(total);
    }
}
