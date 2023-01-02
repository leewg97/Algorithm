package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합
public class BJ_11720 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        baekjoon
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < arr.length; i++) {  //문자열 str 에 각 문자의 위치를 가리킬 배열
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) { // charAt() 이라는 메소드를 사용하여 문자를 추출한 뒤 ch 라는 변수에 저장
            char ch = str.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }

        }

        for (int result : arr) {
            System.out.print(result + " ");
        }

    }
}
