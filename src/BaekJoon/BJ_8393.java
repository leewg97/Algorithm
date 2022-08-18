package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 합
public class BJ_8393 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
