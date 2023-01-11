package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 기찍 N
public class BJ_2742 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        while(N > 0){
            System.out.println(N);
            N--;
        }

    }

}
