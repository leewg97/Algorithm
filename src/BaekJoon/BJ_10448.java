package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 유레카
public class BJ_10448 {
    public static void main(String[] args) throws IOException {

        String inputData = """
        3
        10
        20
        1000
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] triNum = new int[45];
        for(int i = 1; i < 45; i++) {
            triNum[i] = i * (i + 1) / 2;
        }
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int result =  eureka(n, triNum);
            System.out.println(result);
        }
    }

    public static int eureka(int n, int[] triNum) {
        for(int j = 1; j < 45; j++) {
            for (int k = 1; k < 45; k++) {
                for (int z = 1; z < 45; z++) {
                    if ((triNum[j] + triNum[k] + triNum[z]) == n) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
