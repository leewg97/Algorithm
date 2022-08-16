package BJ_1110;

import java.io.*;

//더하기 사이클
public class Main {

    public static void main(String[] args) throws IOException {

        String inputData = """
        71
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int updateNum = N;
        int count = 0;
        int A = 0;
        int B = 0;
        int C = 0;

        while (true) {
            A = updateNum / 10; // 10의 자리수
            B = updateNum % 10; // 1의 자리수
            C = (A + B) % 10;   // 두 자리 수를 더한 값의 1의 자리수
            updateNum = (B * 10) + C;   // 본래의 1의 자리수 X 10 + 두 자리 수를 더한 값의 1의 자리 수
            count++;
            if (updateNum == N) {
                break;
            }
        }
        System.out.println(count);
    }

}
