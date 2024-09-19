package Programmers.Level2.이진_변환_반복하기;

public class Solution {
    public int[] solution(String string) {
        int convertCnt = 0;
        int zeroCnt = 0;

        while (!string.equals("1")) {
            int length = string.length();
            string = string.replace("0", "");
            int newLength = string.length();

            zeroCnt += (length - newLength);
            string = Integer.toBinaryString(newLength);
            convertCnt++;
        }

        return new int[]{convertCnt, zeroCnt};
    }

}
