package Programmers;

import java.util.Arrays;

// 배열 자르기
public class Lv0_1 {

    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
        // Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
        // 값에 의한 복사이므로 복사된 배열에서 값을 바꿔도 원본 배열의 값이 바뀌지 않음
    }

}
