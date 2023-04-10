package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 방번호
public class BJ_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replace('9', '6');    //9와 6을 하나로 봄(나중에 /2하면 됨)

        int[] num = new int[9];   //0~8의 int 배열 만들기

        for (int i = 0; i < str.length(); i++) {   //각 숫자별로 필요한 개수
            int temp = str.charAt(i) - '0';
            num[temp]++;
        }

        if (num[6] != 0) num[6] = (int) Math.round(num[6] / 2.0); //6은 나누기2를 한후 반올림

        int max = 0;    //가장 많이 중복되는 숫자
        for (int j : num) if (j > max) max = j;    // num 배열중 가장 큰수만큼 세트가 필요

        System.out.println(max);
    }
}
