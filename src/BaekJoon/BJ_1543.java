package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 문서 검색
public class BJ_1543 {
    public static void main(String[] args) throws IOException {
        String inputData = """
                ababababa
                aba
                """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder doc = new StringBuilder();
        StringBuilder word = new StringBuilder();

        doc.append(br.readLine());
        word.append(br.readLine());

        int count = 0;
        int index = 0;
        while ((index = doc.toString().indexOf(word.toString())) != -1) {
            doc.delete(0, index + word.length());
            count++;
        }
        System.out.println(count);
    }
}
