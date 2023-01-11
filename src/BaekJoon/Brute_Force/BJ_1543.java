package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문서 검색
public class BJ_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String docs = br.readLine();
        String word = br.readLine();

        int count = 0;

        for (int i = 0; i <= docs.length() - word.length(); i++) {
            if (docs.substring(i, i + word.length()).equals(word)) { // subString(x, y) -> index x 위치에서 index y-1 위치 까지의 값을 리턴
                count++;
                i += word.length() - 1;
            }
        }
        System.out.println(count);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder doc = new StringBuilder();
//        StringBuilder word = new StringBuilder();
//
//        doc.append(br.readLine());
//        word.append(br.readLine());
//
//        int count = 0;
//        int index = 0;
//        while ((index = doc.toString().indexOf(word.toString())) != -1) {
//            doc.delete(0, index + word.length());
//            count++;
//        }
//        System.out.println(count);
    }
}
