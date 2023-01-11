package BaekJoon.Etc;

import java.io.*;

// N 찍기
public class BJ_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int i =  1;

        while(i <= N){
            System.out.println(i);
            i++;
        }
    }
}
