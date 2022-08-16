package BJ_2753;

import java.io.*;

// 윤년
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 1
        if (N % 4 == 0){
            if ( N % 400 == 0){
                System.out.println("1");
            } else if (N % 100 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }

        // 2
        if (N % 4 == 0 && N % 400 == 0) {
            System.out.println("1");
        } else if (N % 4 == 0 && N % 100 != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        // 3
        if (((N % 4) == 0 && (N % 100) != 0) || (N % 400 == 0))  {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
